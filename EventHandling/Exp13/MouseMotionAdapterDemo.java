package EventHandling.Exp13;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MouseMotionAdapterDemo extends Frame {
    int x, y;
    MouseMotionAdapterDemo()
    {

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });

        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
        setTitle("Window Adapter");

    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(x, y, 20, 20);
    }

    public static void main(String[] args) {
        new MouseMotionAdapterDemo();
    }
}
