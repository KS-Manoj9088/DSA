public class EmptyStackException extends Exception{
    public String message;

    public EmptyStackException(String message){
        super(message);
    }
}
