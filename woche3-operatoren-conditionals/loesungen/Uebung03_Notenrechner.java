/*
 * LÖSUNG zu Übung 3 – Notenrechner
 */
import java.util.Scanner;

public class Uebung03_Notenrechner {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Punkte (0-100): ");
        int punkte = eingabe.nextInt();

        int note;
        if (punkte >= 90) {
            note = 6;
        } else if (punkte >= 75) {
            note = 5;
        } else if (punkte >= 60) {
            note = 4;
        } else if (punkte >= 40) {
            note = 3;
        } else {
            note = 2;
        }
        System.out.println("Note: " + note);

        if (punkte >= 60) {
            System.out.println("bestanden");
        } else {
            System.out.println("nicht bestanden");
        }

        eingabe.close();
    }
}
