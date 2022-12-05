// Удалить третий элемент из списка.
package hw_1_java.hwork3;
import java.util.ArrayList;

public class hwork3_6 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hola");
        arr.add("New");
        arr.add("World");
        arr.add("Day");
        System.out.println(arr);
        arr.remove(3);
        System.out.println(arr);
    }
}
