package hw_1_java.hwork2;
import java.util.Arrays;
public class hwork4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(appenDStr(3, 30)));
    }
    static String[] appenDStr(int x, int y){
        String[] result = new String[3];
        StringBuilder sum = new StringBuilder();
        sum.append(x);
        sum.append("+");
        sum.append(y);
        sum.append("=");
        sum.append(x+y);
        StringBuilder min = new StringBuilder();
        min.append(x);
        min.append("-");
        min.append(y);
        min.append("=");
        min.append(x-y);
        StringBuilder mult = new StringBuilder();
        mult.append(x);
        mult.append("*");
        mult.append(y);
        mult.append("=");
        mult.append(x*y);

        result[0] = sum.toString();
        result[1] = min.toString();
        result[2] = mult.toString();

        return result;


    }
}
