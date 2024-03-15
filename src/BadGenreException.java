public class BadGenreException extends Exception{

        public BadGenreException() {
            super("BadGenreException: Requested genre does not exist.");
        }

        public BadGenreException(String message) {
            super(message);
        }
    
}