public class IntPhoneNumber extends PhoneNumber  {
    private String countryCode;

    public IntPhoneNumber() {
        System.out.println("IntPhonenumber added");
    }

    public IntPhoneNumber(int area, String number, String countryCode){
        super(area, number);
        this.countryCode = countryCode;
    }

    public void display(){
        System.out.println(countryCode+" - "+super.getAre()+" - "+super.getNumber());
    }
}
