import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        //Beregner arealet af en cirkel
        int r = 14;
        double result = r * r * 3.14;
        System.out.println(result);


        //Beregner arealet ud fra brugerens input
        //Laver en scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number for radius: ");
        //Henter brugerens input som double (radius)
        double radius = input.nextDouble();

        System.out.println("Radius er: " + radius);

        //Beregner arealet ud fra brugerens input
        double areal = radius * radius * 3.14;
        System.out.println("Arealet er: " + areal);

    }
}
