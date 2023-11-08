package Applet_java.Frame;
import java.awt.*;
import java.applet.*;
public class griLayButton extends Frame {
      Button b,b1,b2,b3;
      public griLayButton(String s){
         super(s);
         setLayout(new GridLayout(2,2));
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
           griLayButton d=new griLayButton("Frame Grid Layout Example");
           d.setSize(500,500);
           d.setVisible(true);
      }
}
