package Applet_java.jframe;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;
import javax.swing.*;
import java.sql.*;
public class insert extends JFrame implements ActionListener {
        JLabel jl1,jl2,jl3;
        JTextField jt1,jt2,jt3;
        JButton jb;
        public insert(String s){
            super(s);
            setLayout(null);
            jl1=new JLabel("Roll.No:");
            jt1=new JTextField(20);

            jl2=new JLabel("Name");
            jt2=new JTextField(20);

            jl3=new JLabel("Avg:");
            jt3=new JTextField(20);

            jb=new JButton("Submit");

            jl1.setBounds(100,100,100,30);
            jt1.setBounds(210,100,120,30);

            jl2.setBounds(100,150,100,30);
            jt2.setBounds(210,150,120,50);

            jl3.setBounds(100,200,100,30);
            jt3.setBounds(210,200,120,30);

            jb.setBounds(180,250,100,30);

            add(jl1);
            add(jt1);

            add(jl2);
            add(jt2);

            add(jl3);
            add(jt3);

            add(jb);

            jb.addActionListener(this);



        }
        public void actionPerformed(ActionEvent e){
             int roll=Integer.parseInt(jt1.getText());
             String name=jt2.getText();
             int avg=Integer.parseInt(jt3.getText());
             try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/database-name","root","");
                 Statement st = cn.createStatement();
                 if(st.executeUpdate("insert into student values('+roll+','"+name+"','+avg+')")>0){
                    JOptionPane.showMessageDialog(null,"Record Inserted");
                 }
                 else{
                    JOptionPane.showMessageDialog(null,"Try Again");
                 }
                 cn.close();
             }
             catch(Exception er){
                JOptionPane.showMessageDialog(null,er.getMessage());
             }
        }
        public static void main(String[] args) {
            insert d = new insert("Frame insert example");
            d.setSize(500,500);
            d.setVisible(true);
        }
}
