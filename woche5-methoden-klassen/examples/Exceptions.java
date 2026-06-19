/*
 * Fehlerbehandlung mit try/catch.
 */
public class Exceptions {
    public static void main(String[] args) {
        String[] eingaben = {"42", "hallo", "7"};

        for (String wert : eingaben) {
            try {
                int zahl = Integer.parseInt(wert);
                System.out.println("'" + wert + "' -> Zahl " + zahl);
            } catch (Exception e) {
                System.out.println("'" + wert + "' ist keine ganze Zahl.");
            }
        }
    }
}
