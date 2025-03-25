package gameEnv.map;

import java.awt.Graphics;

import renderWindow.KeyPressHandler;
import renderWindow.GameEnvironment.renderable.renderObject.RenderObject;

public class Map extends RenderObject{
    private double scale = 1.0;
    private Tile[][] tiles;
    private int size = 128;
    public Map(int x, int y, int w, int h, KeyPressHandler k) {
        super(x, y, w*128, h*128,null,null,k);
        tiles = new Tile[w][h];
        setTiles();
        //TODO Auto-generated constructor stub
    }

    public void setTiles() {
        for(int x = 0; x < tiles.length; x++) {
            for(int y = 0; y < tiles[0].length; y++) {
                //System.out.println();
                tiles[x][y] = new Tile(getObjX()+(x*128), getObjY()+(y*128),this.getKeys());
            }
        }
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
        if(x > 0 && x < tiles.length && y > 0 && y < tiles[x].length) {
            return tiles[x][y];
        }
        return null;
    }

    public int getTileX(int x) {return (int) (x/(scale*size));}
    public int getTileY(int y) {return (int) (y/(scale*size));}
}
