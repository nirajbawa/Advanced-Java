package EventHandling.Exp13;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapterDemo extends Frame {
    String text = "";
    MouseAdapterDemo()
    {

        addMouseListener(
                new MouseAdapter()
                {
                    public void mouseEntered(MouseEvent e)
                    {
                       text = "Mouse Entered";
                       repaint();
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        text = "mouse Exited";
                        repaint();
                    }

                }
        );

        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(text, 250, 250);
    }

    public static void main(String[] args) {
        new MouseAdapterDemo();
    }
}
