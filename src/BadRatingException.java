public class BadRatingException extends Exception{

        public BadRatingException() {
            super("BadRatingException: Rating must be PG, Unrated, G, R, PG-13, NC-17.");
        }

        public BadRatingException(String message) {
            super(message);
        }
    
}