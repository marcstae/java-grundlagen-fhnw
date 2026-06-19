/*
 * Zeigt den Unterschied zwischen print und println
 * und wie man Text mit Werten verbindet.
 */
public class Ausgabe {
    public static void main(String[] args) {
        // println: jede Ausgabe auf eigener Zeile
        System.out.println("Zeile 1");
        System.out.println("Zeile 2");

        // print: bleibt auf derselben Zeile
        System.out.print("kein ");
        System.out.print("Umbruch");
        System.out.println();  // erzwingt jetzt einen Umbruch

        // Text und Zahlen mit + verbinden
        int jahr = 2026;
        System.out.println("Studienbeginn: " + jahr);
        System.out.println("In " + (jahr - 2025) + " Jahr geht es los.");
    }
}
