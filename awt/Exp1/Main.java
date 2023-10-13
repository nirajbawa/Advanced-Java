package awt.Exp1;

import java.awt.*;

public class Main extends Frame {
    Main(String title){
        super(title);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(new Dimension(200, 200));

        Label l1 = new Label("Enter Details : ");
        TextField uname = new TextField("Enter Name : ", 20);
        TextField pass = new TextField("Enter pass : ", 20);
        Label l2 = new Label("Select your subjects : ", Label.CENTER);
        Checkbox c1 = new Checkbox("java");
        Checkbox c2 = new Checkbox("python");

        Label l3 = new Label("Select your gender : ");
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox s1, s2;
        s1 = new Checkbox("male", true, cbg);
        s2 = new Checkbox("female", true, cbg);

        TextArea tbox = new TextArea("enter Text", 20, 20, Scrollbar.VERTICAL);

        Button b1 = new Button("submit");

        add(l1); add(uname); add(pass); add(b1); add(l2); add(c1); add(c2); add(l3); add(s1); add(s2); add(tbox);
    }

    public static void main(String[] args) {
        Frame mainFrame = new Main("Exp 1");
    }
}
