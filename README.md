# Java-Grundlagen – Vorbereitung BSc Informatik (FHNW Windisch)

Ein Lern-Repository, das dich in **sechs Wochen** durch die Java-Grundlagen führt –
genau nach dem Vorbereitungsplan der FHNW (w3schools "Java Tutorial" + ETH-Tutorial).

Es ist für den Einstieg gedacht, wenn du eher aus der **Systemtechnik** kommst und
die Applikationsentwicklung neu für dich ist. Jede Woche hat: kurze Theorie in eigenen
Worten, **lauffähige Beispiele** und **Übungen mit Lösungen**.

---

## So lernst du mit diesem Repo

Pro Woche immer in dieser Reihenfolge:

1. **Lesen:** das `README.md` der Woche (Lernziele + Kurztheorie).
2. **w3schools:** die dort verlinkten Kapitel des Java-Tutorials durcharbeiten.
3. **Beispiele ausführen:** die Dateien in `examples/` kompilieren, laufen lassen, **verändern**.
4. **Selbst programmieren:** die `uebungen/` lösen (es sind Lücken mit `TODO` drin).
5. **Vergleichen:** erst danach in `loesungen/` schauen.
6. **Abhaken:** in `FORTSCHRITT.md`.

> Wichtig: Tipp den Code wirklich selbst ab und lass ihn laufen. Lesen allein
> reicht beim Programmieren nicht – das Verständnis kommt über die Finger.

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
