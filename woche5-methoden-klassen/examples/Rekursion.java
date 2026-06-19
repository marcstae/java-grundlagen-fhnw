/*
 * Lineare Rekursion (Fakultät) und kaskadenförmige Rekursion (Fibonacci).
 */
public class Rekursion {

    // Fakultät: x! = x * (x-1)!  ; Basisfall 0! = 1! = 1
    public static int fakultaet(int x) {
        if (x == 0 || x == 1) {
            return 1;                       // Basisfall
        } else {
            return x * fakultaet(x - 1);    // rekursiver Aufruf
        }
    }

    // Fibonacci: f(n) = f(n-1) + f(n-2) ; f(0)=0, f(1)=1
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("5! = " + fakultaet(5));

        System.out.print("Fibonacci 0..9: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }
}
