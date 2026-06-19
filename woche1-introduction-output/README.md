# Woche 1 – Introduction & Output

**w3schools:** Java Home, Intro, Get Started, Syntax, Comments, Output
**ETH-Modul:** 0 (Programme erstellen in Java)

## Lernziele
- Verstehen, was ein Programm, ein Algorithmus, Syntax und Semantik sind.
- Den Aufbau eines minimalen Java-Programms kennen (Klasse + `main`).
- Text und Werte auf der Konsole ausgeben.
- Kommentare schreiben.

## Kurztheorie

Ein **Algorithmus** ist eine Bearbeitungsvorschrift, die immer endet und für jede
Eingabe ein sinnvolles Ergebnis liefert. In einer **Programmiersprache** (hier Java)
schreiben wir ihn so auf, dass ein Computer ihn ausführen kann.

- **Syntax** = die Regeln, wie Code aufgebaut sein muss. Ein Verstoss = Compilerfehler.
- **Semantik** = was das Programm beim Ausführen tatsächlich bewirkt.
- Der **Compiler** (`javac`) übersetzt deinen **Quellcode** (`.java`) in **Bytecode**
  (`.class`), den die Java-Laufzeit ausführt.

Ein Java-Programm startet immer in der **`main`-Methode**. Der Klassenname muss
exakt dem Dateinamen entsprechen.

Ausgabe auf der Konsole:
- `System.out.println(...)` – gibt aus **mit** Zeilenumbruch.
- `System.out.print(...)` – gibt aus **ohne** Zeilenumbruch.
- Text und Werte werden mit `+` verbunden.

Kommentare: `// Zeile` oder `/* Block über mehrere Zeilen */`. Der Compiler
ignoriert sie.

## Beispiele ausführen
```bash
cd examples
javac HalloWelt.java && java HalloWelt
javac Ausgabe.java && java Ausgabe
```

## Übung
Öffne `uebungen/Uebung01_Steckbrief.java`, fülle die `TODO`s aus, dann:
```bash
cd uebungen
javac Uebung01_Steckbrief.java && java Uebung01_Steckbrief
```
Vergleiche erst danach mit `loesungen/`.
