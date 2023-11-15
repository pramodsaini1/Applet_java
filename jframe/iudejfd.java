package Applet_java.jframe;
import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
public class iudejfd extends JFrame implements ActionListener {
       JLabel jl1,jl2,jl3;
       JTextField jt1,jt2,jt3;
       JButton jb,jb1,jb2;
       int flag;

       iudejfd(String s){
        super(s);
        flag=0;
        setLayout(null);
        jl1=new JLabel("Roll.No:");
        jt1=new JTextField(20);

        jl2=new JLabel("Name:");
        jt2=new JTextField(20);

        jl3=new JLabel("Avg:");
        jt3=new JTextField(20);

        jb=new JButton("Submit");

        jb1=new JButton("Edit");

        jb2=new JButton("Delete");

        jl1.setBounds(100,100,100,30);
        jt1.setBounds(210,100,120,30);
        jb1.setBounds(340,100,100,30);

        jl2.setBounds(100,150,100,30);
        jt2.setBounds(210,150,120,30);
        jb2.setBounds(340,150,100,30);

        jl3.setBounds(100,200,100,30);
        jt3.setBounds(210,200,120,30);

        jb.setBounds(180,250,100,30);

        add(jl1);
        add(jt1);

        add(jl2);
        add(jt2);

        add(jl3);
        add(jt3);

        add(jb1);
        add(jb2);

        jb.addActionListener(this);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
       }
       public void actionPerformed(ActionEvent e){
         int roll=Integer.parseInt(jt1.getText());
         if(e.getSource()==jb1){
              try{
                   Class.forName("com.mysql.jdbc.Driver");
                   Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/databse_name","root","");
                   Statement st = cn.createStatement();
                   ResultSet rs = st.executeQuery("select * from student where sn="+roll);
                   if(rs.next()){
                      jt2.setText(rs.getString("sname"));
                      jt3.setText(rs.getInt("avgr")+"");

                      flag=1;
                   }
                   else{
                      JOptionPane.showMessageDialog(null,"Record Not Found");
                      flag=0;
                   }
                   cn.close();
                  
              }
              catch(Exception er){
                JOptionPane.showMessageDialog(null, er.getMessage());
              }
         }
         else if(e.getSource()==jb2){
                 try{
                   Class.forName("com.mysql.jdbc.Driver");
                   Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/databse_name","root","");
                   Statement st = cn.createStatement();
                   ResultSet rs = st.executeQuery("select * from student where sn="+roll);
                   if(rs.next()){
                      jt2.setText(rs.getString("sname"));
                      jt3.setText(rs.getInt("avgr")+"");

                      flag=2;
                   }
                   else{
                      JOptionPane.showMessageDialog(null,"Record Not Found");
                      flag=0;
                   }
                   cn.close();
                  
              }
              catch(Exception em){
                JOptionPane.showMessageDialog(null, em.getMessage());
              }
         }
         else{
              String name=jt2.getText();
              int avg=Integer.parseInt(jt3.getText());
              String msg="";
              try{
                  Class.forName("com.mysql.jdbc.Driver");
                  Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/databse_name","root","");
                  PreparedStatement ps=null;
                  if(flag==1){
                    ps=cn.prepareStatement("update student set sname=?,avgr=? where sn=?");
                    ps.setString(1,name);
                    ps.setInt(2,avg);
                    ps.setInt(3,roll);
                    msg="Record Updated";
                  }
                  else if(flag==2){
                    ps=cn.prepareStatement("delete from student where sn=?");
                    ps.setInt(1,roll);

                    msg="Record Deleted";
                  }
                  else{
                     ps=cn.prepareStatement("insert into student values(?,?,?)");
                     ps.setInt(1,roll);
                     ps.setString(2,name);
                     ps.setInt(3,avg);

                     msg="Record Inserted";
                  }
                  if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null,msg);
                  }
                  else{
                    JOptionPane.showMessageDialog(null,"Try Again");
                  }
                  cn.close();
              }
              catch(Exception en){
                JOptionPane.showMessageDialog(null,en.getMessage());
              }
         }
       }
}
