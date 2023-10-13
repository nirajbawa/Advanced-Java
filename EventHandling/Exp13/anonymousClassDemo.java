package EventHandling.Exp13;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class anonymousClassDemo extends Frame {
    String male, female;
    Frame f;
    anonymousClassDemo()
    {
        f = this;
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox c1, c2;
        c1 = new Checkbox("male", cbg, false);
        c2 = new Checkbox("female", cbg, false);
        Button submit = new Button("submit");

        c1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                male = Integer.toString(e.getStateChange());
                repaint();
            }
        });

        c2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                female = Integer.toString(e.getStateChange());
                repaint();
            }
        });

        submit.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Dialog d = new Dialog(f, "dialog", true);
                        d.add(new Label("niraj bava", Label.CENTER));
                        d.setSize(200, 200);
                        d.setVisible(true);

                    }
                }
        );


        add(c1);
        add(c2);
        add(submit);


        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());


    }

    @Override
    public void paint(Graphics g) {
        g.drawString("male : "+male, 250, 250);
        g.drawString("female : "+female, 250, 280);
    }

    public static void main(String[] args) {
        new anonymousClassDemo();
    }
}
