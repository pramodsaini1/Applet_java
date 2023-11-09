package Applet_java.swing;
import java.awt.*;
import javax.swing.*;
import java.applet.*;
public class sw1  extends JApplet{
       JLabel jl;
       JTextField jt;
       JButton jb;

       public void init(){
        setLayout(null);
         jl=new JLabel("Name:");
         jt=new JTextField(20);
         jb=new JButton("Submit");

         jl.setBounds(100,100,100,30);
         jt.setBounds(210,100,120,30);
         jb.setBounds(180,150,100,30);

         add(jl);
         add(jt);
         add(jb);
       }
}
//<applet code="sw1.java" width=500 heigth=500></applet>
