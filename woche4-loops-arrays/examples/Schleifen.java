/*
 * for, while und do-while – alle geben 0..4 aus.
 */
public class Schleifen {
    public static void main(String[] args) {
        System.out.println("for:");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("while:");
        int j = 0;
        while (j < 5) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println();

        System.out.println("do-while (läuft mind. 1x):");
        int k = 0;
        do {
            System.out.print(k + " ");
            k++;
        } while (k < 5);
        System.out.println();
    }
}
