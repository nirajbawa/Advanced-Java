package EventHandling.Exp11;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main extends Frame implements MouseListener {
    Label l;
    public Main()
    {
        l = new Label("Hello!", Label.CENTER);
        l.addMouseListener(this);
        add(l);
        setVisible(true);
        setSize(500, 500);
    }

    public void mouseClicked(MouseEvent e)
    {
        l.setText("mouseClicked");
    }

    public void mouseEntered(MouseEvent e)
    {
        l.setText("mouseEntered");
    }

    public void mouseExited(MouseEvent e)
    {
        l.setText("mouseExited");
    }

    public void mousePressed(MouseEvent e)
    {
        l.setText("mousePressed");
    }

    public void mouseReleased(MouseEvent e)
    {
        l.setText("mouseReleased");
    }

    public static void main(String[] args) {
        new Main();
    }
}
