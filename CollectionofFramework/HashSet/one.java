package Applet_java.CollectionofFramework.HashSet;
import java.util.*;
public class one {
    public static void main(String[] args) {
        HashSet<String> ls= new HashSet<>();
        ls.add("volvo");
         ls.add("fazda");
          ls.add("bmxw");
           ls.add("hello");
            ls.add("ajay");

            Iterator it = ls.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
    }
}

