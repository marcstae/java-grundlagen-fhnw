/*
 * LÖSUNG zu Übung 2 – Mini-Rechner
 */
import java.util.Scanner;

public class Uebung02_Rechner {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);

        System.out.print("Erste Zahl: ");
        int a = eingabe.nextInt();

        System.out.print("Zweite Zahl: ");
        int b = eingabe.nextInt();

        System.out.println("Summe:     " + (a + b));
        System.out.println("Differenz: " + (a - b));
        System.out.println("Produkt:   " + (a * b));
        System.out.println("Quotient:  " + (a / b) + "  (Ganzzahldivision!)");
        System.out.println("Rest:      " + (a % b));

        eingabe.close();
    }
}
