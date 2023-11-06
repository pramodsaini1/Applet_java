package Applet_java.eventApplet;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

import Applet_java.checkBox;
public class RadioEvent extends Applet implements ItemListener {
      Checkbox c,c1,c2,c3;
      CheckboxGroup cg,cg1;
      public void init(){
        cg=new CheckboxGroup();
        cg1=new CheckboxGroup();
        c=new Checkbox("Male",false,cg);
        c1=new Checkbox("Female",cg,false);
        c2=new Checkbox("ECB",false,cg1);
        c3=new Checkbox("CET",cg1,false);

        add(c);
        add(c1);
        add(c2);
        add(c3);

        c.addItemListener(this);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);


      }
      public void itemStateChanged(ItemEvent e){
          String gender=null;
          String college="";
          if(c.getState()){
             gender="Male";
          }
          else if(c1.getState()){
            gender="Female";
          }
          if(c2.getState()){
            college="ECB";
          }
          else if(c3.getState()){
            college="CET";
          }
          System.out.println(gender+""+college);
      }
}
//<applet code="RadioEvent.java" widht=500 height=500></applet>
