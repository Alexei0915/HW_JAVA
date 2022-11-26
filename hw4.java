package hw_1_java;
import java.util.Random;
import java.util.Arrays;

public class hw4 {
    public static int hBit_line(int n){
        int res = 0;
        while (n != 1){
            n >>= 1;
            res++;
        }
        return res;
    }

    public static void main(String[] args)
    {
        int i = new Random().nextInt(-1000, 1000);
        int n = hBit_line(i);
        int count = 0;
        for (int j = i; j > Short.MIN_VALUE; j--){
            if (j % n == 0){
                count++;
            }
        }
        int[] m2 = new int[count];
        int index = 0;
        for (int j = i; j > Short.MIN_VALUE; j--){
            if (j % n == 0){
                m2[index] = j;
                index++;
            }
        }
        System.out.print(Arrays.toString(m2));

        System.out.println("\n");
        System.out.println("_______");
        System.out.println(count);     
    }
    
}
