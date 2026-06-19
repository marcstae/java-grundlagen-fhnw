# Woche 1 – Introduction & Output

## 🎯 Lernziele
- Verstehen, was ein Programm, ein Algorithmus, Syntax und Semantik sind.
- Den Aufbau eines minimalen Java-Programms kennen (Klasse + `main`).
- Text und Werte auf der Konsole ausgeben.
- Kommentare schreiben.

## 📝 Schritt-für-Schritt Anleitung (DAU-sicher)
Bitte HALTE DICH GENAU an diese Reihenfolge. Nichts überspringen!

**1. Theorie lesen (Grundlagen)**
* Lies auf **w3schools** folgende Kapitel: *Java Home, Intro, Get Started, Syntax, Comments, Output*
* Lies das Begleit-PDF der ETH: [p_java0_TH.pdf](https://doc.et.ethz.ch/latest/p_java0_TH.pdf) (Modul 0)

**2. Abschreiben & Verstehen (Nicht kopieren!)**
* Öffne den Ordner `examples/`.
* Mache dich mit den Beispielen vertraut (`HalloWelt.java`, `Ausgabe.java`).
* Tippe den Code **selbst ab** – entweder in eine neue leere Datei oder indem du den Inhalt löschst. **Kein Copy-Paste!**
* Führe deinen Code aus und verändere absichtlich Werte, um zu sehen, wie sich das Programm verhält:
  ```bash
  cd examples
  javac HalloWelt.java && java HalloWelt
  javac Ausgabe.java && java Ausgabe
  ```

**3. Übungen lösen (Selber schwitzen)**
* Öffne `uebungen/Uebung01_Steckbrief.java` und ergänze den Code bei den Kommentaren mit `TODO`. 
* Probiere es mindestens 20 Minuten selbst aus! Erst wenn du steckst, suchst du die Fehlermeldung.
  ```bash
  cd ../uebungen
  javac Uebung01_Steckbrief.java && java Uebung01_Steckbrief
  ```

**4. Lösung kontrollieren & Abhaken**
* Wenn dein Programm *absolut fehlerfrei* läuft, vergleiche deine Lösung mit `loesungen/`.
* Zurück im Hauptverzeichnis: Öffne `FORTSCHRITT.md` und hake diese Woche Punkt für Punkt ab.

---

## 🧠 Kurztheorie

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
- auf die Konstole mit `+` verbunden.

Kommentare: `// Zeile` oder `/* Block über mehrere Zeilen */`. Der Compiler
ignoriert sie.