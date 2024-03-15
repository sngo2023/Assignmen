public class BadDurationException extends Exception{

        public BadDurationException() {
            super("BadDurationException: Duration must be between 30 and 300 minutes.");
        }

        public BadDurationException(String message) {
            super(message);
        }
    
}