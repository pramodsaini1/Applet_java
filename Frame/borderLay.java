package Applet_java.Frame;
import java.awt.*;
import java.applet.*;
public class borderLay extends Frame {
    Button b,b1,b2,b3;
    public borderLay(String s){
        super(s);
        setLayout(new BorderLayout());

        b=new Button("1");
        b1=new Button("2");
        b2=new Button("3");
        b3=new Button("4");

        add(b,BorderLayout.EAST);
        add(b1,BorderLayout.WEST);
        add(b2,BorderLayout.NORTH);
        add(b3,BorderLayout.SOUTH);
    }
    public static void  main(String []arr){
        borderLay d=new borderLay("Frame BorderLayout Example");
        d.setSize(500,500);
        d.setVisible(true);
    }
}
