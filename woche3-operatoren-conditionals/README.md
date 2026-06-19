# Woche 3 – Operators & Conditionals

**w3schools:** Java Operators, Java Math, Java Booleans, Java If...Else, Java Switch
**ETH-Modul:** 2, Kapitel 1–3 (Operatoren, Logik, Verzweigungen)

## Lernziele
- Arithmetische, relationale und logische Operatoren sicher anwenden.
- Wahrheitswerte (`boolean`) verstehen und kombinieren.
- Programme mit `if` / `else if` / `else` verzweigen.
- Die `switch`-Anweisung mit `break` und `default` einsetzen.

## Kurztheorie

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

## Beispiele ausführen
```bash
cd examples
javac Operatoren.java && java Operatoren
javac Verzweigungen.java && java Verzweigungen
javac SwitchBeispiel.java && java SwitchBeispiel
```

## Übung
`uebungen/Uebung03_Notenrechner.java`: Punktzahl einlesen und in eine Schweizer
Note (1–6) bzw. bestanden/nicht bestanden umsetzen.
