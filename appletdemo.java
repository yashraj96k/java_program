import java.applet.*;
import java.awt.*;

public class appletdemo extends Applet
{
    public void paint(Graphics g)
     {
        g.setColor(Color.red);
        g.drawLine(400, 200, 450, 350);
        g.drawRect(120, 233, 300, 200);
        g.drawOval(500,400,300,200);
        g.fillOval(450,400,300,250);
    }
}
/*
 <applet CODE=appletdemo.class width=200 height=500>
 </applet>
 */
