package Applet_java.CollectionofFramework.LinkedList;
import java.util.*;
public class removeFirst {
    public static void main(String[] args) {
        LinkedList<String> ls=new LinkedList<>();
        ls.add("volvo");
        ls.add("Bmw");
        ls.add("Ford");
        ls.add("Mazda");
        ls.removeFirst();
        System.out.print(ls);

    }
}
