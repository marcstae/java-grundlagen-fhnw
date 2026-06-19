# Woche 4 – Loops & Arrays

## 🎯 Lernziele
- `for`-, `while`- und `do-while`-Schleifen verstehen und auswählen.
- Geschachtelte Schleifen einsetzen.
- Arrays deklarieren, erzeugen, füllen und durchlaufen.
- Zweidimensionale Arrays verwenden.

## 📝 Schritt-für-Schritt Anleitung (DAU-sicher)
Bitte HALTE DICH GENAU an diese Reihenfolge. Nichts überspringen!

**1. Theorie lesen (Grundlagen)**
* Lies auf **w3schools** folgende Kapitel: *Java While Loop, For Loop, Break/Continue, Arrays*
* Lies die Begleit-PDFs der ETH: 
  * [p_java2_TH.pdf](https://doc.et.ethz.ch/latest/p_java2_TH.pdf) (Nur Kapitel 4: Schleifen)
  * [p_java3_TH.pdf](https://doc.et.ethz.ch/latest/p_java3_TH.pdf) (Arrays)

**2. Abschreiben & Verstehen (Nicht kopieren!)**
* Öffne den Ordner `examples/`.
* Mache dich mit den Beispielen vertraut (`Schleifen.java`, `Arrays.java`, `Array2D.java`).
* Tippe den Code **selbst ab**! Experimentiere herum (z.B. provoziere mal bewusst eine `ArrayIndexOutOfBoundsException`!).
  ```bash
  cd examples
  javac Schleifen.java && java Schleifen
  javac Arrays.java && java Arrays
  javac Array2D.java && java Array2D
  ```

**3. Übungen lösen (Selber schwitzen)**
* Öffne `uebungen/Uebung04_Statistik.java` und fülle die `TODO`s aus.
* Lass dir Zeit, Schleifen und Arrays sind am Anfang echte Kopfarbeit!
  ```bash
  cd ../uebungen
  javac Uebung04_Statistik.java && java Uebung04_Statistik
  ```

**4. Lösung kontrollieren & Abhaken**
* Wenn dein Programm korrekte Statistiken zum Array ausspuckt, vergleiche mit `loesungen/`.
* Gehe zu `FORTSCHRITT.md` im Hauptverzeichnis und hake die Checkliste ab.

---

## 🧠 Kurztheorie

**for** – wenn die Anzahl der Durchläufe bekannt ist:
```java
for (int i = 0; i < 5; i++) { ... }   // init; test; update
```

**while** – Bedingung **vor** dem Körper, evtl. 0 Durchläufe:
```java
while (bedingung) { ... }
```

**do-while** – Bedingung **nach** dem Körper, mindestens 1 Durchlauf:
```java
do { ... } while (bedingung);
```
Achtung: Ohne Veränderung der Bedingung im Körper -> **Endlosschleife**.

**Geschachtelte Schleifen:** eine äussere steuert eine innere (z. B. Tabellen,
2D-Arrays).

**Arrays** speichern mehrere Werte **gleichen Typs** unter einem Namen, Zugriff
über einen Index. **Der erste Index ist 0**, der letzte `länge - 1`.
```java
int[] zahlen = new int[6];          // 6 Plätze, Default 0
int[] feste  = {12, 13, 15};        // direkt initialisiert
zahlen[0] = 42;                     // setzen
int x = zahlen[0];                  // lesen
for (int i = 0; i < zahlen.length; i++) { ... }   // durchlaufen
```

**2D-Array:** `int[][] m = new int[3][5];` – Zugriff `m[zeile][spalte]`,
Durchlauf mit zwei geschachtelten Schleifen.
