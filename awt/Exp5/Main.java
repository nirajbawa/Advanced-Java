package awt.Exp5;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;


class OpenDialog extends Dialog{
    OpenDialog(Frame parent, String title, boolean model)
    {
        super(parent, title, model);
        add(new Label("this is Dialog box", Label.CENTER));
        setSize(200, 200);
        setLayout(new CardLayout());
    }
}

public class Main extends Frame {
    String msg = "Hello";
    Main(String title)
    {
        super(title);

        Frame f = this;

        MenuBar menuBar = new MenuBar();


        Menu menu1 = new Menu("File");

        MenuItem mI1 = new MenuItem("Save As");
        mI1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        FileDialog saveAs = new FileDialog(f, "save as file", FileDialog.SAVE);
                        saveAs.setVisible(true);
                        msg = saveAs.getDirectory()+saveAs.getFile();
                        repaint();
                    }
                }
        );

        MenuItem mI2 = new MenuItem("Save", new MenuShortcut(KeyEvent.VK_S));

        mI2.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        FileDialog save = new FileDialog(f, "save", FileDialog.SAVE);
                        save.setVisible(true);
                        msg = save.getDirectory()+save.getFile();
                        repaint();
                    }
                }
        );

        MenuItem mI3 = new MenuItem("Open");
        mI3.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        OpenDialog di = new OpenDialog(f, "My Dialog", true);
                        di.setVisible(true);
                    }
                }
        );

        MenuItem mI4 = new MenuItem("Exit");

        mI4.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                }
        );

        menu1.add(mI1);
        menu1.add(mI2);
        menu1.add(mI3);
        menu1.add(mI4);

        menuBar.add(menu1);

        setMenuBar(menuBar);
        setVisible(true);
        setSize(500, 500);
        setLayout(new GridLayout(1, 2));


    }

    @Override
    public void paint(Graphics g) {
        g.drawString(msg, 250, 250);
    }

    public static void main(String[] args) {
        new Main("Menu Bar");
    }
}
