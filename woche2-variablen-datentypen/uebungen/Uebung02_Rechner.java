/*
 * ÜBUNG 2 – Mini-Rechner
 * Ziel: Variablen, Eingabe und arithmetische Operatoren.
 *
 * Aufgabe: Lies zwei ganze Zahlen von der Tastatur ein und gib aus:
 *   Summe, Differenz, Produkt, (Ganzzahl-)Quotient und Rest (Modulo).
 *
 * Tipp: Scanner ist schon vorbereitet. Fülle die TODOs aus.
 */
import java.util.Scanner;

public class Uebung02_Rechner {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);

        System.out.print("Erste Zahl: ");
        int a = eingabe.nextInt();

        System.out.print("Zweite Zahl: ");
        int b = eingabe.nextInt();

        // TODO: Summe berechnen und ausgeben (a + b)

        // TODO: Differenz ausgeben (a - b)

        // TODO: Produkt ausgeben (a * b)

        // TODO: Quotient ausgeben (a / b)  -- was passiert bei Ganzzahlen?

        // TODO: Rest ausgeben (a % b)

        eingabe.close();
    }
}
