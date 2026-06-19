# Querschnitt – Binär/ASCII & Math

Themen aus den ETH-Modulen 1 und 4, die nicht fest zu einer Woche gehören, aber
zum Grundverständnis dazugehören. Schau hier rein, wenn du in Woche 2 (Binär) bzw.
Woche 3 (Math) bist.

## Binär & ASCII (Modul 1)
- Computer speichern alles **binär**: nur `0` und `1`. Eine Stelle = **Bit**.
- 8 Bit = 1 **Byte** -> 2^8 = 256 mögliche Werte (0–255).
- Eine Binärzahl wird in Dezimal umgerechnet, indem man die Wertigkeiten
  (1, 2, 4, 8, 16, …) der gesetzten Bits aufsummiert. Beispiel: `01011011` = 91.
- **ASCII** ordnet Zeichen Zahlen zu (z. B. `'A'` = 65, `'a'` = 97). 7-Bit-ASCII
  kann 128 Zeichen darstellen.

## Math-Methoden & Zufall (Modul 4)
Die Klasse `Math` bietet fertige Funktionen, z. B.:
- `Math.max(a, b)`, `Math.min(a, b)`
- `Math.round(x)`, `Math.ceil(x)`, `Math.floor(x)`
- `Math.sqrt(x)`, `Math.pow(basis, exponent)`
- `Math.random()` -> Zufallszahl `x` mit `0 <= x < 1`.

Ganze Zufallszahl von 0 bis 99:
```java
int z = (int)(Math.random() * 100);
```

## Beispiele ausführen
```bash
cd examples
javac BinaerUndAscii.java && java BinaerUndAscii
javac MathDemo.java && java MathDemo
```
