package Applet_java.jframe;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class login extends JFrame implements ActionListener {
     JLabel jl1,jl2;
     JTextField jt1;
     JPasswordField jp;
     JButton jb;

     public login(String s){
        super(s);
        setLayout(null);
        jl1=new JLabel("Email-Id:");
        jt1=new JTextField(20);

        jl2=new JLabel("Password:");
        jp=new JPasswordField(20);

        jb=new JButton("Submit");

        jl1.setBounds(100,100,100,30);
        jt1.setBounds(210,100,120,30);

        jl2.setBounds(100,150,100,30);
        jp.setBounds(210,150,120,30);

        jb.setBounds(180,200,100,30);

        jb.addActionListener(this);
     }
     public void actionPerformed(ActionEvent e){
        String email=jt1.getText();
        String pass=jp.getText();

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from login where email='"+email+"'");
            if(rs.next()){
                if(rs.getString("password").equals(pass)){
                     Inse d= new Inse("DashBoard.java");
                    d.setSize(500,500);
                    d.setVisible(true);
                    this.setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid Password");
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid");
            }
            cn.close();
        }
        catch(Exception er){
            JOptionPane.showMessageDialog(null, er.getMessage());
        }
     }
}
