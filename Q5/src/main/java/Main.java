public class Main {
    public static void main(String[] args) {
//        System.out.println("--------- Q4.1 ----------------");
//        StringBuilder sb = new StringBuilder("Able was I ere I saw Elba.");
//        System.out.println("Initial Capacity: " + sb.length());
//        System.out.println("--------- Q4.2 ----------------");
//        String hannah = "Did Hannah see bees? Hannah did.";
//        System.out.println("The expression hannah.length(): "+hannah.length());
//        System.out.println("returned by the method call hannah.charAt(12): "+(int)hannah.charAt(12) +"---" + hannah.charAt(12));
//        System.out.println("refers to the letter b in the string referred to by hannah: ");
//        for (int i=0; i <hannah.length(); i++) {
//            if(hannah.charAt(i) == 'b') System.out.println("hannah.charAt("+i+")");
//        }
//
//        System.out.println("--------- Q4.3 ----------------");
//        System.out.println("Long the string returned by the following expression: " + "Was it a car or a cat I saw?".substring(9, 12).length());
//        System.out.println("The string is: "+ "Was it a car or a cat I saw?".substring(9, 12));
//
//        System.out.println("--------- Q4.3 ----------------");

        System.out.println("--------- Q4.1 ----------------");
        String hi = "Hi, ";
        String mom = "mom.";
        System.out.println("hi+mom");
        System.out.println(hi+mom);
        System.out.println("(new StringBuilder()).append(hi).append(mom).toString()");
        System.out.println((new StringBuilder()).append(hi).append(mom).toString());
        System.out.println("hi.concat(mom)");
        System.out.println(hi.concat(mom));


        System.out.println("----------- Q5.2 ---------------");
        String myName = "    Nguyen Thi     Lan        Anh  ";
        myName = myName.trim();
        int j = 0, i = 0;
        String shortName = myName.charAt(0)+"";
        while(i<myName.length()){
            if(myName.charAt(i) == ' '){
                j=i+1;
                if(myName.charAt(j) != ' '){
                    shortName += myName.charAt(j)+"";
                }
            }
            i++;
        }
        System.out.println(shortName.toUpperCase());

        System.out.println("----------- Q5.3 ---------------");
        String str1 = "Parliament";
        String str2 = "Partial &&&& men";

        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        str1 = removeJunk(str1);
        str2 = removeJunk(str2);
        str1 = sortString(str1);
        str2 = sortString(str2);
        if(str1.equals(str2)){
            System.out.println(true);
        } else System.out.println(false);

    }

    private static String sortString(String string){
        char[] charArray = string.toCharArray();
        java.util.Arrays.sort(charArray);
        return new String(charArray);
    }
    private static String removeJunk(String str){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(Character.isLetter(str.charAt(i))){
                stringBuilder.append(str.charAt(i)+"");
            }
        }
        return stringBuilder.toString();
    }

}
