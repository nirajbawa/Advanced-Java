package EventHandling.Exp11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerEventDemo extends Frame implements ActionListener {
    Button b1, b2, b3;
    public ActionListenerEventDemo()
    {

        b1 = new Button("Red");
        b2 = new Button("Blue");
        b3 = new Button("Green");


        add(b1); add(b2); add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Red")){
            setBackground(Color.RED);
        } else if (e.getActionCommand().equals("Blue")) {
            setBackground(Color.BLUE);
        }
        else if(e.getActionCommand().equals("Green"))
        {
            setBackground(Color.GREEN);
        }
    }
    public static void main(String[] args) {
        new ActionListenerEventDemo();
    }
}
