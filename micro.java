import java.awt.event.MouseEvent;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.applet.*;

public class Login extends Applet implements MouseInputListener {
    private Graphics globalGraphics = null;
    int width = 0;
    int tick = 0;
    int l = 0;

    void cleanScreen() {
        try {
            repaint();
        } catch (Exception ob) {
        }
    }

    public void init() {
        this.addMouseListener(this);
    }

    public void Google(Graphics g, int w, int s, int e) {
        g.drawArc((w / 2) - 120, 567, 40, 40, s, e);
        g.drawArc((w / 2) - 119, 568, 38, 38, s, e);
        g.drawArc((w / 2) - 118, 569, 36, 36, s, e);
        g.drawArc((w / 2) - 117, 570, 34, 34, s, e);
        g.drawArc((w / 2) - 116, 571, 32, 32, s, e);
        g.drawArc((w / 2) - 115, 572, 30, 30, s, e);
        g.drawArc((w / 2) - 114, 573, 28, 28, s, e);
    }

    public void paint(Graphics g) {
        this.addMouseListener(this);
        globalGraphics = g.create();
        Color c1 = new Color(90, 165, 255, 100);
        Color c2 = new Color(100, 250, 255, 100);
        Color c3 = new Color(100, 250, 255, 160);

        Color c4 = new Color(83, 135, 137, 250);
        Color c5 = new Color(100, 250, 255, 200);
        Color grColor = new Color(2, 153, 7, 200);
        int w = getWidth(), h = getHeight();
        GradientPaint gp = new GradientPaint(0.0f, 0.0f, Color.magenta, w / 4, h / 2, Color.cyan, true);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
        g.setColor(c1);
        g.fillOval((w / 2) - 75, 150, 150, 150);
        g.setColor(c2);
        g.drawOval((w / 2) - 26, 174, 52, 52);
        g.drawOval((w / 2) - 25, 175, 50, 50);
        g.drawArc((w / 2) - 41, 225, 82, 82, 0, 180);
        g.drawArc((w / 2) - 40, 226, 80, 80, 0, 180);
        g.drawLine((w / 2) - 40, 265, (w / 2) + 40, 265);
        g.drawLine((w / 2) - 40, 266, (w / 2) + 40, 266);
        g.fillRect((w / 2) - 200, 320, 400, 55);
        g.fillRect((w / 2) - 200, 390, 400, 55);
        g.fillRect((w / 2) - 200, 490, 400, 55);
        g.fillRect((w / 2) - 200, 560, 400, 55);
        g.setColor(c3);
        g.fillRect((w / 2) - 200, 320, 55, 55);
        g.fillRect((w / 2) - 200, 390, 55, 55);
        g.setColor(Color.red);
        Google(g, w, 60, 100);
        g.setColor(Color.yellow);
        Google(g, w, 160, 60);
        g.setColor(grColor);
        Google(g, w, 220, 110);
        g.setColor(Color.blue);
        Google(g, w, 300, 67);
        g.fillRect((w / 2) - 100, 584, 20, 7);
        g.setColor(c4);
        g.fillOval((w / 2) - 180, 333, 15, 15);
        g.fillArc((w / 2) - 184, 347, 22, 22, 0, 180);
        g.drawOval((w / 2) - 179, 404, 12, 12);
        g.drawOval((w / 2) - 178, 405, 10, 10);
        g.fillRoundRect((w / 2) - 183, 412, 20, 18, 3, 3);
        g.fillRect((w / 2) - 200, 460, 16, 15);
        g.setColor(c3);
        g.fillOval((w / 2) - 176, 415, 6, 6);
        g.fillRect((w / 2) - 174, 421, 2, 5);
        g.setColor(c5);
        g.drawString("Remember me", (w / 2) - 180, 472);
        g.drawString("Forgot Password?", (w / 2) + 90, 472);
        g.drawString("Sign in with Google", (w / 2) - 50, 591);
        g.drawString("Login", (w / 2) - 15, 521);
    }

    public void mouseClicked(MouseEvent e) {

        int mx = e.getX();
        int my = e.getY();
        Color c4 = new Color(83, 135, 137, 250);
        Color c5 = new Color(100, 250, 255, 200);
        Color c6 = new Color(52, 52, 52, 100);
        width = getWidth();
        if (mx > ((width / 2) - 200) && my > 460 && mx < ((width / 2) - 184) && my < 475) {
            if (tick % 2 == 0) {
                globalGraphics.setColor(c5);
                globalGraphics.drawLine((width / 2) - 196, 468, (width / 2) - 194, 470);
                globalGraphics.drawLine((width / 2) - 194, 470, (width / 2) - 188, 464);
                globalGraphics.drawLine((width / 2) - 196, 469, (width / 2) - 194, 471);
                globalGraphics.drawLine((width / 2) - 194, 471, (width / 2) - 188, 465);
            } else {
                globalGraphics.setColor(c4);
                globalGraphics.fillRect((width / 2) - 200, 460, 16, 15);
            }
            tick++;
        } else if (mx > ((width / 2) + 90) && my > 460 && mx < ((width / 2) + 200) && my < 475) {
            globalGraphics.setColor(c5);
            globalGraphics.drawLine((width / 2) + 90, 474, (width / 2) + 200, 474);
        } else if (mx > ((width / 2) - 200) && my > 490 && mx < ((width / 2) + 200) && my < 545) {
            if (l == 1)
                repaint();

            globalGraphics.setColor(c6);
            globalGraphics.drawString("Login Successfull", (width / 2) - 50, 670);
            l = 0;
        } else if (mx > ((width / 2) - 200) && my > 560 && mx < ((width / 2) + 200) && my < 615) {
            if (l == 0)
                repaint();

            globalGraphics.setColor(c6);
            globalGraphics.drawString("Google Login Successfull", (width / 2) - 70, 740);
            l = 1;
        } else {
            cleanScreen();
        }
    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseMoved(MouseEvent e) {

    }

    public void mouseDragged(MouseEvent e) {
    }

    public static void main(String[] args) {
        Login a = new Login();
        JFrame jp1 = new JFrame();
        jp1.getContentPane().add(a, BorderLayout.CENTER);
        jp1.setSize(new Dimension(1000, 1000));
        jp1.setVisible(true);
    }
}