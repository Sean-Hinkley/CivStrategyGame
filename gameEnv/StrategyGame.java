package gameEnv;

import gameEnv.map.Map;
import renderWindow.GameEnvironment.GameEnvironment;
//import renderWindow.GameEnvironment.renderable.renderObject.RenderObject;
import renderWindow.GameEnvironment.renderable.renderScreen.RenderScreen;

public class StrategyGame extends GameEnvironment{

    public StrategyGame(int w, int h) {
        super(w, h);
        RenderScreen r = new RenderScreen(w, h);
        Map m = new Map(0,0,5,5);
        addRenderable(r);
        r.addObj(m);

        run();
    }

    public static void main(String[] args) {
        StrategyGame sg = new StrategyGame(1700, 900);
        sg.inputs();
    }  
}
