package awt.Exp5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class ScrollBarDemo extends Frame implements AdjustmentListener{

    Scrollbar red, blue, green;
    Label b1, b2, b3;
    ScrollBarDemo()
    {
        red = new Scrollbar(Scrollbar.HORIZONTAL, 2, 20, 0, 255);
        green = new Scrollbar(Scrollbar.HORIZONTAL, 2, 20, 0, 255);
        blue = new Scrollbar(Scrollbar.HORIZONTAL, 2, 20, 0, 255);

        b1 = new Label();
        b2 = new Label();
        b3 = new Label();

        Panel con = new Panel();

        Panel scs = new Panel();


        scs.setLayout(new BoxLayout(scs, BoxLayout.Y_AXIS));


        scs.add(red);

        scs.add(green);

        scs.add(blue);

        green.addAdjustmentListener(this);
        red.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);



        add(scs);


        con.setLayout(new FlowLayout());

        con.add(b1);
        con.add(b2);
        con.add(b3);


        add(con);

        setVisible(true);
        setSize(700, 500);
        setLayout(new GridLayout(3, 1));
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        b1.setText("Red : " + Integer.toString(red.getValue()));
        b2.setText("Green : " + Integer.toString(green.getValue()));
        b3.setText("Blue : " + Integer.toString(blue.getValue()));
        Color c = new Color(red.getValue(), green.getValue(), blue.getValue());
        setBackground(c);
    }

    public static void main(String[] args) {
        new ScrollBarDemo();
    }
}
