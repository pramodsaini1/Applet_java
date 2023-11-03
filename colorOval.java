package Applet_java;
import java.awt.*;
import java.applet.*;
public class colorOval {
    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.fillArc(50, 100, 100, 100, 0, 90);
        g.setColor(Color.RED);
        g.fillArc(50, 100, 100, 100, 90, 90);
        g.setColor(Color.GREEN);
        g.fillArc(50, 100, 100, 100, 180, 90);
        g.setColor(Color.YELLOW);
        g.fillArc(50, 100, 100, 100, 270, 90);

    }
}
//<applet code="colorOval.java" width=500 height=500></applet>
