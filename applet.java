import java.applet.*;
import java.awt.*;

public class applet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawRect(50, 50, 100, 200);
        g.drawOval(60, 60, 200, 200);
        g.drawOval(80, 120, 200, 130);
        g.drawLine(100, 100, 200, 200);
        g.drawArc(20, 30, 43, 50, 60, 50);
    }
}
/*
<applet CODE=applet.java height=250 width=250>
</applet>
*/
s
