package Applet_java.CollectionofFramework.LinkedList;
import java.util.*;
public class one {
    public static void main(String[] args) {
        LinkedList<String> ls=new LinkedList<>();
        ls.add("volvo");
        ls.add("Bmw");
        ls.add("Ford");
        ls.add("Mazda");
        for(int i=0;i<ls.size();i++){
            System.out.print(ls.get(i)+" ");
        }
    }
}
