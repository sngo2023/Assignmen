public class BadYearException extends Exception{

        public BadYearException() {
            super("BadYearException: Year must be between 1990 and 1999");
        }

        public BadYearException(String message) {
            super(message);
        }
    
}
