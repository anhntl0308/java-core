import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner nhap = new Scanner(System.in);
        while (true) {
            //enter integer a here with input validation
            while (true){
                try{
                    System.out.print("Enter side a: ");
                    a = Integer.parseInt(nhap.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Wrong input! Try again!");
                }
            }

            //enter integer b here with input validation
            while (true){
                try{
                    System.out.print("Enter side b:");
                    b = Integer.parseInt(nhap.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Wrong input! Try again!");
                }
            }

            while (true){
                try{
                    System.out.print("Enter side c: ");
                    c = Integer.parseInt(nhap.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Wrong input! Try again!");
                }
            }
            //enter integer c here with input validation

            try {
                //call constructor of RightTriangle class
                RightTriangle rt = new RightTriangle(a, b, c);
                System.out.println("This is a right triangle!");
            } catch (IllegalTriangleException e1) {
                System.out.println("This is not a triangle!");
            } catch (IllegalRightTriangleException e2) {
                System.out.println("This is not a right triangle");
            }
            //continue?
            System.out.print("Continue?(Y/N):");
            //Enter a character
            char chon = nhap.nextLine().toLowerCase().charAt(0);
            if(chon != 'y')
                break;
        }
    }

}
