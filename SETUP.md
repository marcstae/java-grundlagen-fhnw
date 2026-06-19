# Setup – JDK und Editor

Damit du Java-Programme schreiben und ausführen kannst, brauchst du zwei Dinge:
ein **JDK** (Java Development Kit, enthält den Compiler `javac`) und einen **Editor**.

## 1. JDK installieren

Prüfe zuerst, ob schon eines da ist:

```bash
java -version
javac -version
```

Wenn `javac` "command not found" meldet, fehlt das JDK (eine reine JRE reicht nicht).

- **Windows / macOS / Linux:** Lade ein aktuelles LTS-JDK (z. B. Temurin 21) von
  https://adoptium.net herunter und installiere es.
- **macOS mit Homebrew:** `brew install temurin`
- **Ubuntu/Debian:** `sudo apt install default-jdk`

Nach der Installation beide Befehle oben erneut testen – beide sollten eine
Versionsnummer zeigen.

## 2. Editor / IDE

Für den Anfang reicht ein einfacher Editor (VS Code mit dem "Extension Pack for
Java"). An der FHNW wird in den ersten Wochen oft mit **IntelliJ IDEA** (Community
Edition, kostenlos) oder **Eclipse** gearbeitet – beide nehmen dir das Kompilieren
und Ausführen per Knopfdruck ab.

Tipp: Lerne am Anfang ruhig den **Weg über die Kommandozeile** (siehe unten). So
verstehst du, was eine IDE im Hintergrund macht – das hilft dir als Systemtechniker.

## 3. Kompilieren und Ausführen (Kommandozeile)

Eine Java-Datei besteht aus genau einer `public class`, deren Name **gleich dem
Dateinamen** ist (`HalloWelt` -> `HalloWelt.java`).

```bash
javac HalloWelt.java   # erzeugt HalloWelt.class (Bytecode)
java HalloWelt         # führt die Klasse aus (ohne .class-Endung!)
```

Bei mehreren Dateien in einem Ordner:

```bash
javac *.java           # alle kompilieren
java Personalverwaltung
```

## 4. Häufige Anfängerfehler

- `java HalloWelt.java` statt `java HalloWelt` – beim Ausführen **ohne** Endung
  (ab Java 11 geht auch direkt `java HalloWelt.java`, aber gewöhn dir den 2-Schritt an).
- Datei- und Klassenname stimmen nicht überein -> Compilerfehler.
- Semikolon `;` am Ende einer Anweisung vergessen.
- Umlaute im Code: speichere die Dateien als **UTF-8**.
