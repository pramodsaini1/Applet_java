package Applet_java.CollectionofFramework.TreeMap;
import java.util.*;
public class access {
    public static void main(String[] args) {
        TreeMap ls= new TreeMap<>();
        ls.put("Hello",new Integer(11));
        ls.put("Ajay",new Integer(10));
        ls.put("Amit",new Integer(17));
        ls.put("Ram",new Integer(7));
        ls.put("Mohan",new Integer(13));
        ls.put("Desal",new Integer(2));

        Set st=ls.entrySet();
        Iterator it=st.iterator();
        while(it.hasNext()){
            Map.Entry mp=(Map.Entry)it.next();
            System.out.println(mp.getKey()+" "+mp.getValue());
        }
    }
}
