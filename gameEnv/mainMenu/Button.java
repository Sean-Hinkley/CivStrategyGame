package gameEnv.mainMenu;

import java.awt.Color;
import java.awt.image.renderable.RenderableImage;

import gameEnv.map.Camera;
import gameEnv.map.Map;
import renderWindow.KeyPressHandler;
import renderWindow.GameEnvironment.GameEnvironment;
import renderWindow.GameEnvironment.drawObject;
import renderWindow.GameEnvironment.renderable.Renderable;
import renderWindow.GameEnvironment.renderable.renderObject.RenderObject;
import renderWindow.GameEnvironment.renderable.renderObject.Shape;
import renderWindow.GameEnvironment.renderable.renderObject.TextBox;
import renderWindow.GameEnvironment.renderable.renderScreen.RenderScreen;

public class Button extends RenderObject{
    


    public Button(int x, int y, Shape s, Color c, KeyPressHandler k,drawObject d) {
        super(x, y, 0, 0, s, c, k,d);
        int w = (((TextBox)getShape()).getString().length()) * ((TextBox)getShape()).getSize();
        int h = ((TextBox)getShape()).getSize() + 15;
        this.setObjW(w);
        this.setObjH(h);
        //TODO Auto-generated constructor stub
    }

    public void clicked() {
        drawObject dtmp = getParent();
        
        drawObject ddtmp = ((Renderable)dtmp).getParent();
        ((GameEnvironment)ddtmp).setRendering((RenderScreen)(dtmp));
        RenderScreen r = new RenderScreen(getObjW(), getObjH(),((GameEnvironment)ddtmp).getkeys(),this);
        Map m = new Map(0,0,10,10,((GameEnvironment)ddtmp).getkeys(),r);
        Camera cam = new Camera(400, 500, dtmp.getObjW(), dtmp.getObjH(), ((GameEnvironment)ddtmp).getkeys(), m,ddtmp);


        ((GameEnvironment)ddtmp).addRenderable(r);
        r.addObj(cam);
        ((GameEnvironment)ddtmp).setRendering(r);

    }
}
