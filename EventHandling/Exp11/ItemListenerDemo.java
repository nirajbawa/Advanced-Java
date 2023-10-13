package EventHandling.Exp11;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemListenerDemo extends Frame implements ItemListener {
    Checkbox c1, c2;

    Choice dropDown;

    String msg = "";
    public ItemListenerDemo()
    {

        c1 = new Checkbox("c1");
        c2 = new Checkbox("c2");

        c1.addItemListener(this);
        c2.addItemListener(this);

        add(c1); add(c2);


        dropDown = new Choice();

        dropDown.add("a1");
        dropDown.add("a2");

        add(dropDown);

        dropDown.addItemListener(this);

        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
    }

    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource()==c1)
        {
            msg = "state of c1 : "+e.getStateChange();
            repaint();
        }
        else if(e.getSource()==c2){
            msg = "state of c2 : "+e.getItem();
            repaint();
        }
        else if(e.getSource()==dropDown)
        {
            msg = "state of DropDown : "+e.getItem();
            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(msg, 250, 250);
    }

    public static void main(String[] args) {
        new ItemListenerDemo();
    }
}
