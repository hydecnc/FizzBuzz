package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(1000, 3, 5));
    }

    public static int multiples(int n, int a, int b) {

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
        return count;
    }


}
