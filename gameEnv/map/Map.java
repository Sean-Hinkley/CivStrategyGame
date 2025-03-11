package gameEnv.map;

import java.awt.Graphics;

import renderWindow.GameEnvironment.renderable.renderObject.RenderObject;

public class Map extends RenderObject{
    private double scale = 1.0;
    private Tile[][] tiles;
    public Map(int x, int y, int w, int h) {
        super(x, y, w*128, h*128,null,null);
        tiles = new Tile[w][h];
        setTiles();
        //TODO Auto-generated constructor stub
    }

    public void setTiles() {
        for(int x = 0; x < tiles.length; x++) {
            for(int y = 0; y < tiles[0].length; y++) {
                //System.out.println();
                tiles[x][y] = new Tile(getObjX()+(x*128), getObjY()+(y*128));
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
    
}
