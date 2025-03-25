package renderWindow.GameEnvironment.renderable.renderObject;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import renderWindow.KeyPressHandler;
import renderWindow.GameEnvironment.renderable.Renderable;
public class RenderObject extends Renderable {
    private Color color;
    private Shape shape;
    public RenderObject(int x, int y, int w, int h, Shape s, Color c, KeyPressHandler k) {
        super(x, y, w, h,k);
        color = c;
        shape = s;
    }
    public void draw(Graphics pen) {shape.draw(pen, this);}
    public void update() {
        //System.out.println("hellosss");
        keyActions();
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color c) {color = c;}

    public void setKeys() {}

    public void keyActions() {}
    public Shape getShape() {return shape;}

}
