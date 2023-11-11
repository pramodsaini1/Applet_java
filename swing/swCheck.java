package Applet_java.swing;
import java.awt.*;
import javax.swing.*;
import java.applet.*;
public class swCheck extends JApplet {
        JCheckBox jc,jc1,jc2;
        JButton jb;
        public void init(){
            setLayout(new FlowLayout());
            jc=new JCheckBox("C");
            jc1=new JCheckBox("C++");
            jc2=new JCheckBox("Java");
            jb=new JButton("Submit");

            add(jc);
            add(jc1);
            add(jc2);
            add(jb);
        }
}
//<applet code="swCheck.java" width=500 heigth=500></applet>
