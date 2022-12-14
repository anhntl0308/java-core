public class Worker extends Person{
    double hrs;
    final double RATE = 5.5;

    public Worker() {
    }

    public Worker(String n, double hrs) {
        super(n);
        this.hrs = hrs;
    }
    @Override
    double getSalary() {
        return hrs*RATE;
    }

    public void display(){
        System.out.println(super.name + " - " + hrs + " - " + getSalary());
    }



}
