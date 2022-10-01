class MyOwnException extends Exception{
    public MyOwnException(String str){
        super(str);
    }
}
public class Throw3 {
    public static void main(String[] args) {
        try{
            throw new MyOwnException("My own exception");
        }
        catch (MyOwnException moe){
//            System.out.println(moe.getCause());
//            System.out.println(moe.getStackTrace());
            System.out.println(moe.getMessage());
        }
    }
}
