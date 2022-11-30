package hw_1_java.hwork2;



public class hw1{
    public static void main(String[] args) {
        task();
    }
    static void task () {
        String strOne = "Напишите программу, чтобы найти наименьшее окно в строке, содержащей все символы другой строки ";
        String strTwo = "Напишите программу, чтобы найти наименьшее окно в строке, содержащей все символы другой строки ";
        String[] ar1 = strOne.split(" ");
        String[] ar2 = strTwo.split(" ");
        String[] ar3 = new String[ar1.length > ar2.length ? ar1.length : ar2.length];
        int count = 0;
        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar2.length; j++) {
                if (ar1[i].compareTo(ar2[j]) == 0) {
                    ar3[count++] = ar1[i];
                }
            }
        }
        int minLength = 1000;
        String result = null;
        for (String each : ar3 ) {
            if (each != null && each.length()<minLength) {
                minLength = each.length();
                result = each;
            }
        }
        System.out.print(result);

    }
    
}