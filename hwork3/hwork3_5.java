// Обновить определенный элемент списка по заданному индексу
package hw_1_java.hwork3;
import java.util.ArrayList;

public class hwork3_5 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hola");
        arr.add("New");
        arr.add("World");
        System.out.println(arr);
        arr.set(1, "____");
        System.out.println(arr);
    }
}
