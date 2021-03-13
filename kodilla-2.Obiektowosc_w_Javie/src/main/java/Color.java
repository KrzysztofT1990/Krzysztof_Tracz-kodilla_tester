import java.util.Scanner;

public class Color {
    public static String getColor() {
        Scanner getUserColor = new Scanner(System.in);
        while (true) {
            System.out.println("Wybierz kolor, podaj pierwszą literę : C - Czerwony , N - Niebieski , F - Fioletowy , Z - Zielony ");
            String col = getUserColor.next().trim().toUpperCase();
            if (col.length() == 1) {
                switch (col) {
                    case "C":
                    case "N":
                    case "F":
                    case "Z":
                        return col;
                }
            }
            System.out.println("Wpisz tylko pojedyńczy znak. Wybierz C - N  - F - Z");
            System.out.println("===================================================");
        }

    }

    public static String showColor(String reply) {
        String result = "";
        while (true) {
            switch (reply) {
                case "C":
                    result = "Czerwony";
                    break;
                case "N":
                    result = "Niebieski";
                    break;
                case "F":
                    result = "Fioletowy";
                    break;
                case "Z":
                    result = "Zielony";
                    break;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        String choose = Color.getColor();
        String userColor = Color.showColor(choose);
        System.out.println("Twój kolor to: " + userColor);
    }
}

