public class Atom {
    private int number;
    private String symbol;
    private String fullname;
    private Double weight;

    public Atom() {
    }

    public Atom(int number, String symbol, String fullname, Double weight) {
        this.number = number;
        this.symbol = symbol;
        this.fullname = fullname;
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
    public void display(){
        System.out.format("%10d| %20s| %20s| %20.2d|\n", this.number, this.symbol, this.fullname, this.weight);
    }
    public Boolean accept(){
        return true;
    }
}
