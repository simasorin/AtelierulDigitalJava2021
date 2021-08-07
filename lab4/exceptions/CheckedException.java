package lab4.exceptions;

public class CheckedException extends Exception{
    public CheckedException(){
        super("You inserted 0 and this is not allowed here!");
    }
}