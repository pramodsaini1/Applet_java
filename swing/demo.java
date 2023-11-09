package Applet_java.swing;
import java.awt.*;
import java.applet.*;
import javax.swing.*;
public class demo extends JApplet {
    JLabel jl;
    JTextField jt;
    JButton jb;
    public void init(){
        jl=new JLabel("Name:");
        jt=new JTextField(20);
        jb=new JButton("Submit");

        add(jl);
        add(jt);
        add(jb);
    }
}
//<applet code="demo.java" width=500 heigth=500></applet>
