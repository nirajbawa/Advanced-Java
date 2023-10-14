package swing.Exp7;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class Main extends JFrame {
    Main(){


        DefaultMutableTreeNode styles = new DefaultMutableTreeNode("Styles");
        DefaultMutableTreeNode colors = new DefaultMutableTreeNode("Colors");
        DefaultMutableTreeNode fonts = new DefaultMutableTreeNode("Fonts");


        DefaultMutableTreeNode red = new DefaultMutableTreeNode("Red");
        DefaultMutableTreeNode blue = new DefaultMutableTreeNode("Blue");
        DefaultMutableTreeNode green = new DefaultMutableTreeNode("Green");

        styles.add(colors);

        colors.add(red);
        colors.add(blue);
        colors.add(green);

        styles.add(fonts);

        JTree tree = new JTree(styles);


        add(tree);





        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
    }
    public static void main(String agrs[])
    {
        new Main();
    }
}
