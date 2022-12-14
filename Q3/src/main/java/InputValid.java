import java.io.IOException;
import java.util.Scanner;

public class InputValid {
    private static Scanner scanner = new Scanner(System.in);
    public static double inputDouble(String message, double min, double max) {
        if (min > max) {
            double z = min;
            min = max;
            max = min;
        }
        double number = 0;
        do {
            try {
                System.out.print(message);
                number = Double.parseDouble(scanner.nextLine().trim());
                if (number < min || number > max) {
                    System.out.println("Please input number (" + min + "->" + max + ")");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please input number!");
            }
        } while (true);
        return number;
    }

    public static int inputInt(String message, int min) {
        int number = 0;
        do {
            try {
                System.out.print(message);
                number = Integer.parseInt(scanner.nextLine().trim());
                if (number < min) {
                    System.out.println("Please input number => " + min);
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please input number!");
            }
        } while (true);
        return number;
    }


    public static String inputString(String message, String regex, String note) {
        String str = null;
        do {
            System.out.print(message);
            try {
                str = scanner.nextLine().trim();
                if (!str.matches(regex)) {
                    throw new IOException(note);
                }
                if (str.isEmpty() || str == null) {
                    throw new IOException("Please input not empty!");
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        } while (str.isEmpty() || str == null || !str.matches(regex));

        return str;
    }
}
