import java.io.IOException;
import java.util.Scanner;

public class InputValid {
    private static Scanner scanner = new Scanner(System.in);
    public static int inputInt(String message, int max, int min, String regex){
        int number;
       do{
            try{
                System.out.print(message);
                number = Integer.parseInt(scanner.nextLine());
                if(number < min || number > max){
                    System.out.println("number out of range " + min + "-" + max);
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please, Input integer number!");
            }
        } while (true);
        return number;
    }

    public static String inputString(String message, String regex) {
        String str = null;
        do {
            System.out.print(message);
            try {
                str = scanner.nextLine();
                if (!str.matches(regex)) {
                    System.out.println("Please follow " + regex);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            if (str.isEmpty() || str == null) {
                System.out.println("Please input not empty!");
            }
        } while (str.isEmpty() || str == null || !str.matches(regex));

        return str;
    }

    public static double inputDouble(String message, double max, double min, String regex){
        double number;
        do{
            try{
                System.out.print(message);
                number = Double.parseDouble(scanner.nextLine());
                if(number < min || number > max){
                    System.out.println("number out of range " + min + "-" + max);
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please, Input double number!");
            }
        } while (true);
        return number;
    }


    public static boolean inputYesNo(String message) {
        String str = null;
        do {
            try {
                System.out.print(message);
                str = scanner.nextLine().trim();
                if (!str.toLowerCase().equals("y") && !str.toLowerCase().equals("n")) {
                    System.out.println("Please enter y or n!");
                }
            } finally {

            }
        } while (!str.toLowerCase().equals("y") && !str.toLowerCase().equals("n"));
        return str.toLowerCase().equals("y") ? true : false;
    }


}
