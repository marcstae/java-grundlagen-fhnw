# Java-Grundlagen – Vorbereitung BSc Informatik (FHNW Windisch)

Ein Lern-Repository, das dich in **sechs Wochen** durch die Java-Grundlagen führt –
genau nach dem Vorbereitungsplan der FHNW (w3schools "Java Tutorial" + ETH-Tutorial).

Es ist für den Einstieg gedacht, wenn du eher aus der **Systemtechnik** kommst und
die Applikationsentwicklung neu für dich ist. Jede Woche hat: kurze Theorie in eigenen
Worten, **lauffähige Beispiele** und **Übungen mit Lösungen**.

---

## So lernst du mit diesem Repo (DAU-sichere Methode)

Um sicherzustellen, dass die Lernqualität immer hoch bleibt und du dich nicht selbst "betrügst", halte dich zwingend an diese Reihenfolge. Keine Abkürzungen!

1. **Lernziele klären:** Das `README.md` der Woche lesen, um zu wissen, worum es geht.
2. **Theorie & Verstehen:** Die verlinkten w3schools-Kapitel und ETH-PDFs lesen. 
3. **Abtippen, nicht kopieren:** Die Dateien im Ordner `examples/` öffnen. Versuche, den Code selbst in eine leere Datei abzutippen (Copy-Paste ist **verboten**!). Führe ihn aus und **verändere** absichtlich Werte, um zu sehen, was passiert, wenn etwas falsch ist oder anders läuft.
4. **Selber schwitzen:** Die `uebungen/` lösen. Nicht direkt aufgeben! Probiere mindestens 20-30 Minuten selbst. Erst wenn du einen *Compiler Error* hast, googelst du die Fehlermeldung.
5. **Code Validation:** Läuft das Programm ohne Fehler? Macht es das, was die Aufgabe verlangt? Erst wenn es absolut fehlerfrei kompiliert und läuft, geht es weiter.
6. **Solution Check:** Jetzt erst in `loesungen/` schauen. Was hast du gut gemacht? Wo weicht deine Lösung ab?
7. **Erklären (Feynman-Methode):** Erkläre dir selbst (oder deinem Hund / einer Gummiente) *laut*, was du gerade gelernt hast.
8. **Tracker:** Die jeweilige Checkbox in [FORTSCHRITT.md](FORTSCHRITT.md) abhaken.

> 🛑 **Die 3 Regeln des Programmier-Lernens:**
> 1. **KEIN Copy-Paste!** Dein Gehirn lernt durch das Tippen auf der Tastatur. Wer Beispiele oder Lösungen kopiert, verliert.
> 2. **Lass es crashen!** Fehler (Exceptions) sind gut. Provoziere sie bewusst, lese die rote Fehlermeldung und lerne, sie zu verstehen.
> 3. **Nicht gleich die Lösung anschauen.** Ein grosser Teil der Arbeit in der Informatik ist Frustrationstoleranz. Halte durch, bis es klappt!

---

## Der Sechs-Wochen-Plan

| Woche | Thema | Ordner | w3schools | ETH-Modul |
|------:|-------|--------|-----------|-----------|
| 1 | Introduction, Output | `woche1-introduction-output` | Java HOME … Java Output | Modul 0 |
| 2 | Variables, Data Types, Strings | `woche2-variablen-datentypen` | Java Variables … Java Strings | Modul 1 |
| 3 | Operators & Math, Conditionals | `woche3-operatoren-conditionals` | Java Operators … Java If...Else | Modul 2 (Kap. 1–3) |
| 4 | Loops, Arrays | `woche4-loops-arrays` | Java Loops, Java Arrays | Modul 2 (Kap. 4) + Modul 3 |
| 5 | Methods, Classes (OOP – Modifiers) | `woche5-methoden-klassen` | Java Methods … Java OOP | Modul 4 |
| 6 | Objects | `woche6-objekte` | Java Classes/Objects | Modul 5 |

Zusatzordner **`querschnitt-binaer-math`**: Binär/ASCII und `Math`-Methoden. Gehört
thematisch dazu, ist aber keiner einzelnen Woche fest zugeordnet.

---

## Schnellstart

JDK installieren (siehe `SETUP.md`), dann z. B.:

```bash
cd woche1-introduction-output/examples
javac HalloWelt.java   # kompiliert -> HalloWelt.class
java HalloWelt         # führt aus
```

---

## Quellen & Lizenz

- Aufgabenstruktur nach dem **FHNW**-Vorbereitungsplan (w3schools Java Tutorial).
- Theorie inhaltlich angelehnt an das **ETH-Tutorial** "Programmieren mit Java"
  (Module 0–5, L. Fässler, B. Scheuner, D. Sichau, et.ethz.ch), das unter
  **CC BY-NC-ND 4.0** steht. Die Texte und der Code hier sind eigenständig
  formuliert/geschrieben; die PDFs selbst werden nicht weitergegeben.
- Dein eigener Code in diesem Repo gehört dir.
