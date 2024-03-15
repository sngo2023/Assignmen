import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Scanner;

public class Movie implements Serializable {

    private int year;
    private String title;
    private double duration;
    private String genres;
    private String rating;
    private int score;
    private String director;
    private String actor1;
    private String actor2;
    private String actor3;

    public Movie() {
        this(0, "", 0.0, "", "", 0, "", "", "", "");
    }

    public Movie(int year, String title, double duration, String genres, String rating, int score, String director,
            String actor1, String actor2, String actor3) {
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

    public Movie(Movie otherMovie) {
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

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
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

    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Movie otherMovie = (Movie) obj;
        return ((getYear() == (otherMovie.getYear())) &&
                (getTitle().equals(otherMovie.getTitle())) &&
                (getDuration() == otherMovie.getDuration()) &&
                (getGenres().equals(otherMovie.getGenres())) &&
                (getRating().equals(otherMovie.getRating())) &&
                (getScore() == otherMovie.getScore()) &&
                (getDirector().equals(otherMovie.getDirector())) &&
                (getActor1().equals(otherMovie.getActor1())) &&
                (getActor2().equals(otherMovie.getActor2())) &&
                (getActor3().equals(otherMovie.getActor3())));
    }

    @Override
    public String toString() {

        return "----------------------------------------------------------------------" +
                "\nRelease Year: " + getYear() +
                "\nTitle: " + getTitle() +
                "\nDuration: " + getDuration() +
                "\nGenre: " + getGenres() +
                "\nRatings: " + getRating() +
                "\nScore: " + getScore() +
                "\nDirector: " + getDirector() +
                "\nActors: " + getActor1() + ", " + getActor2() + ", " + getActor3() + "\n";
    }

    public static void main(String[] args) {

        PrintWriter outputStream = null;
        try {
            outputStream = new PrintWriter(new FileOutputStream("part1_manifest.txt"));
            outputStream.print("Movies1990.csv" + "\nMovies1991.csv" + "\nMovies1992.csv" + "\nMovies1993.csv"
                    + "\nMovies1994.csv" + "\nMovies1995.csv" + "\nMovies1996.csv" + "\nMovies1997.csv"
                    + "\nMovies1998.csv" + "\nMovies1999.csv");
        } catch (FileNotFoundException e) {

        } finally {
            outputStream.close();
        }

        do_part1();

    }

    public static void do_part1() {

        PrintWriter badMovieRecordOutput = null, musicalOutput = null, comedyOutput = null, animationOutput = null, adventureOutput = null,
        dramaOutput = null, crimeOutput = null, biographyOutput = null, horrorOutput = null, actionOutput = null, documentaryOutput = null,
        fantasyOutput = null, mysteryOutput = null, sciFiOutput = null, familyOutput = null, westernOutput = null, romanceOutput = null, thrillerOutput = null; 

        Scanner manifestScanner = null;
        String manifestEntry;
        Scanner movieEntryScanner = null;
        String movieEntry;

        try {
            manifestScanner = new Scanner(new FileInputStream("part1_manifest.txt"));
        } catch (FileNotFoundException e) {
            
        }

        while(manifestScanner.hasNextLine()){
            manifestEntry = "";
            movieEntryScanner = null;
            movieEntry = "";

           /*
                Read next line of manifestStream
                Set the value of a string variable to the contents of that line
                Use that string variable as the paramter to a new InputStream
                Read the next line of that InputStream (this is now a movie entry)
                Then decide what to do with each movie entry
            */
            manifestEntry = manifestScanner.nextLine(); // Reads one line from the manifest text file 

            // Create a scanner to read from the supplied input files
            try {
                movieEntryScanner = new Scanner(new FileInputStream(manifestEntry));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("There was an error retrieving the file.");
                System.exit(0);
            }

            while (movieEntryScanner.hasNextLine()){ 
                // Read one line from a specific input file, which is a single movie entry
                Movie movie;
                //movieEntry = movieEntryScanner.nextLine();

                movieEntry = "1990,Child's Play 2,72,Fantasy,R,5.7,John Lafia,Jenny Agutter,Beth Grant,Greg Germann,";

                String[] movieEntryToArray = new String[10];
                int startIndex = 0;
                int endIndex = movieEntry.indexOf(',');

                movieEntryToArray[0] = movieEntry.substring(startIndex, endIndex);
                
                for (int i = endIndex + 1; i < movieEntry.length(); i++){
                    int j = 1;
                    if (movieEntry.charAt(i) == (',')){
                        String movieEntrySub = movieEntry.substring(startIndex);
                        startIndex = endIndex  + 1;
                        endIndex = movieEntrySub.indexOf(',');
                        movieEntryToArray[j] = movieEntry.substring(startIndex, endIndex);
                        j++;
                    }
                }

                int newYear = Integer.parseInt(movieEntryToArray[0]);
                double newLength = Double.parseDouble(movieEntryToArray[2]);
                int newScore = Integer.parseInt(movieEntryToArray[5]);
                
                movie = new Movie(newYear,movieEntryToArray[1], newLength,movieEntryToArray[3],movieEntryToArray[4], newScore,movieEntryToArray[6],movieEntryToArray[7],movieEntryToArray[8],movieEntryToArray[9] );
                System.out.print(movie);

            }
            

            try {
                badMovieRecordOutput = new PrintWriter(new FileOutputStream("bad_movie_records.txt"));
            } catch (FileNotFoundException e){
                System.out.println("There was an error retrieving the file.");
                System.exit(0);
            }
            finally {

            }
        
            manifestScanner.nextLine();
            
        
        }

    }

}