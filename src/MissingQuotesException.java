public class MissingQuotesException extends Exception {

        public MissingQuotesException() {
            super("MissingQuotesException: Fields with data that includes a comma must be enclosed in double quotes.");
        }

        public MissingQuotesException(String message) {
            super(message);
        }
    
}