package hw_1_java.hwork1;
import java.util.Random;

public class hw2 {
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
        int i = new Random().nextInt(-100, 100);
        System.out.println(i);
        System.out.println(hBit_line(i));       
    }
    
}
