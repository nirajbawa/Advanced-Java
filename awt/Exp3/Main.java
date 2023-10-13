package awt.Exp3;

import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;

public class Main extends Frame {
    Main(String title)
    {
        super(title);
        setVisible(true);
        setSize(550,700);
        setLayout(new GridLayout(2, 1, 0, 0));

        Panel p1 = new Panel(new FlowLayout());
        Panel p2 = new Panel(new GridLayout(5, 4));


        TextArea text = new TextArea();

        p1.add(text);

        String buttonsText[] = {"%", "CE", "C", "<-", "7", "8", "9", "*", "4", "5", "5", "-", "1", "2", "3", "+", "/", "0", ".", "="};

        for(int i = 0; i<buttonsText.length; i++)
        {
            p2.add(new Button(buttonsText[i]));
        }

        add(p1); add(p2);
    }
    public static void main(String args[])
    {
        Main m1 = new Main("calculator");
    }
}
