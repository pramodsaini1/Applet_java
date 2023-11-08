package Applet_java.Frame;
import java.awt.*;
import java.applet.*;
public class button extends Frame {
    Button b,b1,b2,b3;
     button(String s){
        super(s);
        setLayout(new FlowLayout());
        b=new Button("1");
        b1=new Button("2");
        b2=new Button("3");
        b3=new Button("4");

        add(b);
        add(b1);
        add(b2);
        add(b3);
     }
     public static void main(String []arr){
        button b=new button("Frame Example");
        b.setSize(500,500);
        b.setVisible(true);
     }
}
