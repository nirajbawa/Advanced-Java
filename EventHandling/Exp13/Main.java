package EventHandling.Exp13;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends Frame {
    Main()
    {

        addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                }
        );

        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
    }
    public static void main(String[] args) {
        new Main();
    }
}
