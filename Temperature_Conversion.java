import java.util.Scanner;

/**
 * Say you are from Spain and all you understand is degrees in Celsius
 * Now with my java program, you can convert F to C!
 */
public class Temperature_Conversion {
    public static void main(String[] args) {
        Double Fahr;
        Double Cels;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter the Fahrenheit temperature you don't understand: ");
        Fahr = in.nextDouble();

        Cels = (Fahr - 32) * 5.0/9.0;
        System.out.println("The temperature in celsius is: " + Cels);

        System.exit(0);
    }
}
