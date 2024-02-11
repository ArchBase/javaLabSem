import java.util.Scanner;;
/**
 * Exception
 */
class MyException extends Exception{
    
}
public class Exp {

    public static void main(String[] args) {
        int a=9, b=0;
        try{
            a/=b;
        }
        catch( e){
            System.out.println("An arithemetic exception have occurred");
        }
    }
}



