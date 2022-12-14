public class Officer extends Person{
    double bSalary;

    public Officer() {
    }

    public Officer(String name, double bSalary) {
        super(name);
        this.bSalary = bSalary;
    }

    @Override
    double getSalary() {
    return bSalary;
    }

    public void display(){
        System.out.println(name + " - " + bSalary + " - " + getSalary());
    }
}
