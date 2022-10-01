//Throw keyword is used to throw the exception explicitly
public class Throw1 {
    public static void validate(int age){
        if(age< 18){
            //throw an exception if not eligible to vote
            throw new NullPointerException("Person is not eligible to vote");
//            throw new ArithmeticException("Person is not eligible to vote");
//            throw new ArrayIndexOutOfBoundsException("Person is not eligible to vote");
            //Above will work
        }
        else
            System.out.println("Eligible to vote");
    }
    public static void main(String[] args) {
        validate(13);
        System.out.println("rest of the code...");
    }
}
