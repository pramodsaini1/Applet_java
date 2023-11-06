package Applet_java;
import java.awt.*;
import java.applet.*;
public class list extends Applet {
    List lt;
    public void init(){
        lt=new List(4,true);
        lt.add("ECB");
        lt.add("CET");
        lt.add("MBM");
        lt.add("MNIT");
        add(lt);

    }
}
//<applet code="list.java" width=500 height=500></applet>
