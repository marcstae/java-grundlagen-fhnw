/*
 * Array erzeugen, füllen, durchlaufen, length nutzen.
 */
public class Arrays {
    public static void main(String[] args) {
        // direkt initialisiert
        int[] zahlen = {12, 13, 15, 17, 22, 32};

        // durchlaufen mit length
        System.out.println("Alle Werte:");
        for (int i = 0; i < zahlen.length; i++) {
            System.out.println("  Index " + i + " -> " + zahlen[i]);
        }

        // einzelnes Element ändern
        zahlen[0] = 99;
        System.out.println("Erstes Element jetzt: " + zahlen[0]);

        // leeres Array mit Default-Werten (0)
        int[] leer = new int[3];
        System.out.println("Default-Wert int: " + leer[1]);
    }
}
