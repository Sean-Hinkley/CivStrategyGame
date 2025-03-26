package renderWindow.GameEnvironment.renderable.renderObject;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Image extends Shape{
    BufferedImage image;

    public Image(BufferedImage bi) {
        image = bi;
    }
    @Override
    public void draw(Graphics pen, RenderObject ro) {
        
        pen.drawImage(image, ro.getObjX(), ro.getObjY(),ro.getObjW(),ro.getObjH(), null);
    }

    @Override
    public void draw(Graphics pen, RenderObject ro, int x, int y) {
        
        pen.drawImage(image, x, y,ro.getObjW(),ro.getObjH(), null);

    }
    
}
