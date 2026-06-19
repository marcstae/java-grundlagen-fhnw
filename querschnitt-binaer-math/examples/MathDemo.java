/*
 * Nützliche Math-Methoden und Zufallszahlen.
 */
public class MathDemo {
    public static void main(String[] args) {
        System.out.println("max(19, 23)   = " + Math.max(19, 23));
        System.out.println("min(19, 23)   = " + Math.min(19, 23));
        System.out.println("sqrt(144)     = " + Math.sqrt(144));
        System.out.println("pow(2, 10)    = " + Math.pow(2, 10));
        System.out.println("round(3.6)    = " + Math.round(3.6));
        System.out.println("ceil(3.1)     = " + Math.ceil(3.1));
        System.out.println("floor(3.9)    = " + Math.floor(3.9));

        // drei Würfelwürfe (1..6)
        System.out.print("Würfel: ");
        for (int i = 0; i < 3; i++) {
            int wurf = (int)(Math.random() * 6) + 1;
            System.out.print(wurf + " ");
        }
        System.out.println();
    }
}
