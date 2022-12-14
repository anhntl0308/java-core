import java.util.Scanner;

public class Rectangle {
    private Double width;
    private Double height;

    public Rectangle() {
    }

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }


    public void input_data(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Height: ");
        this.height = scanner.nextDouble();
        System.out.println("Input Width: ");
        this.width = scanner.nextDouble();
    }

    public void display_data(){
        System.out.println("The Rectangle: (height: " + height +", width: "+width +")"  );
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }

    public double area(){
        return height*width;
    }

    public double perimeter(){
        return (height + width )*2;
    }
}
