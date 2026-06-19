/*
 * LÖSUNG zu Übung 6 – Bank (Testklasse)
 */
public class Bank {
    public static void main(String[] args) {
        Konto k = new Konto();
        k.inhaber = "Anna";
        k.saldo = 100.0;

        k.einzahlen(50.0);
        k.abheben(30.0);
        k.abheben(1000.0);
        k.print();
    }
}
