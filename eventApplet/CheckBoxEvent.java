package Applet_java.eventApplet;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class CheckBoxEvent extends Applet implements ItemListener{
    Checkbox c,c1,c2;
    public void init(){
        c=new Checkbox("C");
        c1=new Checkbox("C++");
        c2=new Checkbox("Java");

        add(c);
        add(c1);
        add(c2);

        c.addItemListener(this);
        c1.addItemListener(this);
        c2.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent e){
        String s="";
        String ptr="";
        if(c.getState()){
            s=s+"C"+ptr;
            ptr=",";
        }
        if(c1.getState()){
            s=s+"C++"+ptr;
            ptr=",";
        }
        if(c2.getState()){
            s=s+"Java"+ptr;
            ptr=",";
        }
        System.out.println(s);

    }
}
//<applet code="CheckBoxEvent.java" widht=500 height=500></applet>
