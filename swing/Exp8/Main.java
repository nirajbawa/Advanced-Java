package swing.Exp8;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    Main() {
        String data[][] = {{"1", "niraj", "co"}, {"2", "jay", "ce"}, {"1", "shyam", "ee"}};
        String col[] = {"s.no", "name", "branch"};
        JTable tb = new JTable(data, col);
        JScrollPane jp = new JScrollPane(tb);
        
        add(jp);

        setVisible(true);
        setSize(500, 500);
    }

    public static void main(String[] args) {
        new Main();
    }
}
