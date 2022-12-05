// Поиска элемента в списке по строке.
package hw_1_java.hwork3;
import java.util.ArrayList;

public class hwork3_7 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hola");
        arr.add("New");
        arr.add("World");
        arr.add("Day");
        System.out.println(arr);
        int a = arr.indexOf("new");
        System.out.println(a);
    }
    
}
