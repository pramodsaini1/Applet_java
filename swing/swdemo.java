package Applet_java.swing;
import java.awt.*;
import java.applet.*;
import javax.swing.*;
public class swdemo  extends JApplet{
     JLabel jl1,jl2,jl3,jl4,jl5,jl6;
     JTextField jt1,jt2;
     JRadioButton jr,jr1,jr2,jr3;
     JCheckBox jc,jc1,jc2,jc3;
     JComboBox jcb;
     String s[]={"Sikar","Jaipur","Udaipur","Jhunjhunu"};
     ButtonGroup gender,college;
     JButton jb;

     public void init(){
        setLayout(new FlowLayout());
        gender= new ButtonGroup();
        college=new ButtonGroup();
        jl1=new JLabel("Name:");
        jt1=new JTextField(20);

        jl2=new JLabel("Email:");
        jt2=new JTextField(20);

        jl3=new JLabel("Gender:");
        jr=new JRadioButton("Male");
        jr1=new JRadioButton("Female");

        jl4=new JLabel("City");
        jcb=new JComboBox(s);

        jl5=new JLabel("College");
        jr2=new JRadioButton("ECB");
        jr3=new JRadioButton("CET");

        jl6=new JLabel("Language");
        jc=new JCheckBox("C");
        jc1=new JCheckBox("C++"):
        jc2=new JCheckBox("Java");
        jc3=new JCheckBox("Php");

        jb=new JButton("Submit");

        gender.add(jr);
        gender.add(jr1);

        college.add(jr2);
        college.add(jr3);

        add(jl1);
        add(jt1);

        add(jl2);
        add(jt2);

        add(jl3);
        add(jr);
        add(jr1);

        add(jl4);
        add(jcb);

        add(jl5);
        add(jr2);
        add(jr3);

        add(jl6);
        add(jc);
        add(jc1);
        add(jc2);
        add(jc3);

        add(jb);

     }
}
//<applet code="swdemo.java" width=500 heigth=500></applet>
