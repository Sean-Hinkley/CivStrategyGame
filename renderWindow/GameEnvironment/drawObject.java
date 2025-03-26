package renderWindow.GameEnvironment;

import java.awt.Graphics;

public interface drawObject {
    public void draw(Graphics pen);
    public void update();

    public int getObjX();
    public void setObjX(int x);

    public int getObjY();
    public void setObjY(int y);

    public int getObjW();
    public void setObjW(int w);

    public int getObjH();
    public void setObjH(int h);
}
