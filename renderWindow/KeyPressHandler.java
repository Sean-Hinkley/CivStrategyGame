package renderWindow;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class KeyPressHandler {
    private ArrayList<Key> keys;

    public KeyPressHandler() {
        keys = new ArrayList<>();
    }


    public void keyPressed(KeyEvent e) {
        int c = e.getKeyCode();
        for(Key k: keys) {
            k.press(c);
        }
    }
    public void keyReleased(KeyEvent e) {
        int c = e.getKeyCode();
        for(Key k: keys) {
            k.release(c);
        }
    }

    public void addKey(int c, String a) {
        Key n = new Key(c, a);
        keys.add(n);
    }


    public ArrayList<String> getAllPressed() {
        ArrayList<String> tmplist = new ArrayList<>();
        for(Key k: keys) {
            if(k.getstate()) {
                tmplist.add(k.getAction());
            }
        }

        return tmplist;
    }


    public class Key {
        private int code;
        private String action;
        private boolean state = false;
        public Key(int c, String a) {
            code = c;
            action = a;
            
        }
        public void press(int c) {
            if(code == c) {
                
                state = true;
            }
            
        }
        public void release(int c) {
            if(code == c) {
                
                state = false;
            }
        }
        public int getCode() {return code;}
        public String getAction() {return action;}
        public boolean getstate() {return state;}
    }
}
