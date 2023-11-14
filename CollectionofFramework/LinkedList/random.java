package Applet_java.CollectionofFramework.LinkedList;
import java.util.*;
public class random {
    public static void main(String[] args) {
        LinkedList ls = new LinkedList<>();
        String code="";
        for(int i=0;i<=9;i++){
            ls.add(i+"");
        }
        for(char c='a';c<='z';c++){
            ls.add(c+"");
        }
         for(char c='A';c<='Z';c++){
            ls.add(c+"");
        }
        Collections.shuffle(ls);
        for(int i=0;i<6;i++){
          code = code+ls.get(i);
        }
        System.out.println(code);
    }
}
