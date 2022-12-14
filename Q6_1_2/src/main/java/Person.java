public abstract class Person {
    String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println(name + " ");
    }

    abstract double getSalary();
}
