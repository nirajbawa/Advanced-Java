package swing.Exp9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
    JButton submit = new JButton("Submit");
    JProgressBar jp;
    int btn = 0;
    Main(String title)
    {
        super(title);

        jp = new JProgressBar(0, 100);
        submit.addActionListener(this);
        jp.setStringPainted(true);
        jp.setValue(0);

        add(jp);
        add(submit);

        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
    }


    class MyThread extends Thread {


        public void run() {
            for (int i = 0; i <= 100; i++) {
                jp.setValue(i);
                try {
                    Thread.sleep(15);
                } catch (Exception e) {
                    System.out.println(e);
                }

            }
            btn = 0;
        }

    }

    public void actionPerformed(ActionEvent e)
    {
        if(btn==0)
        {
            MyThread t1 = new MyThread();
            t1.start();
            btn = 1;
        }

    }
    public static void main(String[] args) {
        new Main("Progress Bar");
    }
}
