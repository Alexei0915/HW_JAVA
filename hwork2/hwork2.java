package hw_1_java.hwork2;

public class hwork2 {
    public static void main(String[] args) {
        String stringFirst = "SW";
        String stringSecond = "WS";
        StringBuilder sb = new StringBuilder(stringFirst);
        String stringT = sb.reverse().toString();
        System.out.println(stringSecond.compareTo(stringT) == 0);
    }
}

    



