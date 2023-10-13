package EventHandling.Exp13;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class keyAdapter extends Frame {
     String msg = "";
    keyAdapter()
    {
        TextField text = new TextField(100);

        text.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                msg += e.getKeyChar();
                repaint();
            }
        });

        add(text);

        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(msg, 250, 250);
    }

    public static void main(String[] args) {
        new keyAdapter();
    }
}
