import java.awt.*;
import java.applet.*;
public class Demo  extends Applet{
      public void init(){
         System.out.println("Init");
      }
      public void start(){
        System.out.println("Start");
      }
      public void stop(){
        System.out.println("stop");
      }
      public void destroy(){
        System.out.println("Destroy");
      }
}
//<applet code="Demo.java" width=500 heigth=500 ></applet>