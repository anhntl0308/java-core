import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        searchString(str);
        countSubString(str);
        upperCaseFirst(str);
        lowFirstupperLast(str);
        sortWords(str);
        removeWord(str);
        printAllLetters(str);
        reverseString(str);
        countWordsUpper(str);
    }

    public static void searchString(String str){
        System.out.println("contain 'me' " + str.contains("me"));
        System.out.println("contain 'why' " + str.contains("why"));
        System.out.println("contain 'well' " + str.contains("well"));


    }

    public static void countSubString(String str){
        Matcher m = Pattern.compile("\\byou\\b").matcher(str);
        int count = 0;
        while ((m.find())){
            count++;
        }
        System.out.println("'you' word appear in @tr " + count+ " times");
    }

    public static void upperCaseFirst(String str){
        System.out.println(Stream.of(str.trim().split("\\s"))
                .filter(w -> w.length() > 0)
                .map(w -> w.substring(0,1).toUpperCase()+w.substring(1))
                .collect(Collectors.joining(" ")));
    }
    public static void lowFirstupperLast(String str){
        System.out.println(Stream.of(str.trim().split("\\s+"))
                .filter(w -> w.length() > 0)
                .map(w -> {
                    if(w.length()> 1){
                        return  w.substring(0,1).toLowerCase()+w.substring(1, w.length()-1)+w.substring(w.length()-1).toUpperCase();
                    }else{
                        return w.toLowerCase();
                    }
                })
                .collect(Collectors.joining(" ")));
    }

    public static void sortWords(String str){
        System.out.println(Stream.of(str.trim().split("\\s"))
                .filter(w -> w.length() > 0)
                .sorted()
                .collect(Collectors.joining(" ")));
    }

    public static void removeWord(String str){
        Arrays.stream(str.trim().split("\\s")).filter(item -> item.toLowerCase().charAt(0)!='c').forEach(item -> {
            System.out.print(item+" ");
        });
    }

    public static void printAllLetters(String str){
        System.out.println();
        Arrays.stream(str.trim().split("")).filter(item -> item.matches("[a-zA-z]+")).distinct().forEach(System.out::print);
    }

    public static void reverseString(String str){
        System.out.println();
        Arrays.stream(str.trim().split("\\s")).map(s -> new StringBuilder(s).reverse().toString()).forEach(item -> System.out.print(item+" "));
    }

    public static void replaceAll(String str){
                str = str.replace('a','A');
                str = str.replace('b', 'B');
        System.out.println(str);

    }

    public static void countWordsUpper(String str){
        System.out.println();
        System.out.println(Stream.of(str.trim().split(""))
                .filter(item -> Character.isUpperCase(item.charAt(0)) == true)
                .count());
    }
}
