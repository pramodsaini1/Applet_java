package Applet_java;
import java.awt.*;
import java.applet.*;
import javafx.scene.paint.Color;

public class rotatecolouringoval {
    int x,sa,flag;
    public void init(){
        x=0;
        sa=0;
        flag=0;
    }
    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.fillArc(x, 100, 100, 100, sa, 90);
        g.setColor(Color.RED);
        g.fillArc(x, 100, 100, 100, sa+90, 90);
        g.setColor(Color.GREEN);
        g.fillArc(x, 100, 100, 100, sa+180, 90);
        g.setColor(Color.YELLOW);
        g.fillArc(x, 100, 100, 100, sa+270, 90);
        if(x==0){
            flag=0;
        }
        else if(x==400){
            flag=1;
        }
        if(flag==0){
            x++;
            sa--;
        }
        else{
            x--;
            sa++;
        }
        try{
            Thread.sleep(100);
        }
        catch(InterruptedException e){}
        repaint();


    }
}
//<applet code="rotatecolouringoval.java" width=500 height=500></applet>
