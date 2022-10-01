import java.nio.file.attribute.UserDefinedFileAttributeView;
class UserDefinedException extends Exception {
    //Throwing user defined exception
    public UserDefinedException(String str){
        super(str);
    }
}
public class Throw2{
    public static void main(String[] args) {
        try{
            //throw an exception of user defined exception
            throw new UserDefinedException("Hello Its my own Exception!");
        }
        catch (UserDefinedException ude){
            System.out.println("Caught Exception");
            System.out.println(ude.getMessage());
        }
    }
}
