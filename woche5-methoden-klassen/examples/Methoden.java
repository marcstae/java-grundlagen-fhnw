/*
 * Prozedur, Funktion, Parameter und Überladen.
 */
public class Methoden {

    // Prozedur: kein Rückgabewert (void)
    public static void begruessung() {
        System.out.println("Hallo aus einer Methode!");
    }

    // Funktion mit Parametern und Rückgabewert
    public static int addiere(int x, int y) {
        return x + y;
    }

    // Überladen: gleicher Name, andere Parameteranzahl
    public static int addiere(int x, int y, int z) {
        return x + y + z;
    }

    public static void main(String[] args) {
        begruessung();

        int summe2 = addiere(3, 4);
        int summe3 = addiere(3, 4, 5);
        System.out.println("addiere(3,4)   = " + summe2);
        System.out.println("addiere(3,4,5) = " + summe3);
    }
}
