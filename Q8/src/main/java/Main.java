import java.io.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println("------------------- Q8_1 -----------------");
//        System.out.println(readFile(""));
//        writeFile(readFile(""));
        System.out.println("------------------- Q8_2 -----------------");
        StudentController studentController = new StudentController();
        while(true){
            int choice = StudentController.Menu();
            switch (choice){
                case 1:
                    studentController.writeFile();
                    break;
                case 2:
                    System.out.println(studentController.readFile());
                    break;
                case 0:
                    return;
            }
        }
    }
    private static void writeFile(String str){
        String file = "D:\\Java Core\\Q8\\src\\main\\java\\text.txt";
        FileWriter fw = null;
        BufferedWriter bw = null;
        String line = null;
        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            for (int i = 0; i < str.length(); i++){
                line+= str.charAt(i)+"";
                if(str.charAt(i) == '\n'){
                    bw.write(line +"");
                    line = "";
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist!");
        }catch (IOException ex) {
            System.out.println("Lỗi xảy ra " + ex.getMessage());
        }finally{
            try {
                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private static String readFile(String message){
        String str = "";
        String file = "D:\\Java Core\\Q8\\src\\main\\java\\text.txt";
        FileReader fr = null;
        BufferedReader br = null;
        try{
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line = br.readLine();
            while(line!=null){
                for(int i = 0; i<line.length(); i++){
                    int c = line.charAt(i)+3;
                    str+=((char)c )+"";
                }
                str+="\n";
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist!");
        }catch (IOException ex) {
            System.out.println("Lỗi xảy ra " + ex.getMessage());
        }finally{
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return str;
    }
}