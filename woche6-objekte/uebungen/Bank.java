/*
 * ÜBUNG 6 – Bank (Teil 2 von 2). Enthält die main-Methode.
 * Diese Datei NICHT verändern – sie testet deine Konto-Klasse.
 *
 * Ausführen:  javac *.java   &&   java Bank
 */
public class Bank {
    public static void main(String[] args) {
        Konto k = new Konto();
        k.inhaber = "Anna";
        k.saldo = 100.0;

        k.einzahlen(50.0);     // -> 150
        k.abheben(30.0);       // -> 120
        k.abheben(1000.0);     // -> zu wenig Guthaben, bleibt 120
        k.print();             // erwartet: Konto von Anna: 120.0 CHF
    }
}
