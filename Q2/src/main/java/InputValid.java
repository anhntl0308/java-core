import java.io.IOException;
import java.util.Scanner;

public class InputValid {
    private static Scanner scanner = new Scanner(System.in);
    public static int getInputNumber(String message){
        int number = 0;
        do {
            try {
                System.out.print(message);
                number = Integer.parseInt(scanner.next().trim());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please input number!");
            }
        } while (true);
        return number;
    }


}
