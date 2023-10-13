package EventHandling.Exp11;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMotionEventDemo extends Frame implements MouseMotionListener {
    int x, y;
    String text = "hii";
    MouseMotionEventDemo()
    {


        addMouseMotionListener(this);
        setVisible(true);
        setSize(500, 500);
        setLayout(null);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString(text, 250, 250);
        g.fillOval(x, y, 20, 20);
    }

    @Override
    public void mouseDragged(MouseEvent e)
    {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        text = "Y : "+ Integer.toString(e.getY()) + " X :"+Integer.toString(e.getX());
        repaint();
    }

    public static void main(String[] args) {
        new MouseMotionEventDemo();
    }
}
