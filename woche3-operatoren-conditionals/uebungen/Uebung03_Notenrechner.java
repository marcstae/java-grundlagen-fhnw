/*
 * ÜBUNG 3 – Notenrechner
 * Ziel: Verzweigungen und relationale Operatoren.
 *
 * Aufgabe: Lies eine erreichte Punktzahl (0-100) ein und gib eine Note aus:
 *   >= 90 -> Note 6
 *   >= 75 -> Note 5
 *   >= 60 -> Note 4  (bestanden)
 *   >= 40 -> Note 3
 *   sonst -> Note 2
 * Gib zusätzlich "bestanden" aus, wenn die Punktzahl >= 60 ist, sonst
 * "nicht bestanden".
 */
import java.util.Scanner;

public class Uebung03_Notenrechner {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Punkte (0-100): ");
        int punkte = eingabe.nextInt();

        // TODO: Bestimme die Note mit if / else if / else
        //       und gib sie aus, z. B. "Note: 4"

        // TODO: Gib "bestanden" oder "nicht bestanden" aus
        //       (Tipp: punkte >= 60)

        eingabe.close();
    }
}
