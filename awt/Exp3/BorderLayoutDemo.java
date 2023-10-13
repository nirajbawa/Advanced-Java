package awt.Exp3;

import java.awt.*;

public class BorderLayoutDemo extends Frame {
    BorderLayoutDemo()
    {
        setVisible(true);
        setSize(500, 500);
        setLayout(new BorderLayout());

        Button b1 = new Button("North");
        Button b2 = new Button("West");
        Button b3 = new Button("East");
        Button b4 = new Button("Center");
        Button b5 = new Button("South");

        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.WEST);
        add(b3, BorderLayout.EAST);
        add(b4, BorderLayout.CENTER);
        add(b5, BorderLayout.SOUTH);
    }
    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
