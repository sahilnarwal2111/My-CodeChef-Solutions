public class exceptionHandling1 {
    public static void main(String[] args) {
        try{
            int d = 50/0;
            System.out.println("Post Exception");
            // It is important to put only doubtful cases in try block none other have guranteed of being run
        }
        catch (ArithmeticException e){
            System.out.println("I m catch block");
        }
        finally {
            System.out.println("Hello i m finally block");
        }
        System.out.println("Hello I m rest of code !");
    }
}
