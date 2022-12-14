import java.util.Arrays;
import java.util.List;

public class Main {
    public static void displayEvenNumbers(boolean usingFor){
        if (usingFor){
            for (int i = 0; i <= 10; i++){
                if(i == 0 || i % 2 != 0){
                    continue;
                } else System.out.print(" " + i);
            }
        } else {
            int i = 0;
            while (i <= 10 ){
                if( i != 0 && i % 2 == 0){
                    System.out.print(" "+i);
                }
                i++;
            }
        }
    }
    public static int[] inputElements(int number_of_elements, String mess){
        System.out.println(mess);
        int arr[]=new int[number_of_elements];
        for (int i = 0; i < number_of_elements; i++) {
            arr[i] = InputValid.getInputNumber("a[" + i + "] = ");
        }

        return arr;
    }

    public static void displayElements(int [] arr, String mess){
        System.out.print(mess);
        for(int i: arr){
            System.out.print(" " +i);

        }
        System.out.println();
    }

    public static void sortElements(int [] arr, String mess){
        System.out.println(mess);
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void getMax(int [] arr, String mess){
        System.out.print(mess);
//        int max = arr[0];
//        for(int i = 0; i < arr.length; i++){
//            if (arr[i] > max) max = arr[i];
//        }
//        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(arr[arr.length-1]);
    }
    public static void main(String[] args) {
        // input data
        System.out.println("-----       Q2_1        -----");
        System.out.println("\n -> Q2_1_a");
        displayEvenNumbers(true);
        System.out.println("\n\n -> Q2_1_b");
        displayEvenNumbers(false);
        System.out.println("\n\n-----       Q2_2        -----");
        int number_of_elements = InputValid.getInputNumber("Input number of elements: ");
        if(number_of_elements >= 1){
            int arr[] = inputElements(number_of_elements, "Input elements: ");
            displayElements(arr, "Array: ");
            sortElements(arr, "After sort ascending: ");
            displayElements(arr, "Array: ");
            getMax(arr, "The maximum value: ");
        } else System.out.println("Elements are empty!");
    }
}
