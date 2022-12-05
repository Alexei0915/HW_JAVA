// Вставить элемент в список в первой позиции.
package hw_1_java.hwork3;

import java.util.ArrayList;

public class hwork3_3 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hola");
        arr.add("New");
        arr.add("World");
        System.out.println(arr);
        arr.add(0, "Hola");
        System.out.println(arr);
    }
}
