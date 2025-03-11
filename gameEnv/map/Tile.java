package gameEnv.map;

import java.awt.Color;
import java.awt.Graphics;

import renderWindow.GameEnvironment.renderable.renderObject.Rect;
import renderWindow.GameEnvironment.renderable.renderObject.RenderObject;

public class Tile extends RenderObject{
    private double scale = 1.0;
    public Tile(int x, int y) {
        super(x, y, 128,128,new Rect(),null);
    }

    public void draw(Graphics pen) {
        super.draw(pen);
        pen.setColor(Color.BLACK);
        pen.drawRect(getObjX(), getObjY(), getObjW(), getObjH());
    }
    
}
