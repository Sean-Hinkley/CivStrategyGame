package renderWindow;

import javax.swing.JFrame;
import javax.swing.JPanel;

import renderWindow.GameEnvironment.GameEnvironment;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
public class Window implements KeyListener, MouseListener, MouseMotionListener,MouseWheelListener{
    JFrame frame;
    GameEnvironment game;
    GamePanel panel;
    public Window(int w, int h, GameEnvironment g) {
        frame = new JFrame();
        game = g;
        frame.setSize(w, h);
        panel = new GamePanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setVisible(true);
    }

    public void run() {
        while(true) {
            game.update();
            try { Thread.sleep(10); }
            catch (InterruptedException e) {}
            frame.repaint();
        }
    }

    public class GamePanel extends JPanel {
        private static final long serialVersionUID = 1L;
        @Override
        public void paintComponent(Graphics g) { game.draw(g); }
    }

    public void mouseWheelMoved(MouseWheelEvent e) {if(game!=null) game.mouseWheelMoved(e);}
    public void mouseDragged(MouseEvent e) {}
    public void mouseMoved(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void keyTyped(KeyEvent e) {}
    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}
}