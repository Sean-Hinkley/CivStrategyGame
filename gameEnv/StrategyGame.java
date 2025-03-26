package gameEnv;

import java.util.ArrayList;

import gameEnv.map.Camera;
import gameEnv.map.Map;
import renderWindow.GameEnvironment.GameEnvironment;
//import renderWindow.GameEnvironment.renderable.renderObject.RenderObject;
import renderWindow.GameEnvironment.renderable.renderScreen.RenderScreen;

public class StrategyGame extends GameEnvironment{
    Camera cam;
    Map m;
    public StrategyGame(int w, int h) {
        super(w, h);
        RenderScreen r = new RenderScreen(w, h,getkeys());
        RenderScreen mainmenu = new RenderScreen(w, h, getkeys());
        m = new Map(0,0,10,10,this.getkeys());
        cam = new Camera(400, 500, w, h, getkeys(), m);
        addRenderable(mainmenu);
        addRenderable(r);
        setRendering(mainmenu);
        r.addObj(cam);

        run();
    }

    public static void main(String[] args) {
        StrategyGame sg = new StrategyGame(1700, 900);
        sg.inputs();
    }  
}
