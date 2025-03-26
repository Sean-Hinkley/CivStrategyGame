package gameEnv;

import java.util.ArrayList;

import gameEnv.mainMenu.MainMenu;
import gameEnv.map.Camera;
import gameEnv.map.Map;
import renderWindow.GameEnvironment.GameEnvironment;
import renderWindow.GameEnvironment.drawObject;
//import renderWindow.GameEnvironment.renderable.renderObject.RenderObject;
import renderWindow.GameEnvironment.renderable.renderScreen.RenderScreen;

public class StrategyGame extends GameEnvironment{
    public StrategyGame(int w, int h) {
        super(w, h);
        setEnv();
        run();
    }

    public void setEnv() {
        clearLoop();
        RenderScreen mainmenu = new MainMenu(getObjW(), getObjH(), getkeys(),this);
        addRenderable(mainmenu);
        setRendering(mainmenu);
        
    }

    public void setKeys() {
        this.getkeys().addKey(27, "esc");
    }

    public void keyActions() {
        ArrayList<String> k = getkeys().getAllPressed();
        for(String s: k) {
            if(s.equals("esc")) {
                
                setEnv();
            }
        }
    }

    public static void main(String[] args) {
        StrategyGame sg = new StrategyGame(1700, 900);
        sg.inputs();
    }  
}
