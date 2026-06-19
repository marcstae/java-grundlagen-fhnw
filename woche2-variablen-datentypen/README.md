# Woche 2 – Variables, Data Types & Strings

## 🎯 Lernziele
- Variablen deklarieren, initialisieren, neu zuweisen.
- Die wichtigsten Datentypen und ihre Grössen kennen.
- Implizite vs. explizite Typkonvertierung (Typecasting) verstehen.
- Mit `String` arbeiten und Tastatureingaben über `Scanner` einlesen.

## 📝 Schritt-für-Schritt Anleitung (DAU-sicher)
Bitte HALTE DICH GENAU an diese Reihenfolge. Nichts überspringen!

**1. Theorie lesen (Grundlagen)**
* Lies auf **w3schools** folgende Kapitel: *Java Variables, Data Types, Type Casting, Strings, User Input*
* Lies das Begleit-PDF der ETH: [p_java1_TH.pdf](https://doc.et.ethz.ch/latest/p_java1_TH.pdf) (Modul 1)

**2. Abschreiben & Verstehen (Nicht kopieren!)**
* Öffne den Ordner `examples/`.
* Mache dich mit den Beispielen vertraut (`Variablen.java`, `Typecasting.java`, `Eingabe.java`).
* Tippe den Code **selbst ab** – Kopieren ist verboten! Dein Gehirn muss sich die Befehle "ertippen".
* Führe den Code aus und spiele mit den Werten (ändere z.B. mal einen `int` zu einem `double` und schau was passiert):
  ```bash
  cd examples
  javac Variablen.java && java Variablen
  javac Typecasting.java && java Typecasting
  javac Eingabe.java && java Eingabe      # erwartet Tastatureingabent
  ```

**3. Übungen lösen (Selber schwitzen)**
* Öffne `uebungen/Uebung02_Rechner.java` und ergänze den Code. 
* Bleib am Ball, auch wenn es nicht sofort klappt!
  ```bash
  cd ../uebungen
  javac Uebung02_Rechner.java && java Uebung02_Rechner
  ```

**4. Lösung kontrollieren & Abhaken**
* Wenn dein Programm zwei Zahlen problemlos zusammenrechnet (ohne crashen), vergleiche deine Lösung mit `loesungen/`.
* Gehe zu `FORTSCHRITT.md` im Hauptverzeichnis und hake die Aufgaben ab.

---

## 🧠 Kurztheorie

Eine **Variable** ist ein benannter Speicherbereich. Drei Schritte:
1. **Deklaration** – Typ + Name: `int a;`
2. **Initialisierung** – erste Wertzuweisung: `a = 4;`
3. weitere **Zuweisungen** überschreiben den alten Wert.

Wichtige Datentypen (Grösse in Bit):

| Typ | Art | Bit | Beispiel |
|-----|-----|----:|----------|
| `boolean` | Wahrheitswert | 1 | `true` / `false` |
| `char` | Zeichen | 16 | `'A'` |
| `int` | Ganzzahl | 32 | `42` |
| `long` | Ganzzahl | 64 | `42L` |
| `double` | Gleitkomma | 64 | `3.14` |
| `float` | Gleitkomma | 32 | `3.14f` |

**Konstante:** mit `final`, danach unveränderbar: `final int K = 4;`

**Typkonvertierung:**
- *implizit* (automatisch), wenn kein Informationsverlust droht: `int -> double`.
- *explizit* (Typecasting) nötig, wenn der Zieltyp kleiner ist: `float f = (float) d;`

**String** ist kein primitiver Typ (es ist eine Klasse). Werte in `"..."`,
Verkettung mit `+`.

**Eingabe** über die Tastatur mit `Scanner`:
```java
import java.util.Scanner;
Scanner eingabe = new Scanner(System.in);
int x = eingabe.nextInt();      // oder nextDouble(), nextLine() ...
```
