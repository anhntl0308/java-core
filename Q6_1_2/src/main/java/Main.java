import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person [] e = new Person[10];
        int n = 0, c = 0;
        do{
            System.out.println("Worker (1); Officer(2); display(0): ");
            Scanner in = new Scanner(System.in);
            c = in.nextInt();
            if(c == 1){
                System.out.print("Enter worker name: ");
                String name = in.next();
                System.out.print("Enter worker working hours: ");
                int hrs = in.nextInt();
                e[n] = new Worker(name, hrs);
                n++;
            }else if(c == 2) {
                System.out.print("Enter Officer name: ");
                String name = in.next();
                System.out.print("Enter officer salary: ");
                double salary = in.nextDouble();
                e[n] = new Officer(name, salary);
                n++;
            }
        }while(c != 0);

        for(int i = 0; i < n; i++) {
            if (e[i] instanceof Worker) e[i].display();
        }
    }

}
