/*
 * LÖSUNG zu Übung 6 – Klasse Konto
 */
public class Konto {
    String inhaber;
    double saldo;

    void einzahlen(double betrag) {
        saldo += betrag;
    }

    void abheben(double betrag) {
        if (betrag <= saldo) {
            saldo -= betrag;
        } else {
            System.out.println("Zu wenig Guthaben für " + betrag + " CHF.");
        }
    }

    void print() {
        System.out.println("Konto von " + inhaber + ": " + saldo + " CHF");
    }
}
