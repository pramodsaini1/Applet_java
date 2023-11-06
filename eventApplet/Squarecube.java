package Applet_java.eventApplet;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Squarecube extends Applet implements ActionListener {
     Label l;
     TextField t,t1;
     Button b,b1;
     public void init(){
        l=new Label("Name:");
        t=new TextField(20);
        t1=new TextField(20);
        b=new Button("Square");
        b1=new Button("Cube");

        add(l);
        add(t);
        add(t1);
        add(b);
        add(b1);

        b.addActionListener(this);
        b1.addActionListener(this);
     }
     public void actionPerformed(ActionEvent e){
        int i=Integer.parseInt(t.getText());
        if(e.getSource()==b){
            i=i*i;
        }
        else{
            i=i*i*i;
        }
        t1.setText(String.valueOf(i));
     }
}
//<applet code="Squarecube.java" widht=500 height=500></applet>
