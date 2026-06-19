/*
 * Erzeugt und verwendet Person-Objekte. Enthält die main-Methode.
 */
public class Personalverwaltung {
    public static void main(String[] args) {
        // erstes Objekt
        Person p1 = new Person();
        p1.vorname = "Andreas";
        p1.name = "Müller";
        p1.jahrgang = 1990;
        p1.beruf = "Informatiker";

        // zweites, eigenständiges Objekt (neues new!)
        Person p2 = new Person();
        p2.vorname = "Maria";
        p2.name = "Meier";
        p2.jahrgang = 2001;
        p2.beruf = "Studentin";

        p1.print();
        p2.print();

        System.out.println(p1.vorname + " ist " + p1.alter(2026) + " Jahre alt.");

        // Referenz-Stolperstein demonstrieren:
        Person p3 = p1;            // KEIN neues Objekt – p3 zeigt auf p1
        p3.beruf = "Architekt";    // ändert auch p1, weil dasselbe Objekt
        System.out.println("Nach Änderung über p3:");
        p1.print();                // Beruf ist jetzt Architekt
    }
}
