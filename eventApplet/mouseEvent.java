package Applet_java.eventApplet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.applet.*;
import java.applet.*;
public class mouseEvent extends Applet implements MouseListener,MouseMotionListener {
       int x,y;
       String s;
       public void init(){
        x=0;
        y=0;
        s="";
        addMouseListener(this);
        addMouseMotionListener(this);
       }
       public void mouseClicked(MouseEvent e){
        x=e.getX();
        y=e.getY();
        s="click";
        repaint();

       }
       public void mousePressed(MouseEvent e){
           x=e.getX();
           y=e.getY();
            s="press";
            repaint();

       }
       public void mouseReleased(MouseEvent e){

       }
       public void mouseEntered(MouseEvent e){
        setBackground(Color:red);

       }
       public void mouseExited(MouseEvent e){

       }
       public void mouseDragged(MouseEvent e){
        x=e.getX();
          y=e.getY();
          s="drag";
          repaint();

       }
       public void mouseMoved(MouseEvent e){
          x=e.getX()+20;
          y=e.getY()+20;
          s="Move";
          repaint();

       }
       public void paint(Graphics g){
        g.drawString(s,x,y);
       }
}
//<applet code="mouseEvent.java" width=500 heigth=500></applet>
