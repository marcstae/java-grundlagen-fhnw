# Woche 6 – Objects

**w3schools:** Java Classes/Objects, Class Attributes, Class Methods, Constructors
**ETH-Modul:** 5 (Objekte)

## Lernziele
- Den Unterschied zwischen Klasse (Bauplan) und Objekt (Instanz) verstehen.
- Attribute (Objektvariablen) und Objektmethoden schreiben.
- Objekte mit `new` erzeugen und auf Attribute/Methoden mit `.` zugreifen.
- Den Unterschied zwischen primitiven Typen und Referenztypen kennen.

## Kurztheorie

In der **objektorientierten Programmierung** (OOP) fasst man Daten und ihre
Funktionalität zusammen. Eine **Klasse** ist der Bauplan; ein **Objekt** ist eine
konkrete Instanz davon.

```java
public class Person {
    // Attribute (Objektvariablen) – halten den Zustand
    String name;
    int jahrgang;

    // Objektmethode – arbeitet mit den Attributen
    void print() {
        System.out.println(name + " (" + jahrgang + ")");
    }
}
```

Objekt erzeugen und nutzen:
```java
Person p = new Person();   // Instanz erzeugen
p.name = "Müller";          // Attribut setzen (Punkt-Operator)
p.jahrgang = 1990;
p.print();                  // Methode aufrufen
```

**Primitive Typen vs. Referenztypen** – der wichtigste OOP-Stolperstein:

| | primitiv (`int`, `double`, …) | Referenztyp (Objekte, `String`) |
|---|---|---|
| Default | `0` | `null` |
| Zuweisung `b = a` | kopiert den **Wert** | kopiert die **Referenz** (beide zeigen aufs selbe Objekt) |
| an Methode übergeben | nur Kopie, Original unverändert | Methode kann den **Inhalt** des Objekts ändern |

Merke: `Person p2 = p1;` erzeugt **kein** neues Objekt – `p1` und `p2` zeigen auf
dasselbe. Für ein echtes zweites Objekt brauchst du wieder `new`.

## Beispiele ausführen
Hier gibt es zwei zusammengehörige Dateien. Erst beide kompilieren, dann die
Klasse mit `main` starten:
```bash
cd examples
javac *.java
java Personalverwaltung
```

## Übung
`uebungen/`: Eine Klasse `Konto` vervollständigen (einzahlen/abheben) und in
`Bank` verwenden. Erst `javac *.java`, dann `java Bank`.
