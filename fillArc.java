package Applet_java;
import java.aw.*;
import java.awt.Color;
import java.awt.Graphics;
import java.applet.*;
public class fillArc {
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.fillArc(100, 100, 100, 100, 90, 30);
    }
}
//<applet code ="fillArc.java" width=500 heigth=500></applet>
