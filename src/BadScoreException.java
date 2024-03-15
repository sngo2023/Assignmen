public class BadScoreException extends Exception{

        public BadScoreException() {
            super("BadScoreException: Score must be between 0 and 10.");
        }

        public BadScoreException(String message) {
            super(message);
        }
    
}