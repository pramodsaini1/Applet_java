package Applet_java.game;
import java.awt.*;
import java.applet.*;
public class oval  extends Applet{
    int x,y,flagx,flagy;
    public void init(){
        x=0;
        y=250;
        flagx=0;
        flagy=0;
    }
    public void paint(Graphics g){
        g.fillOval(x, y, 50, 50);
        if(x==0){
            flagx=0;
        }
        else if(x==450){
            flagx=1;
        }
        if(y==250){
            flagy=0;
        }
        else if(y==450){
            flagy=1;
        }
        if(flagx==0){
            x++;
        }
        else{
            x--;
        }
        if(flagy==0){
            y++;
        }
        else{
            y--;
        }
        try{
            Thread.sleep(100);
        }
        catch(InterruptedException e){}
        repaint();
    }
}
