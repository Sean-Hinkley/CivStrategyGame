package renderWindow.GameEnvironment.renderable.renderObject;

import java.awt.Color;

import renderWindow.KeyPressHandler;
import renderWindow.GameEnvironment.drawObject;

public class RenderString extends RenderObject {

    public RenderString(int x, int y, int w, int h, Text im, Color c, KeyPressHandler k, drawObject d) {
        super(x, y, w, h, im, c, k, d);
    }
    
}
