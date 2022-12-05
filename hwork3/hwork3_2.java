package hw_1_java.hwork3;

import java.util.ArrayList;
import java.util.Iterator;


public class hwork3_2 {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("Black");
        color.add("Blue");
        color.add("Red");
        color.add("Green");
        System.out.println(color);

        Iterator<String> iterator = color.iterator();
        while (iterator.hasNext()){
            String i = iterator.next();
            i += '!';
            System.out.println(i);
        }
    }   
    
}
