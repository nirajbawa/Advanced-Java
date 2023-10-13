package awt.Exp4;

import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends Frame {
    Main(String title)
    {
        super(title);
        setVisible(true);
        setSize(500, 500);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        Panel p0 = new Panel();
        CardLayout lay = new CardLayout();
        p0.setLayout(lay);


        Panel p1 = new Panel();
        Panel p2 = new Panel();

        Button b1 = new Button("Windows");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lay.show(p0, "p1");
            }
        });
        Button b2 = new Button("Linux");
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lay.show(p0, "p2");
            }
        });

        TextArea t1 = new TextArea("Windows");
        TextArea t2 = new TextArea("Linux");

        p1.add(t1);
        p2.add(t2);

        p0.add(p1, "p1");
        p0.add(p2, "p2");

        add(b1);
        add(b2);
        add(p0);



    }
    public static void main(String[] args) {
        new Main("CardLayout");
    }
}
