package Applet_java.CollectionofFramework.LinkedList;
import java.util.*;
public class addlast {
    public static void main(String[] args) {
        LinkedList<String> ls=new LinkedList<>();
        ls.add("Volvo");
        ls.add("BMW");
        ls.add("Fordo");
        ls.addLast("pramod");
        System.out.print(ls);
    }
}