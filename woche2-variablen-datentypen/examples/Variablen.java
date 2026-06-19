/*
 * Deklaration, Initialisierung, Neuzuweisung und Konstanten.
 */
public class Variablen {
    public static void main(String[] args) {
        // Deklaration + Initialisierung in einer Zeile
        int meineZahl = 4;
        System.out.println("meineZahl = " + meineZahl);

        // Neuzuweisung: alter Wert wird überschrieben
        meineZahl = 6;
        System.out.println("meineZahl = " + meineZahl);

        // verschiedene Datentypen
        double kommaZahl = 3.14;
        char zeichen = 'A';
        boolean istStudent = true;
        String name = "Anna";

        System.out.println("kommaZahl  = " + kommaZahl);
        System.out.println("zeichen    = " + zeichen);
        System.out.println("istStudent = " + istStudent);
        System.out.println("name       = " + name);

        // Konstante: nach Initialisierung unveränderbar
        final int MAX = 100;
        System.out.println("Konstante MAX = " + MAX);
        // MAX = 200;  // <- würde einen Compilerfehler geben
    }
}
