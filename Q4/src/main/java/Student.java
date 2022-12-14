import java.util.Date;

public class Student {
    private String name;
    private String student_Id;
    private Date birthDate;
    private String address;
    private String major;
    private double gpa;

    public Student() {
    }

    public Student(String name, Date birthDate, String address, String major, double gpa) {
        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
        this.major = major;
        this.gpa = gpa;
    }

    public Student(String name, String student_Id, Date birthDate, String address, String major, double gpa) {
        this.name = name;
        this.student_Id = student_Id;
        this.birthDate = birthDate;
        this.address = address;
        this.major = major;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudent_Id() {
        return student_Id;
    }

    public void setStudent_Id(String student_Id) {
        this.student_Id = student_Id;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void printAllAttributes(){
        System.out.println("Student Name: "+name);
        System.out.println("Student ID:" + student_Id);
        System.out.println("DOB: " + birthDate);
        System.out.println("Address: "+ address);
        System.out.println("Major: "+ major);
        System.out.println("GPA" + gpa);
    }
}
