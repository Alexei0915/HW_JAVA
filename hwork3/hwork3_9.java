// Удалить из первого списка все элементы отсутствующие во втором списке.
package hw_1_java.hwork3;
import java.util.ArrayList;

public class hwork3_9 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hola");
        arr.add("New");
        arr.add("World");
        arr.add("Day");
        
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("World");

        arr.forEach(i -> System.out.println(i));
        System.out.println();
        arr2.forEach(i -> System.out.println(i));
        System.out.println("__");
        
        arr.retainAll(arr2);

        arr.forEach(i -> System.out.println(i));
        System.out.println();
        arr2.forEach(i -> System.out.println(i));
    }
}
