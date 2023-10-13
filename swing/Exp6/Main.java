package swing.Exp6;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    Main()
    {


        ImageIcon ico = new ImageIcon("G:\\code\\java\\Advanced-java\\swing\\Exp6\\send.png");
        JTextArea ja = new JTextArea(20, 30);
        JScrollPane jsp = new JScrollPane(ja);
        String items[] = {"niraj", "bava"};
        String langs[] = {"English", "Marathi", "Hindi", "Sanskrit"};
        JComboBox jb = new JComboBox(langs);
        JButton submit = new JButton(ico);
        JList list = new JList(items);

        jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        add(submit);
        add(jsp);
        add(jb);
        add(list);

        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
    }

    public static void main(String[] args) {
        new Main();
    }
}
