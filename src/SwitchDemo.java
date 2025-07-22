
// Find an adjective based on the letter given

public class SwitchDemo {

    // A - Attractive , B - Beautiful, C - Cute

    public static void main(String[] args) {

        String letter = "V";

        switch (letter) {
            case "A":
                System.out.println("Attractive");
                break;
            case "B":
                System.out.println("beautiful");
                break;
            case "C":
                System.out.println("Cute");
                break;
            default:
                System.out.println("Other");
        }



    }
}
