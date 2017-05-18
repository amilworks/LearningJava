/**
 * Super basic Fibonacci sequence calculator maker generator
 * Wrote this program two different ways and finally this one worked
 */
public class Fibonacci {
    public static void main(String a[]) {

        // You can change the count to whatever the hell you want
        // but it might break. Picked 24 for Kobe.
        int count = 24;
        int[] fib = new int[count];
        fib[0] = 0;
        fib[1] = 1;
        for(int i = 2; i < count; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }

        for(int i = 0; i < count; i++) {
            // Don't forget the space " " or you will end up with one long ass number
            System.out.print(fib[i] + " ");
        }
    }

}
