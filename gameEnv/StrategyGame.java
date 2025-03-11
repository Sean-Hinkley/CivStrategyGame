package gameEnv;

import renderWindow.GameEnvironment.GameEnvironment;
import renderWindow.GameEnvironment.renderable.renderObject.RenderObject;
import renderWindow.GameEnvironment.renderable.renderScreen.RenderScreen;

public class StrategyGame extends GameEnvironment{

    public StrategyGame(int w, int h) {
        super(w, h);
        RenderScreen rs = new RenderScreen(100,100);
        addRenderable(rs);
        rs.addObj(new RenderObject(300,100,100,100));

        run();
    }

    public static void main(String[] args) {
        StrategyGame sg = new StrategyGame(1700, 900);
        sg.inputs();
    }  
}
