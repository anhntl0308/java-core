public class Car {
    private String name;
    private Double price;
    private String Production;

    public Car() {
    }

    public Car(String name, Double price, String production) {
        this.name = name;
        this.price = price;
        Production = production;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getProduction() {
        return Production;
    }

    public void setProduction(String production) {
        Production = production;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", Production='" + Production + '\'' +
                '}';
    }
}
