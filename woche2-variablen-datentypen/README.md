# Woche 2 – Variables, Data Types & Strings

**w3schools:** Java Variables, Data Types, Type Casting, Strings, User Input
**ETH-Modul:** 1 (Variablen und Datentypen)

## Lernziele
- Variablen deklarieren, initialisieren, neu zuweisen.
- Die wichtigsten Datentypen und ihre Grössen kennen.
- Implizite vs. explizite Typkonvertierung (Typecasting) verstehen.
- Mit `String` arbeiten und Tastatureingaben über `Scanner` einlesen.

## Kurztheorie

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

## Beispiele ausführen
```bash
cd examples
javac Variablen.java && java Variablen
javac Typecasting.java && java Typecasting
javac Eingabe.java && java Eingabe      # erwartet Tastatureingaben
```

## Übung
`uebungen/Uebung02_Rechner.java`: zwei Zahlen einlesen und Summe, Differenz,
Produkt, Quotient ausgeben.
