package hw_1_java;

import java.util.Random;
import java.util.Arrays;

public class hw3 {
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
        for (int j = i; j < Short.MAX_VALUE; j++){
            if (j % n == 0){
                count++;
            }
        }
        int[] m1 = new int[count];
        int index = 0;
        for (int j = i; j < Short.MAX_VALUE; j++){
            if (j % n == 0){
                m1[index] = j;
                index++;
            }
        }
        System.out.print(Arrays.toString(m1));

        System.out.println("\n");
        System.out.println("_________");
        System.out.println(count);     
    }
    
}
