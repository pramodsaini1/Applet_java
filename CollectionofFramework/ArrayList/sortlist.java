package Applet_java.CollectionofFramework.ArrayList;
import java.util.*;
public class sortlist {
    public static void main(String []arr){
        ArrayList ls=new ArrayList<>();
        ls.add(new Integer(9));
        ls.add(new Integer(7));
        ls.add(new Integer(5));
        ls.add(new Integer(2));
        ls.add(new Integer(4));

        Collections.sort(ls);

        for(int i=0;i<ls.size();i++){
            System.out.print(ls.get(i)+" ");
        }
    }
}
