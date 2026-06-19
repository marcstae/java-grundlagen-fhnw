/*
 * Tastatureingabe mit Scanner.
 * Hinweis: Beim Ausführen wartet das Programm auf deine Eingabe.
 */
import java.util.Scanner;

public class Eingabe {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);

        System.out.print("Wie heisst du? ");
        String name = eingabe.nextLine();

        System.out.print("Wie alt bist du? ");
        int alter = eingabe.nextInt();

        System.out.println("Hallo " + name + ", in 10 Jahren bist du "
                           + (alter + 10) + ".");

        eingabe.close();
    }
}
