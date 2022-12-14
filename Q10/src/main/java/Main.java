public class Main {
    public static void main(String[] args) {
        Generic<Car> generic = new Generic<>();
        generic.add(new Car("BMW", 23.0, "USA"));
        generic.add(new Car("CMD", 40.0, "VN"));
        generic.add(new Car("VIN", 60.0, "SIG"));
        generic.add(new Car("URD", 70.0, "JA"));

        generic.display();
        generic.delete(2);
        generic.display();
        System.out.println(generic.getSize());
        System.out.println(generic.checkEmpty());

        Generic<Flower> flowerGeneric = new Generic<>();
        flowerGeneric.add(new Flower("Hoa A", 5, "red"));
        flowerGeneric.add(new Flower("Hoa B", 9, "green"));
        flowerGeneric.add(new Flower("Hoa C", 2, "blue"));
        flowerGeneric.sort();
        System.out.println(flowerGeneric.search(flowerGeneric.getList().get(2)));
    }
}
