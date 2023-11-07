package Applet_java.CollectionofFramework.ArrayList;
import java.util.*;
public class third {
      public static void main(String []arr){
        ArrayList ls = new ArrayList<>();
        ls.add(3);
        for(int i=1;i<=10;i++){
            ls.add(i);
        }
        ls.set(2,20);
        for(int i=0;i<ls.size();i++){
            System.out.print(ls.get(i));
        }
      }
}
