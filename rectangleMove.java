package Applet_java;
import java.awt.*;
import java.applet.*;
public class rectangleMove {
    int flag,x;
    public void init(){
        x=0;
        flag=0;
    }
    public void paint(Graphics g){
        d.drawRect(x,100,100,100);
        if(x==0){
            flag=0;
        }
        else if(x==400){
            flag=1;
        }
        if(flag==0){
            x++;
        }
        else{
            x--;
        }
        try{
            Thread.sleep(100);
        }
        catch(InterruptedException e){}
        repaint();
    }
}
//<applet code="rectangleMove.java" width=500 height=500></applet>
