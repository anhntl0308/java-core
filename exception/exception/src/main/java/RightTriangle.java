public class RightTriangle {
    private int a;
    private int b;
    private int c;

    public RightTriangle(int a, int b, int c) throws IllegalTriangleException, IllegalRightTriangleException {
        if(a <= 0 || b <= 0 || c <= 0){
            throw new IllegalRightTriangleException("This is not a right triangle!");
        }
        if(a + b <= c || a + c <= b || b + c <=a){
            throw new IllegalTriangleException("This is not a triangle!");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
