package Applet_java.CollectionofFramework.LinkedList;
import java.util.*;
public class shuffle {
     public static void main(String[] args) {
        LinkedList ls = new LinkedList<>();
         ls.add("anil");
         ls.add(new Integer(10));
         ls.add(new Float(5.5));
         ls.add(1,"pramod");
         ls.addFirst("pk");
         ls.addLast("saini");
         Collections.shuffle(ls);
         for(int i=0;i<ls.size();i++){
            System.out.print(ls.get(i)+" ");
         }
     }

}
