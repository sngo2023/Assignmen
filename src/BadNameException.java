public class BadNameException extends Exception{

        public BadNameException() {
            super("BadNameException: Invalid name.");
        }

        public BadNameException(String message) {
            super(message);
        }
    
}