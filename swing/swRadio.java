package Applet_java.swing;
import java.applet.*;
import java.awt.*;
import javax.swing.*;
public class swRadio extends JApplet {
       JRadioButton jr,jr1,jr2,jr3;
       ButtonGroup gender,college;
       public void init(){
          setLayout(new FlowLayout());
          gender=new ButtonGroup();
          college =new ButtonGroup();
          jr=new JRadioButton("Male");
          jr1=new JRadioButton("Female");
          jr2=new JRadioButton("ECB");
          jr3=new JRadioButton("CET");

          gender.add(jr);
          gender.add(jr1);
          college.add(jr2);
          college.add(jr3);

          add(jr);
          add(jr1);
          add(jr2);
          add(jr3);
       }
}
//<applet code="swRadio.java" width=500 heigth=500></applet>
