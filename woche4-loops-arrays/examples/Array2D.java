/*
 * Zweidimensionales Array mit geschachtelten Schleifen.
 */
public class Array2D {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        for (int zeile = 0; zeile < matrix.length; zeile++) {
            for (int spalte = 0; spalte < matrix[zeile].length; spalte++) {
                System.out.print(matrix[zeile][spalte] + " ");
            }
            System.out.println();  // Zeilenumbruch nach jeder Zeile
        }
    }
}
