import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void createDictionary(Set<DictionaryWord> dictionary) {
        DictionaryWord w1=new DictionaryWord("bank robber","Steals money from a bank");
        DictionaryWord w2=new DictionaryWord("burglar","Breaks into a home to steal things");
        DictionaryWord w3=new DictionaryWord("forger","Makes an illegal copy of something");
        DictionaryWord w4=new DictionaryWord("hacker","Breaks into a computer system");
        DictionaryWord w5=new DictionaryWord("hijacker","Takes control of an airplane");
        DictionaryWord w6=new DictionaryWord("kidnapper","Holds someone for ransom money");
        DictionaryWord w7=new DictionaryWord("mugger","Attacks and steals money from someone");
        DictionaryWord w8=new DictionaryWord("murderer","Kills another person");
        dictionary.add(w1);
        dictionary.add(w2);
        dictionary.add(w3);
        dictionary.add(w4);
        dictionary.add(w5);
        dictionary.add(w6);
        dictionary.add(w7);
        dictionary.add(w8);

    }

    public static void main(String[] args) {
        Set<DictionaryWord> dictionary = new HashSet<>();
        createDictionary(dictionary);

        Object[] arr=dictionary.toArray();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print((i+1)+". ");
            System.out.println(((DictionaryWord) arr[i]).getWord());
            System.out.println(((DictionaryWord) arr[i]).getMeanings());
        }
    }
}
