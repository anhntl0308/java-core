public class PhoneNumber {
    private int are;
    private String number;

    public PhoneNumber() {
    }

    public PhoneNumber(int are, String number) {
        this.are = are;
        this.number = number;
    }

    public int getAre() {
        return are;
    }

    public void setAre(int are) {
        this.are = are;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void display(){
        System.out.println(are + " - " + number);
    }
}
