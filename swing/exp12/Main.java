package swing.exp12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main extends JFrame {
    String str = "";
    String pass = "";
    Main() {
        JTextField jf = new JTextField("Name", 30);
        JPasswordField jp = new JPasswordField("password", 30);
        JButton submit = new JButton("Submit");

        JLabel lb1 = new JLabel(str);
        JLabel lb2 = new JLabel(pass);



        jf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                str += e.getKeyChar();
                lb1.setText(str);
            }
        });

        jp.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                pass += e.getKeyChar();
                lb2.setText(pass);
            }
        });

        add(jf);
        add(jp);
        add(submit);
        add(lb1);
        add(lb2);

        setLayout(new GridLayout(5, 2));
        setSize(500, 500);
        setVisible(true);


    }
    public static void main(String[] args) {
        new Main();
    }
}
