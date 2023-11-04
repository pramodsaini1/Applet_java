package Applet_java;
import java.applet.*;
import java.awt.*;
public class checkBox {
    Label l;
    TextField t;
    Button b;
    Checkbox c,c1,c2;
    public void init(){
        l=new Label("Name:");
        t=new TextField(20);
        b=new Button("submit");
        c=new Checkbox("C");
        c1=new CheckBox("C++");
        c2=new Checkbox("java");

        add(l);
        add(t);
        add(b);
        add(c);
        add(c1);
        add(c2);
    }

}
//<applet code ="checkBox.java" width=500 height=500></applet>
