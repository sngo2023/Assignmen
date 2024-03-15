public class BadTitleException extends Exception{

    public BadTitleException() {
        super("BadYearException: Year must be between 1990 and 1999");
    }

    public BadTitleException(String message) {
        super(message);
    }

}