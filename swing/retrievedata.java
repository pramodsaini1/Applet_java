package Applet_java.swing;
import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.awt.event.*;
public class retrievedata extends JApplet implements ActionListener {
    JLabel jl1,jl2,jl3,jl4,jl5,jl6;
    JTextField jt1,jt2;
    JRadioButton jr,jr1,jr2,jr3;
    JCheckBox jc,jc1,jc2,jc3;
    JComboBox jcb;
    String s[]={"Sikar","Jaipur","Udaipur","Jhunjhunu"};
    ButtonGroup gender,college;
    JButton jb;

    public void init(){
       setLayout(null);
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

       jl1.setBounds(100,100,100,30);
       jt1.setBounds(210,100,120,30);

       jl2.setBounds(100,150,100,30);
       jt2.setBounds(210,150,120,30);

       jl3.setBounds(100,200,100,30);
       jr.setBounds(210,200,80,30);
       jr1.setBounds(300,200,80,30);

       jl4.setBounds(100,250,100,30);
       jcb.setBounds(210,250,120,30);

       jl5.setBounds(100,300,100,30);
       jr2.setBounds(210,300,80,30);
       jr3.setBounds(300,300,80,30);

        jl6.setBounds(100,350,100,30);
       jc.setBounds(210,350,80,30);
       jc1.setBounds(300,350,80,30);
       jc2.setBounds(390,350,80,30);
       jc3.setBounds(480,350,80,30);

       jb.setBounds(130,400,100,30);

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

       jb.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        String name=jt1.getText();
        String email=jt2.getText();
        String gender=null;
        if(jr.isSelected()){
            gender="Male";
        }
        else if(jr1.isSelected()){
            gender="Female";
        }
        String city=(String)jcb.getSelectedItem();
        String college=null;
        if(jr2.isSelected()){
            college="Ecb";
        }
        else if(jr3.isSelected()){
            college="Cet";
        }
        String lang=" ";
        String ptr="";
        if(jc.isSelected()){
            lang=lang+ptr+"C";
            ptr=",";
        }
        if(jc1.isSelected()){
            lang=lang+ptr+"C++";
            ptr=",";
        }
        if(jc2.isSelected()){
            lang=lang+ptr+"Java";
            ptr=",";
        }
        if(jc3.isSelected()){
            lang=lang+ptr+"Php";
            ptr=",";
        }
        System.out.println(name+"/n"+email+"/n"+gender+"/n"+city+"/n"+college+"/n"+lang);

    }
}
//<applet code="retrievedata.java" width=500 heigth=500></applet>
