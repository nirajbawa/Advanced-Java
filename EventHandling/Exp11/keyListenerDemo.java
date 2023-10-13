package EventHandling.Exp11;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyListenerDemo extends Frame implements KeyListener
{
    String msg = "";
    keyListenerDemo()
    {

        addKeyListener(this);

        msg = "key pressed : ";

        setVisible(true);
        setSize(500, 500);
    }
    public static void main(String[] args) {
        new keyListenerDemo();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        msg = Character.toString(e.getKeyChar()) + " keyPressed ";
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        msg = Character.toString(e.getKeyChar()) + " keyReleased ";
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        msg = Character.toString(e.getKeyChar()) + " keyTyped ";
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(msg, 250, 250);
    }
}
