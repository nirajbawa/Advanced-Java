package awt.Exp2;
import java.awt.*;

public class Main {
    public static void main(String args[])
    {
         Frame f1 = new Frame("List And Choice");
         f1.setVisible(true);
         f1.setLayout(new FlowLayout());
         f1.setSize(500, 500);

         List l1 = new List(20, true);
         l1.add("java");
         l1.add("python");
         l1.add("js");

         Choice c1 = new Choice();
         c1.add("flask");
         c1.add("Express");
         c1.add("fast api");

         f1.add(l1);
         f1.add(c1);


    }
}
