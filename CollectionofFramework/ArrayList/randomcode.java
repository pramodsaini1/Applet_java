package Applet_java.CollectionofFramework.ArrayList;
import java.util.*;
public class randomcode {
       
      public static void main(String []arr){
             ArrayList ls=new ArrayList<>();
            String code="";
            for(char c='A';c<='Z';c++){
                ls.add(String.valueOf(c));
            }
            for(char c='a';c<='z';c++){
                ls.add(String.valueOf(c));
            }
            for(int i=1;i<=9;i++){
                ls.add(i);
            }
            Collections.shuffle(ls);
            for(int i=0;i<6;i++){
                code = code+ls.get(i);
            }
            System.out.println(code);
      }


    
}
