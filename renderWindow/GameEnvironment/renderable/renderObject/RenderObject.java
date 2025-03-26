package renderWindow.GameEnvironment.renderable.renderObject;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import renderWindow.KeyPressHandler;
import renderWindow.GameEnvironment.drawObject;
import renderWindow.GameEnvironment.renderable.Renderable;
public class RenderObject extends Renderable {
    private BufferedImage image;
    private Color color;
    private Shape shape;
    public RenderObject(int x, int y, int w, int h, Shape s, Color c, KeyPressHandler k,drawObject d) {
        super(x, y, w, h,k,d);
        color = c;
        shape = s;
    }

    public RenderObject(int x, int y, int w, int h, Image im, Color c, KeyPressHandler k,drawObject d) {
        super(x, y, w, h,k,d);
        color = c;
        shape = im;
    }
    public void draw(Graphics pen) {shape.draw(pen, this);}
    public void update() {
        keyActions();
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color c) {color = c;}

    public void setKeys() {}

    public void keyActions() {}
    public Shape getShape() {return shape;}
    public void setShape(Shape s) {shape = s;}
    

}
