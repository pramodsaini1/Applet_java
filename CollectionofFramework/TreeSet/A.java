package Applet_java.CollectionofFramework.TreeSet;
import java.util.*;
public class A {
    public static void main(String[] args) {
        TreeSet ls=new TreeSet<>();
        ls.add("Hello");
        ls.add("Ajay");
        ls.add("Hello");
        ls.add("Amit");
        ls.add("Ram");
        ls.add("Mohan");
        ls.add("Desak");

        Iterator it = ls.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
//treeset is the collection of the sorted unique element called the treeset 
