# Woche 6 – Objects

## 🎯 Lernziele
- Den Unterschied zwischen Klasse (Bauplan) und Objekt (Instanz) verstehen.
- Attribute (Objektvariablen) und Objektmethoden schreiben.
- Objekte mit `new` erzeugen und auf Attribute/Methoden mit `.` zugreifen.
- Den Unterschied zwischen primitiven Typen und Referenztypen kennen.

## 📝 Schritt-für-Schritt Anleitung (DAU-sicher)
Bitte HALTE DICH GENAU an diese Reihenfolge. Nichts überspringen!

**1. Theorie lesen (Grundlagen)**
* Lies auf **w3schools** folgende Kapitel: *Java OOP, Java Classes/Objects, Java Class Attributes, Java Class Methods, Java Constructors*
* Lies das Begleit-PDF der ETH: [p_java5_TH.pdf](https://doc.et.ethz.ch/latest/p_java5_TH.pdf) (Modul 5)

**2. Abschreiben & Verstehen (Nicht kopieren!)**
* Öffne den Ordner `examples/`.
* Mache dich mit den Beispielen vertraut (`Person.java`, `Personalverwaltung.java`).
* Tippe den Code **selbst ab**! Erstelle mal ein eigenes Objekt mit deinen eigenen Attributen.
  ```bash
  cd examples
  javac *.java
  java Personalverwaltung
  ```

**3. Übungen lösen (Selber schwitzen)**
* Öffne `uebungen/Bank.java` und `uebungen/Konto.java` und ergänze die `TODO`s.
* OOO (Objektorientiertes Programmieren) ist oft der schwierigste Schritt. Nimm dir die Zeit, die du brauchst!
  ```bash
  cd ../uebungen
  javac *.java
  java Bank
  ```

**4. Lösung kontrollieren & Abhaken**
* Sobald deine Bank ein- und auszahlt wie sie soll, überprüfe deinen Code mit den Dateien im `loesungen/` Ordner.
* Gehe ins Hauptverzeichnis zu `FORTSCHRITT.md` und hake deine letzte Woche ab! 🎉

---

## 🧠 Kurztheorie

In der **objektorientierten Programmierung** (OOP) fasst man Daten und ihre Funktionalität zusammen. Eine **Klasse** ist der Bauplan; ein **Objekt** ist eine konkrete Instanz davon.

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

Merke: `Person p2 = p1;` erzeugt **kein** neues Objekt – `p1` und `p2` zeigen auf dasselbe. Für ein echtes zweites Objekt brauchst du wieder `new`.
