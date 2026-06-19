/*
 * Zeigt Binärdarstellung und ASCII-Werte – ideal für Systemtechnik-Einsteiger.
 */
public class BinaerUndAscii {
    public static void main(String[] args) {
        // Dezimal -> Binär
        int zahl = 91;
        System.out.println(zahl + " binär = " + Integer.toBinaryString(zahl));

        // Binär (als Text) -> Dezimal
        int wert = Integer.parseInt("01011011", 2);
        System.out.println("01011011 dezimal = " + wert);

        // Zeichen <-> ASCII/Unicode-Code
        char c = 'A';
        int code = c;                 // char wird automatisch zu int
        System.out.println("'" + c + "' hat Code " + code);

        char zurueck = (char) 97;     // Code -> Zeichen (Cast nötig)
        System.out.println("Code 97 ist '" + zurueck + "'");

        // ganzes Alphabet über Codes ausgeben
        System.out.print("A-Z: ");
        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i);
        }
        System.out.println();
    }
}
