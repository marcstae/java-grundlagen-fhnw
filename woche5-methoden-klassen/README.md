# Woche 5 – Methods & Classes (OOP – Modifiers)

**w3schools:** Java Methods, Method Parameters, Method Overloading, Recursion,
Java OOP, Modifiers
**ETH-Modul:** 4 (Methoden und Funktionen)

## Lernziele
- Eigene Methoden mit/ohne Rückgabewert und mit Parametern schreiben.
- Methoden überladen (overloading).
- Gültigkeitsbereich (scope) von Variablen verstehen.
- Rekursion anwenden (Fakultät, Fibonacci).
- Erste Fehlerbehandlung mit `try` / `catch` / `throw`.

## Kurztheorie

Eine **Methode** ist eine wiederverwendbare funktionale Einheit. Aufbau:
```java
public static rueckgabetyp name(parameter) {
    // Anweisungen
}
```
- **Prozedur** = kein Rückgabewert -> Rückgabetyp `void`.
- **Funktion** = mit Rückgabewert -> `return wert;` (Typ muss passen, in **jedem**
  Pfad muss zurückgegeben werden).
- **Parameter** sind Variablen, die beim Aufruf mit Argumenten gefüllt werden.

**Überladen:** gleicher Name, aber unterschiedliche Parameter (Anzahl/Typ). Ein
anderer Rückgabetyp allein genügt nicht.

**Scope:** Eine in einer Methode/Schleife deklarierte Variable existiert nur dort.

**Rekursion:** Eine Methode ruft sich selbst auf. Braucht zwingend einen
**Basisfall** (Abbruch) und einen **rekursiven Aufruf** Richtung Basisfall.

**Exceptions:** Fehler zur Laufzeit abfangen, statt das Programm abstürzen zu lassen:
```java
try {
    zahl = Integer.parseInt(text);
} catch (Exception e) {
    System.out.println("Keine gültige Zahl.");
}
```
Selbst auslösen mit `throw new Exception(...)`; die Methode braucht dann
`throws Exception` in der Signatur.

## Beispiele ausführen
```bash
cd examples
javac Methoden.java && java Methoden
javac Rekursion.java && java Rekursion
javac Exceptions.java && java Exceptions
```

## Übung
`uebungen/Uebung05_Mathe.java`: eine kleine Methoden-Toolbox (Quadrat, Maximum,
Fakultät) vervollständigen.
