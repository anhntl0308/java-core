import java.io.*;
import java.util.*;

public class StudentController {

    public static int Menu(){
        System.out.println("Menu");
        System.out.println("---------------------");
        System.out.println("1. Add a list of Students and save to File");
        System.out.println("2. Loading list of Students from a File");
        System.out.println("3. Exit");
        System.out.println("4. Your choice: ");
        return InputValid.inputInt("", Integer.MAX_VALUE, Integer.MIN_VALUE, "");
    }


    private static Student inputStudent(){
        String name = InputValid.inputString("Enter name: ", "[a-zA-Z ]+");
        int age = InputValid.inputInt("Enter age: ", Integer.MAX_VALUE, 0, "[0-9]+");
        double mark = InputValid.inputDouble("Enter mark: ", Double.MAX_VALUE, 0, "");
        return new Student(name, age, mark);
    }

    private static List<Student> students(){
        List<Student> students = new ArrayList<>();
        while(true){
            students.add(inputStudent());
            boolean check = InputValid.inputYesNo("Continue create student (Y or N):");
            if(!check) return students;
        }
    }

    public void writeFile(){
        String file = "D:\\Java Core\\Q8\\src\\main\\java\\text.txt";
        FileWriter fw = null;
        BufferedWriter bw = null;
        String line = null;
        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            for(Student student : students()){
                bw.write(student.toString());
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


    public String readFile() {
        String str = "";
        String file = "D:\\Java Core\\Q8\\src\\main\\java\\text.txt";
        FileReader fr = null;
        BufferedReader br = null;
        try{
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line = br.readLine();
            while(line!=null){
                line = br.readLine();
                str+= line+"\n";
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
