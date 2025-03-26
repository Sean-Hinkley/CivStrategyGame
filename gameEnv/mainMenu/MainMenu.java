package gameEnv.mainMenu;

import java.awt.Color;
import java.awt.Font;

import renderWindow.KeyPressHandler;
import renderWindow.GameEnvironment.drawObject;
import renderWindow.GameEnvironment.renderable.renderObject.Rect;
import renderWindow.GameEnvironment.renderable.renderObject.RenderString;
import renderWindow.GameEnvironment.renderable.renderObject.Text;
import renderWindow.GameEnvironment.renderable.renderObject.TextBox;
import renderWindow.GameEnvironment.renderable.renderScreen.RenderScreen;

public class MainMenu extends RenderScreen{

    public MainMenu(int w, int h, KeyPressHandler k,drawObject d) {
        super(w, h, k,d);
        String text = "Algerian";
        int type = Font.BOLD;
        int size = 50;
        addObj(new RenderString(450, 75, 0, 0, new Text("Civil Judgments"), Color.blue, k, d));
        addObj(new Button(450, 300, new TextBox("Play"), Color.red, k,this));
    }
    

    public String toString() {
        return "Parent:  " + getParent();
    }
}
