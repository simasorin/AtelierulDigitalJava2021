package lab4.exceptions;

public class UncheckedException extends RuntimeException{
    public UncheckedException(){
        super("Some exception you can't recover from!!!");
    }
}