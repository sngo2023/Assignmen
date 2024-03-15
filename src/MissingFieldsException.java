public class MissingFieldsException extends Exception {

    public MissingFieldsException() {
        super("ExcessFieldsException: There are fewer than 10 fields.");
    }

    public MissingFieldsException(String message) {
        super(message);
    }
}