# Woche 4 – Loops & Arrays

**w3schools:** Java While Loop, For Loop, Break/Continue, Arrays
**ETH-Modul:** 2 Kapitel 4 (Schleifen) + Modul 3 (Arrays)

## Lernziele
- `for`-, `while`- und `do-while`-Schleifen verstehen und auswählen.
- Geschachtelte Schleifen einsetzen.
- Arrays deklarieren, erzeugen, füllen und durchlaufen.
- Zweidimensionale Arrays verwenden.

## Kurztheorie

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

## Beispiele ausführen
```bash
cd examples
javac Schleifen.java && java Schleifen
javac Arrays.java && java Arrays
javac Array2D.java && java Array2D
```

## Übung
`uebungen/Uebung04_Statistik.java`: Summe, Durchschnitt und Maximum eines Arrays
berechnen.
