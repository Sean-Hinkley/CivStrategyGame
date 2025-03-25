package gameEnv.map;

import java.awt.Color;
import java.awt.Graphics;

import renderWindow.KeyPressHandler;
import renderWindow.GameEnvironment.renderable.renderObject.Rect;
import renderWindow.GameEnvironment.renderable.renderObject.RenderObject;

public class Tile extends RenderObject{
    private double scale = 1.0;
    public Tile(int x, int y, KeyPressHandler k) {
        super(x, y, 128,128,new Rect(),Color.blue,k);
        int r = (int) (Math.random() * 255);
        int g = (int) (Math.random() * 255);
        int b = (int) (Math.random() * 255);

        
        Color c = new Color(r,g,b);
        this.setColor(c);
    }

    public void draw(Graphics pen) {
        super.draw(pen);
        pen.setColor(Color.white);
        pen.drawRect(getObjX(), getObjY(), getObjW(), getObjH());
    }

    public void draw(Graphics pen, int x, int y) {
        this.getShape().draw(pen, this, x, y);
        pen.setColor(Color.white);
        pen.drawRect(x, y, getObjW(), getObjH());
    }
    
}
