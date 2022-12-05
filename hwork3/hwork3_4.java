// Извлечь элемент (по указанному индексу) из заданного списка.

package hw_1_java.hwork3;
import java.util.ArrayList;

public class hwork3_4 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hola");
        arr.add("New");
        arr.add("World");
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
    }
}
