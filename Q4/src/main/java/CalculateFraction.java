public class CalculateFraction {
    private Fraction fraction1;
    private Fraction fraction2;

    public CalculateFraction() {
    }

    public CalculateFraction(Fraction fraction1, Fraction fraction2) {
        this.fraction1 = fraction1;
        this.fraction2 = fraction2;
    }

    public Fraction getFraction1() {
        return fraction1;
    }

    public void setFraction1(Fraction fraction1) {
        this.fraction1 = fraction1;
    }

    public Fraction getFraction2() {
        return fraction2;
    }

    public void setFraction2(Fraction fraction2) {
        this.fraction2 = fraction2;
    }

    public int getDecimalPoint(double number){
        String number_x = number+"";
        int count = 0;
        if(number == (int) number) return count = 0;
        for(int i = 0; i < number_x.length(); i++){
            if(number_x.charAt(i) == 46 ){
                count = number_x.length()-1 - i;
                break;
            }
        }
        return count;
    }

    public int getDecimal(double number1, double number2){
        int decimalNumber1 = getDecimalPoint(number1);
        int decimalNumber2 = getDecimalPoint(number2);
        if(decimalNumber1 >= decimalNumber2){
            return decimalNumber1;
        } else return decimalNumber2;
    }

    public int GCD(double number1, double number2){
        int y = getDecimal(number1, number2);
        if(y >= 1){
            number1 = number1*Math.pow(10, y);
            number2 = number2*Math.pow(10, y);
        }
        int number1_int = (int) number1;
        int number2_int = (int) number2;

        int gcd = 1;
        for(int i = 1; i <= number1 && i<= number2; i++){
            if(number1%i == 0 && number2%i==0){
                gcd=i;
            }
        }

        return gcd;
    }
    public void addition(){
        System.out.print(fraction1.toString() + "+" + fraction2.toString() + "=");
        double tu = fraction1.getTu() *fraction2.getMau() + fraction1.getMau() * fraction2.getTu();
        double mau = fraction1.getMau() * fraction2.getMau();
        int y = getDecimal(tu, mau);
        if(y >= 1){
            tu = tu*Math.pow(10, y);
            mau = mau*Math.pow(10, y);
        }
        int gcd = GCD(tu, mau);
        System.out.println((int)tu/gcd + "/" + (int)mau/gcd);
    }

    public void subtraction(){
        System.out.print(fraction1.toString() + "-" + fraction2.toString() + "=");
        double tu = fraction1.getTu() *fraction2.getMau() - fraction1.getMau() * fraction2.getTu();
        double mau = fraction1.getMau() * fraction2.getMau();
        int y = getDecimal(tu, mau);
        if(y >= 1){
            tu = tu*Math.pow(10, y);
            mau = mau*Math.pow(10, y);
        }
        int gcd = GCD(tu, mau);
        System.out.println((int)tu/gcd + "/" + (int)mau/gcd);
    }

    public void multiplication(){
        System.out.print(fraction1.toString() + "*" + fraction2.toString() + "=");
        double tu = fraction1.getTu() *fraction2.getTu() ;
        double mau = fraction1.getMau() * fraction2.getMau();
        int y = getDecimal(tu, mau);
        if(y >= 1){
            tu = tu*Math.pow(10, y);
            mau = mau*Math.pow(10, y);
        }
        int gcd = GCD(tu, mau);
        System.out.println((int)tu/gcd + "/" + (int)mau/gcd);
    }

    public void division(){
        System.out.print(fraction1.toString() + ":" + fraction2.toString() + "=");
        double tu = fraction1.getTu() *fraction2.getMau() ;
        double mau = fraction1.getMau() * fraction2.getTu();
        int y = getDecimal(tu, mau);
        if(y >= 1){
            tu = tu*Math.pow(10, y);
            mau = mau*Math.pow(10, y);
        }
        int gcd = GCD(tu, mau);
        System.out.println((int)tu/gcd + "/" + (int)mau/gcd);
    }



}
