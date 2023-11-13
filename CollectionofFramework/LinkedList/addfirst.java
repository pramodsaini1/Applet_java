package Applet_java.CollectionofFramework.LinkedList;
import java.util.*;
public class addfirst {
    public static void main(String[] args) {
        LinkedList<String> ls=new LinkedList<>();
        ls.add("Volvo");
        ls.add("BMW");
        ls.add("Fordo");
        ls.addFirst("MAZDA");
        System.out.print(ls);
    }
}
