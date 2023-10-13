package EventHandling.Exp11;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowListenerDemo extends Frame implements WindowListener {

    String msg = "";
    WindowListenerDemo()
    {
        addWindowListener(this);
       setVisible(true);
       setSize(500, 500);
    }

    @Override
    public void windowActivated(WindowEvent e) {
        msg += "windowActivated ";
        repaint();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        msg += "windowClosed ";
        repaint();
    }

    @Override
    public void windowClosing(WindowEvent e) {
        msg += "windowClosing ";
        repaint();
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        msg += "windowDeactivated ";
        repaint();
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        msg += "windowDeiconified ";
        repaint();
    }

    @Override
    public void windowIconified(WindowEvent e) {
        msg += "windowIconified ";
        repaint();
    }

    @Override
    public void windowOpened(WindowEvent e) {
        msg += "windowOpened ";
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(msg, 250, 250);
    }

    public static void main(String[] args) {
        new WindowListenerDemo();
    }
}
