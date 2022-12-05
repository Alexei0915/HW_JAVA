// Создать новый список и добавить в него несколько елементов первого списка.
package hw_1_java.hwork3;
import java.util.ArrayList;

public class hwork3_8 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hola");
        arr.add("New");
        arr.add("World");
        arr.add("New");
        
        String c = arr.remove(1);
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add(c);   
        
        
        arr2.forEach(i -> System.out.println(i));
    }
}
