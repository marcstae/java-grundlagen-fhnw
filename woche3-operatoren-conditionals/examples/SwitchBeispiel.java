/*
 * switch mit break und default. Wandelt eine Zahl 1-7 in den Wochentag um.
 */
public class SwitchBeispiel {
    public static void main(String[] args) {
        int tag = 3;
        String name;

        switch (tag) {
            case 1: name = "Montag";     break;
            case 2: name = "Dienstag";   break;
            case 3: name = "Mittwoch";   break;
            case 4: name = "Donnerstag"; break;
            case 5: name = "Freitag";    break;
            case 6: name = "Samstag";    break;
            case 7: name = "Sonntag";    break;
            default: name = "ungültig";
        }

        System.out.println("Tag " + tag + " = " + name);
    }
}
