package Applet_java;
import java.awt.*;
import java.applet.*;
public class textfield extends Applet{
    Label l;
    TextField t ;
    Button b;
    public void init(){
        l=new Label("Name:");
        t=new TextField(20);
        b=new Button("sunbmit");

        add(l);
        add(t);
        add(b);
    }
}
//<applet code="textfield.java" width=500 height=500></applet>
