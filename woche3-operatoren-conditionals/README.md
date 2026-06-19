# Woche 3 – Operators & Conditionals

## 🎯 Lernziele
- Arithmetische, relationale und logische Operatoren sicher anwenden.
- Wahrheitswerte (`boolean`) verstehen und kombinieren.
- Programme mit `if` / `else if` / `else` verzweigen.
- Die `switch`-Anweisung mit `break` und `default` einsetzen.

## 📝 Schritt-für-Schritt Anleitung (DAU-sicher)
Bitte HALTE DICH GENAU an diese Reihenfolge. Nichts überspringen!

**1. Theorie lesen (Grundlagen)**
* Lies auf **w3schools** folgende Kapitel: *Java Operators, Java Math, Java Booleans, Java If...Else, Java Switch*
* Lies das Begleit-PDF der ETH: [p_java2_TH.pdf](https://doc.et.ethz.ch/latest/p_java2_TH.pdf) (nur Kapitel 1 bis 3!)

**2. Abschreiben & Verstehen (Nicht kopieren!)**
* Öffne den Ordner `examples/`.
* Mache dich mit den Beispielen vertraut (`Operatoren.java`, `Verzweigungen.java`, `SwitchBeispiel.java`).
* Tippe den Code **selbst ab** in eine leere Datei. Verändere dann z.B. mal eine Bedingung von `==` auf `!=`.
  ```bash
  cd examples
  javac Operatoren.java && java Operatoren
  javac Verzweigungen.java && java Verzweigungen
  javac SwitchBeispiel.java && java SwitchBeispiel
  ```

**3. Übungen lösen (Selber schwitzen)**
* Öffne `uebungen/Uebung03_Notenrechner.java` und ergänze den Code gemäss den `TODO` Kommentaren.
* Lass den Compiler zu deinem Freund werden. Verstehe seine Fehlermeldungen!
  ```bash
  cd ../uebungen
  javac Uebung03_Notenrechner.java && java Uebung03_Notenrechner
  ```

**4. Lösung kontrollieren & Abhaken**
* Wenn dein Programm alle Fälle (grobe Noten, halbe Noten etc.) korrekt fängt, vergleiche mit `loesungen/`.
* Gehe zu `FORTSCHRITT.md` im Hauptverzeichnis und hake die Aufgaben ab.

---

## 🧠 Kurztheorie

**Arithmetisch:** `+  -  *  /  %`  (`%` = ganzzahliger Rest).
Kurzformen: `i += 5;` (= `i = i + 5;`), `i++;`, `i--;`.

**Relational** (Ergebnis ist `boolean`):

| Operator | bedeutet |
|----------|----------|
| `>` `<` | grösser / kleiner |
| `>=` `<=` | grösser-gleich / kleiner-gleich |
| `==` | gleich (Achtung: **nicht** `=`) |
| `!=` | ungleich |

**Logisch:** `&&` (UND), `||` (ODER), `!` (NICHT), `^` (XOR).
`&&` und `||` werten "kurzschlüssig" aus: steht das Ergebnis schon fest, wird der
zweite Operand nicht mehr geprüft.

**Verzweigungen:**
```java
if (bedingung) { ... }
else if (andereBedingung) { ... }
else { ... }
```

**switch** prüft nur auf Gleichheit (ganzzahlige Typen oder String). Ohne `break`
laufen die Fälle "durch" (fall-through); `default` ist der Auffangfall.
