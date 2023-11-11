package Applet_java.swing;
import java.awt.*;
import java.applet.*;
import javax.swing.*;
public class swCombo extends JApplet {
      JComboBox jcb;
      String st[]={"C","C++","Java","JSP","Servlet"};
      public void init(){
          jcb=new JComboBox(st);

          add(jcb);
      }
}
//<applet code="swCombo.java" width=500 heigth=500></applet>
