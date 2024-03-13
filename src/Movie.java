import java.io.*;

public class Movie implements Serializable {

    private int year;
    private String title;
    private double duration;
    private String genres;
    private int rating;
    private int score;
    private String director;
    private String actor1;
    private String actor2;
    private String actor3;

    public Movie() {
        this(0, "", 0.0, "", 0, 0, "", "", "", "");
    }

    public Movie(int year, String title, double duration, String genres, int rating, int score, String director, String actor1, String actor2, String actor3){
        this.year = year;
        this.title = title;
        this.duration = duration;
        this.genres = genres;
        this.rating = rating;
        this.score = score;
        this.director = director;
        this.actor1 = actor1;
        this.actor2 = actor2;
        this.actor3 = actor3;
    }

    public Movie(Movie otherMovie){
        this.year = otherMovie.year;
        this.title = otherMovie.title;
        this.duration = otherMovie.duration;
        this.genres = otherMovie.genres;
        this.rating = otherMovie.rating;
        this.score = otherMovie.score;
        this.director = otherMovie.director;
        this.actor1 = otherMovie.actor1;
        this.actor2 = otherMovie.actor2;
        this.actor3 = otherMovie.actor3;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor1() {
        return actor1;
    }

    public void setActor1(String actor1) {
        this.actor1 = actor1;
    }

    public String getActor2() {
        return actor2;
    }

    public void setActor2(String actor2) {
        this.actor2 = actor2;
    }

    public String getActor3() {
        return actor3;
    }

    public void setActor3(String actor3) {
        this.actor3 = actor3;
    }

    public boolean equals(Object obj){

        if (obj == null){
            return false;
        }
        if (this.getClass() != obj.getClass()){
            return false;
        }

        Movie otherMovie = (Movie) obj;
        return ((getYear() == (otherMovie.getYear())) &&
                (getTitle().equals(otherMovie.getTitle())) &&
                (getDuration() == otherMovie.getDuration()) &&
                (getGenres().equals(otherMovie.getGenres())) &&
                (getRating() == otherMovie.getRating()) &&
                (getScore() == otherMovie.getScore()) &&
                (getDirector().equals(otherMovie.getDirector())) &&
                (getActor1().equals(otherMovie.getActor1())) &&
                (getActor2().equals(otherMovie.getActor2())) &&
                (getActor3().equals(otherMovie.getActor3())));
    }

    @Override
    public String toString(){

        return  "----------------------------------------------------------------------" +
                "\nRelease Year: " + getYear() +
                "\nTitle: " + getTitle() +
                "\nDuration: " + getDuration() +
                "\nGenre: " + getGenres() +
                "\nRatings: " + getRating() +
                "\nScore: " + getScore() +
                "\nDirector: " + getDirector() +
                "\nActors: " + getActor1() + ", " + getActor2() + ", " + getActor3() + "\n";
    }
    

}