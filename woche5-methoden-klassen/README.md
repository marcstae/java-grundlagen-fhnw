# Woche 5 – Methods & Classes (OOP – Modifiers)

## 🎯 Lernziele
- Eigene Methoden mit/ohne Rückgabewert und mit Parametern schreiben.
- Methoden überladen (overloading).
- Gültigkeitsbereich (scope) von Variablen verstehen.
- Rekursion anwenden (Fakultät, Fibonacci).
- Erste Fehlerbehandlung mit `try` / `catch` / `throw`.

## 📝 Schritt-für-Schritt Anleitung (DAU-sicher)
Bitte HALTE DICH GENAU an diese Reihenfolge. Nichts überspringen!

**1. Theorie lesen (Grundlagen)**
* Lies auf **w3schools** folgende Kapitel: *Java Methods, Method Parameters, Method Overloading, Scope, Recursion, Java OOP, Modifiers*
* Lies das Begleit-PDF der ETH: [p_java4_TH.pdf](https://doc.et.ethz.ch/latest/p_java4_TH.pdf) (Modul 4)

**2. Abschreiben & Verstehen (Nicht kopieren!)**
* Öffne den Ordner `examples/`.
* Mache dich mit den Beispielen vertraut (`Methoden.java`, `Rekursion.java`, `Exceptions.java`).
* Tippe den Code **selbst ab**! Probier Parameter zu ändern oder eine eigene neue Methode dazuzuschreiben.
  ```bash
  cd examples
  javac Methoden.java && java Methoden
  javac Rekursion.java && java Rekursion
  javac Exceptions.java && java Exceptions
  ```

**3. Übungen lösen (Selber schwitzen)**
* Öffne `uebungen/Uebung05_Mathe.java` und ergänze die fehlenden Methoden gemäss den `TODO`s.
* Probiere es selbst, die Parameter und Return-Werte richtig einzusetzen.
  ```bash
  cd ../uebungen
  javac Uebung05_Mathe.java && java Uebung05_Mathe
  ```

**4. Lösung kontrollieren & Abhaken**
* Wenn dein Programm korrekte Ergebnisse zurückgibt, ziehe den Vergleich mit `loesungen/`.
* Wechsle ins Hauptverzeichnis zu `FORTSCHRITT.md` und hake diese Woche sauber ab.

---

## 🧠 Kurztheorie

Eine **Methode** ist eine wiederverwendbare funktionale Einheit. Aufbau:
```java
public static rueckgabetyp name(parameter) {
    // Anweisungen
}
```
- **Prozedur** = kein Rückgabewert -> Rückgabetyp `void`.
- **Funktion** = mit Rückgabewert -> `return wert;` (Typ muss passen, in **jedem** Pfad muss zurückgegeben werden).
- **Parameter** sind Variablen, die beim Aufruf mit Argumenten gefüllt werden.

**Überladen:** gleicher Name, aber unterschiedliche Parameter (Anzahl/Typ). Ein anderer Rückgabetyp allein genügt nicht.

**Scope:** Eine in einer Methode/Schleife deklarierte Variable existiert nur dort.

**Rekursion:** Eine Methode ruft sich selbst auf. Braucht zwingend einen **Basisfall** (Abbruch) und einen **rekursiven Aufruf** Richtung Basisfall.

**Exceptions:** Fehler zur Laufzeit abfangen, statt das Programm abstürzen zu lassen:
```java
try {
    zahl = Integer.parseInt(text);
} catch (Exception e) {
    System.out.println("Keine gültige Zahl.");
}
```
Selbst auslösen mit `throw new Exception(...)`; die Methode braucht dann `throws Exception` in der Signatur.
