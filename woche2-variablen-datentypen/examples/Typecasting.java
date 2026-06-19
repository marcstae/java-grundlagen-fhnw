/*
 * Implizite und explizite Typkonvertierung.
 */
public class Typecasting {
    public static void main(String[] args) {
        // IMPLIZIT: int passt verlustfrei in double -> automatisch
        int ganzeZahl = 9;
        double alsDouble = ganzeZahl;
        System.out.println("implizit int->double: " + alsDouble);

        // EXPLIZIT: double in int -> Nachkommastellen gehen verloren, Cast nötig
        double pi = 3.99;
        int abgeschnitten = (int) pi;   // wird zu 3 (nicht gerundet!)
        System.out.println("explizit double->int: " + abgeschnitten);

        // Klassischer Stolperstein: Ganzzahldivision
        System.out.println("7 / 2     = " + (7 / 2));       // 3 (int-Division)
        System.out.println("7 / 2.0   = " + (7 / 2.0));     // 3.5
        System.out.println("7 % 2     = " + (7 % 2));       // 1 (Rest)
    }
}
