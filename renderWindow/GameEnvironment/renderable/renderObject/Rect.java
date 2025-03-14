package renderWindow.GameEnvironment.renderable.renderObject;

import java.awt.Color;
import java.awt.Graphics;

public class Rect extends Shape{

    @Override
    public void draw(Graphics pen, RenderObject ro) {
        pen.setColor(ro.);
        pen.fillRect(ro.getObjX(),ro.getObjY(),ro.getObjW(),ro.getObjH());
    }
    
}
