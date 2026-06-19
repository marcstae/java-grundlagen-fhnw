/*
 * Die Klasse Person: Bauplan mit Attributen und einer Objektmethode.
 * (Keine main-Methode – diese Klasse wird von Personalverwaltung benutzt.)
 */
public class Person {
    // Attribute (Objektvariablen) – speichern den Zustand eines Objekts
    String name;
    String vorname;
    int jahrgang;
    String beruf;

    // Objektmethode: gibt die Personendaten aus
    void print() {
        System.out.println(vorname + " " + name + ", *" + jahrgang
                           + ", " + beruf);
    }

    // Objektmethode mit Parameter und Rückgabewert
    int alter(int aktuellesJahr) {
        return aktuellesJahr - jahrgang;
    }
}
