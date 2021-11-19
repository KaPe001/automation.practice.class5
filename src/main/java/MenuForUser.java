import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MenuForUser {
    List<Movie> movies;
    List<Actor> actors;
    List<Director> directors;

    MovieLibrary movieLibrary = new MovieLibrary();

    public Movie getRandomMovie(List<Movie> movies) {
        Random random = new Random();
        return movies.get(random.nextInt(movies.size()));
    }

    public void printMenuForUser() throws IOException {
        MovieLibrary movieLibrary = new ObjectMapper().readValue(new URL("file:src/main/resources/movies.json"), MovieLibrary.class);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1, 2, or 3");
        int userChoice = sc.nextInt();

        switch (userChoice) {
            case 1:
                System.out.println("Enter two dates to see movies in this range");
                int firstDate = sc.nextInt();
                int secondDate = sc.nextInt();

                if (firstDate > secondDate) {
                    int laterDate = firstDate;
                    firstDate = secondDate; //elvis operator
                    secondDate = laterDate;
                }
                for (Movie movie : movieLibrary.getMovies()) {
                    if (firstDate <= movie.getDate() && secondDate >= movie.getDate()) {
                        System.out.println(movie.getTitle());
                    }
                }
                break;
            case 2:
                System.out.println(getRandomMovie(movieLibrary.getMovies()));
                break;
            case 3:
                System.out.println("Enter actors first name and last name to see what movies they played in");
                String name = sc.next();
                String lastName = sc.next();
                for (Movie movie : movieLibrary.getMovies()) {
                    for (Actor actor : movie.getActors()) {
                        if (name.equals(actor.getFirstName()) && lastName.equals(actor.getLastName())) {
                            System.out.println(movie.getTitle());
                        }
                    }
                }
        }
    }
}
