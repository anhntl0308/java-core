import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneNumber phonelist[] = new PhoneNumber[1000];
        Scanner scanner = new Scanner(System.in);
        int choice;
        int area;
        String number;
        String countryCode;
    int i = 0;
        while (true){
            System.out.println("Type of PhoneNumber ? (1 - local phone, 2 - Inter Phone number, 0 - Exit) :");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter area code: ");
                    area = scanner.nextInt();
                    System.out.println("Enter number: ");
                    number = scanner.next();

                    phonelist[i] = new PhoneNumber(area, number);
                    i++;
                    break;
                case 2:
                    System.out.println("Enter the country code: ");
                    countryCode = scanner.next();
                    System.out.println("Enter area code: ");
                    area = scanner.nextInt();
                    System.out.println("Enter number: ");
                    number = scanner.next();
                    phonelist[i] = new IntPhoneNumber(area, number, countryCode);
                    i++;
                    break;
                case 0:
                    System.out.println("List of PhoneNumbers: - ");
                    System.out.println("----------------------------");
                    try {
                        for(int j=0;j<phonelist.length;j++)
                        {
                            phonelist[j].display();
                        }
                    } catch (Exception e){
                        System.out.println();
                    } finally {
                                    break;
                    }

            }
        }
    }
}
