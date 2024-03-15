public class ExcessFieldsException extends Exception {

    public ExcessFieldsException() {
        super("ExcessFieldsException: There are more than 10 fields.");
    }

    public ExcessFieldsException(String message) {
        super(message);
    }
}
