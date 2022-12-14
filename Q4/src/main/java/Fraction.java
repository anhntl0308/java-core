public class Fraction {
    private double tu;
    private double mau;

    public Fraction() {
    }

    public Fraction(double tu, double mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public double getTu() {
        return tu;
    }

    public void setTu(double tu) {
        this.tu = tu;
    }

    public double getMau() {
        return mau;
    }

    public void setMau(double mau) {
        this.mau = mau;
    }

    @Override
    public String toString() {
        return  tu + "/"+ mau ;
    }
}
