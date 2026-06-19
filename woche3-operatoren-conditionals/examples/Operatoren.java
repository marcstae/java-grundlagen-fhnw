/*
 * Arithmetische, relationale und logische Operatoren.
 */
public class Operatoren {
    public static void main(String[] args) {
        int a = 7, b = 3;

        // Arithmetik
        System.out.println("a + b = " + (a + b));
        System.out.println("a / b = " + (a / b) + "  (Ganzzahl)");
        System.out.println("a % b = " + (a % b) + "  (Rest)");

        // Kurzform und Increment
        int i = 10;
        i += 5;   // i = 15
        i++;      // i = 16
        System.out.println("i = " + i);

        // Relationale Operatoren liefern boolean
        System.out.println("a > b ? " + (a > b));
        System.out.println("a == b ? " + (a == b));

        // Logische Operatoren
        boolean sonnig = true;
        boolean warm = false;
        System.out.println("sonnig && warm = " + (sonnig && warm));
        System.out.println("sonnig || warm = " + (sonnig || warm));
        System.out.println("!sonnig        = " + (!sonnig));
    }
}
