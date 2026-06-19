/*
 * LÖSUNG zu Übung 5 – Methoden-Toolbox
 */
public class Uebung05_Mathe {

    public static int quadrat(int n) {
        return n * n;
    }

    public static int max(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    public static int fakultaet(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fakultaet(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("quadrat(6)   = " + quadrat(6));
        System.out.println("max(7, 12)   = " + max(7, 12));
        System.out.println("fakultaet(5) = " + fakultaet(5));
    }
}
