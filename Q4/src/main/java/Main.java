

public class Main {
    public static void main(String[] args) {
        System.out.println("---------  Q4.1 ----------------");
        Book book = new Book();
        Author author = new Author();
        author.setId_author(1);
        author.setName_author("Lan Anh");
        book.setAuthor(author);
        book.setTitle("Hi, this is title");
        book.setNoOfPages(10);
        System.out.println(book.toString());
        book.setFiction(true);
        System.out.println(book.toString());
        System.out.println("---------  Q4.2 ----------------");
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm/dd/yyyy");
//        Date date = simpleDateFormat.parse("03-08-2001");
//        //Student student = new Student("Nguyen Thi Lan Anh", "HE150434",simpleDateFormat.parse(), "Ha Noi", "SE", 8.4 );
//        //student.printAllAttributes();

        System.out.println("---------  Q4.3 ----------------");
        Rectangle rectangle = new Rectangle();
        rectangle.input_data();
        rectangle.display_data();
        System.out.println("---------  Q4.4 ----------------");
        CalculateFraction calculateFraction = new CalculateFraction(new Fraction(34.5, 36.5), new Fraction(34.5, 37.5));
        calculateFraction.addition();
        calculateFraction.subtraction();
        calculateFraction.multiplication();
        calculateFraction.division();
    }
}
