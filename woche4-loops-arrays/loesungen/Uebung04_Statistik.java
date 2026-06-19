/*
 * LÖSUNG zu Übung 4 – Array-Statistik
 */
public class Uebung04_Statistik {
    public static void main(String[] args) {
        int[] messwerte = {23, 42, 8, 15, 16, 4, 50, 19};

        int summe = 0;
        int max = messwerte[0];

        for (int i = 0; i < messwerte.length; i++) {
            summe += messwerte[i];
            if (messwerte[i] > max) {
                max = messwerte[i];
            }
        }

        double durchschnitt = (double) summe / messwerte.length;

        System.out.println("Summe:       " + summe);
        System.out.println("Durchschnitt: " + durchschnitt);
        System.out.println("Maximum:     " + max);
    }
}
