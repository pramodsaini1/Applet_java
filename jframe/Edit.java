package Applet_java.jframe;
import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.awt.event.*;
public class Edit extends JFrame implements ActionListener {
    JButton jb1,jb2,jb3;

      public Edit (String s){
        super(s);
        setLayout(new FlowLayout());

        jb1=new JButton("Home");
        jb2=new JButton("Insert");
        jb3=new JButton("Delete");

        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);

      }
      public void actionPerformed(ActionEvent e){
           if(e.getSource()==jb1){
              Home d=new Home("Home Frame");
              d.setSize(500,500);
              d.setVisible(true);
              this.setVisible(false);
           }
           else if(e.getSource()==jb2){
               Inserta d=new Inserta("Insert Frame");
              d.setSize(500,500);
              d.setVisible(true);
              this.setVisible(false);
           }
           else{
                Delete d=new Delete("Delete Frame");
              d.setSize(500,500);
              d.setVisible(true);
              this.setVisible(false);
           }

      }
}
