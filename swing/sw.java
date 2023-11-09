package Applet_java.swing;
import java.awt.*;
import javax.swing.*;
import java.applet.*;
public class sw extends JApplet {
     JLabel jl;
     JTextField jt;
     JButton jb;
     public void init(){
        setLayout(new FlowLayout());
        jl=new JLabel("Name:");
        jt=new JTextField(20);
        jb=new JButton("Submit");

        add(jl);
        add(jt);
        add(jb);
     }
}
//<applet code="sw.java" width=500 heigth=500></applet>
