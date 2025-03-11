package renderWindow.GameEnvironment.renderable.renderObject;

import java.awt.Color;
import java.awt.Graphics;

public class Oval extends Shape{

    @Override
    public void draw(Graphics pen, RenderObject ro) {
        pen.setColor(Color.blue);
        pen.fillOval(ro.getObjX(), ro.getObjY(), ro.getObjW(), ro.getObjH());
    }
    
}
