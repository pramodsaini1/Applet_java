package Applet_java.CollectionofFramework.HashMap;
import java.util.*;
public class access {
    public static void main(String[] args) {
        HashMap ls=new HashMap<>();
        ls.put("Hello",new Integer(11));
        ls.put("Ajay",new Integer(10));
        ls.put("Amit",new Integer(17));
        ls.put("Ram",new Integer(7));
        ls.put("Mohan",new Integer(13));
        ls.put("Desal",new Integer(2));

        Set st = ls.entrySet();
        Iterator it =st.iterator();
        while(it.hasNext()){
            Map.Entry mp=(Map.Entry)it.next();
            System.out.println(mp.getKey()+" "+mp.getValue());
        }
    }
}
/*
 * Java HashMap contains values based on the key.
Java HashMap contains only unique keys.
Java HashMap may have one null key and multiple null values.
Java HashMap is non synchronized.
Java HashMap maintains no order.
The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
 */
