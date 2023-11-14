package Applet_java.CollectionofFramework.LinkedList;
import java.util.*;
public class iterator {
    public static void main(String[] args) {
        ArrayList ls = new ArrayList<>();
        for(int i=0;i<=9;i++){
            ls.add(i+"");
        }
        for(char c='A';c<='Z';c++){
            ls.add(c+"");
        }
        for(char c='a';c<='z';c++){
            ls.add(c+"");
        }
        Iterator it = ls.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
