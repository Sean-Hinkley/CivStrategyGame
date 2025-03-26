package gameEnv.map;

import java.awt.Graphics;

import gameEnv.map.TileBiomes.GrassBiome;
import gameEnv.map.TileBiomes.LakeBiome;
import gameEnv.map.TileBiomes.SandBiome;
import gameEnv.map.TileBiomes.TileBiome;
import renderWindow.KeyPressHandler;
import renderWindow.GameEnvironment.drawObject;
import renderWindow.GameEnvironment.renderable.renderObject.RenderObject;

public class Map extends RenderObject{
    private double scale = 1.0;
    private Tile[][] tiles;
    private int size = 128;
    public Map(int x, int y, int w, int h, KeyPressHandler k,drawObject d) {
        super(x, y, w*128, h*128,null,null,k,d);
        tiles = new Tile[w][h];
        setTiles();
        //TODO Auto-generated constructor stub
    }

    public void setTiles() {
        for(int x = 0; x < tiles.length; x++) {
            for(int y = 0; y < tiles[0].length; y++) {
                tiles[x][y] = new Tile(x, y,this.getKeys(),(drawObject)this,randBiome());
            }
        }
    }

    public TileBiome randBiome() {
        int rand = (int)(Math.random()*2);
        switch (rand) {
            case 0:
                return new SandBiome();
            case 1:
                return new GrassBiome();
            case 2:
                return new LakeBiome();

        }

        return null;
    }

    public void draw(Graphics pen) {
        for(int x = 0; x < tiles.length; x++) {
            for(int y = 0; y < tiles[0].length; y++) {
                if(tiles[x][y]!=null) {
                    tiles[x][y].draw(pen);
                }
            }
        }
    }

    public void drawCutArea(Graphics pen, int x, int y, int w, int h) {
        int tilex = getTileX(x);
        int leftX = x % (int)(size*scale);
        int tiley = getTileY(y);
        int leftY = y % (int)(size*scale);
        int tilew = (int)(w/(scale*size));
        int tileh = (int)(h/(scale*size));
        Tile[][] view = getView(tilex, tiley, tilew, tileh);
        for(int r = 0; r < tilew; r++) {
            for(int c = 0; c < tileh; c++) {
                int finx = (int)(r*(size*scale) - leftX);
                int finy = (int)(c*(size*scale) - leftY);
                Tile t = view[r][c];
                if(t!=null) t.draw(pen,finx,finy);
            }
        }
    }

    public Tile[][] getView(int x, int y, int w, int h) {
        Tile[][] tile = new Tile[w][h];

        for(int r = 0; r < w; r++) {
            for(int c = 0; c < h; c++) {
                tile[r][c] = getTile(x+r, y+c);
            }
        }


        return tile;
    }

    



    public Tile getTile(int x, int y) {
        if(x >= 0 && x < tiles.length && y >= 0 && y < tiles[x].length) {
            return tiles[x][y];
        }
        return null;
    }

    public int getTileX(int x) {return (int) (x/(scale*size));}
    public int getTileY(int y) {return (int) (y/(scale*size));}
}
