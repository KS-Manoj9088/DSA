public class isEmptyStackException extends Exception {
    public isEmptyStackException() {
        super("Stack is empty");
    }

    public isEmptyStackException(String message) {
        super(message);
    }
}