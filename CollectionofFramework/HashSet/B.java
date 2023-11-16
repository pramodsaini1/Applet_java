package Applet_java.CollectionofFramework.HashSet;
import java.util.*;
public class B {
    public static void main(String[] args) {
        HashSet<Integer> ls= new HashSet<>();
        ls.add(new Integer(10));
         ls.add(new Integer(2));
          ls.add(new Integer(3));
           ls.add(new Integer(40));
            ls.add(new Integer(5));
             ls.add(new Integer(6));

             for(int x:ls){
               System.out.print(x+" ");
             }

    }
}
