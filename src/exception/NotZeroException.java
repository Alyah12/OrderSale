package exception;

public class NotZeroException extends RuntimeException{

    public NotZeroException(){
        super("A variavel não pode ser zero ou menor que zero.");
    }

    public NotZeroException(String message) {
        super(message);
    }
}
