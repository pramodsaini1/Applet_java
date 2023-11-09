package Applet_java.Frame;
import java.awt.*;
import java.applet.*;
public class demo extends Frame{
     Label l;
     TextField t;
     Button b;
     public demo(String s){
        super(s);
        setLayout(null);
        l=new Label("Name:");
        t=new TextField(20);
        b=new Button("Submit");

        l.setBounds(100,100,100,30);
        t.setBounds(210,100,120,30);
        b.setBounds(180,150,100,30);

        add(l);
        add(t);
        add(b);
     }
     public static void main(String []arr){
        demo d=new demo("Frame in Fix the position");
        d.setSize(500,500);
        d.setVisible(true);
     }
}
