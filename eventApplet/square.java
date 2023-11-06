package Applet_java.eventApplet;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class square extends Applet implements ActionListener {
       Label l;
       TextField t,t1;
       Button b;
       public void init(){
        l=new Label("Name:");
        t=new TextField(20);
        t1=new TextField(20);
        b=new Button("Submit");

        add(l);
        add(t);
        add(t1);
        add(b);

        b.addActionListener(this);
       }
       public void actionPerformed(ActionEvent e){
          int i=Integer.parseInt(t.getText());
          t1.setText(i*i+"");
       }
}
//<applet code ="square.java" width=500 height=500></applet>
