package lab1;

public class Multiples {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int n = 1000;
            int i = 1;
            int count = 0;
            while (i < n) {
                boolean dBa = i % a == 0;
                boolean dBb = i % b == 0;

                if (dBa || dBb) {
                    count++;
                }

                i++;
            }
        System.out.println(count);
    }


}
