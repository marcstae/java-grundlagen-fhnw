/*
 * if / else if / else anhand einer Temperatur.
 */
public class Verzweigungen {
    public static void main(String[] args) {
        int temperatur = 18;

        if (temperatur >= 25) {
            System.out.println("Warm – T-Shirt-Wetter.");
        } else if (temperatur >= 10) {
            System.out.println("Mild – eine Jacke reicht.");
        } else if (temperatur >= 0) {
            System.out.println("Kalt – warm anziehen.");
        } else {
            System.out.println("Frost – Mütze nicht vergessen.");
        }

        // logische Operatoren in einer Bedingung kombinieren
        boolean wochenende = true;
        if (temperatur >= 15 && wochenende) {
            System.out.println("Gute Bedingungen für einen Ausflug.");
        }
    }
}
