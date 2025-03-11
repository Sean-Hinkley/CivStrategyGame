package renderWindow.GameEnvironment.renderable.renderObject;

import java.awt.Color;
import java.awt.Graphics;

public class Rect extends Shape{

    @Override
    public void draw(Graphics pen, int x, int y, int w, int h) {
        pen.setColor(Color.red);
        pen.fillRect(x, y, w, h);
    }
    
}
