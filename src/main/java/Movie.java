import java.util.ArrayList;

public class Movie {
    private String title;
    private int date;
    private Director director;
    private String genre;
    private ArrayList<Actor> actors = new ArrayList<>();

    @Override
    public String toString() {
        return "\n" + "Title:  " + title +
                "\n" + "Director: " + director +
                "\n" + "Genre: " + genre +
                "\n" + "Date:" + date +
                "\n" + "Actors: " + actors;
    }

    public Movie(String title, int date, Director director, String genre, ArrayList<Actor> actors) {
        this.title = title;
        this.date = date;
        this.director = director;
        this.genre = genre;
        this.actors = actors;
    }

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    public Person getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
}