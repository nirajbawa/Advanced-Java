 package EventHandling.exp10;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.*;



/*<applet code="Main" width="300" height="300"> 
</applet>  */

public class Main extends Applet implements KeyListener {
    String status;
    public void init()
    {
        setSize(500, 500);
        addKeyListener(this);
    }

    public void keyPressed(KeyEvent e)
    {
        showStatus("keyPressed");
    }

    
    public void keyReleased(KeyEvent e)
    {
        showStatus("keyReleased");
    }

    public void keyTyped(KeyEvent e)
    {
        showStatus("keyTyped");
    }

    public void paint(Graphics g){  
        g.drawString("welcome",150,150);  
    }  
          
}
