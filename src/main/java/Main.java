import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        MenuForUser menuForUser = new MenuForUser();
        menuForUser.printMenuForUser();
        System.out.println("\n//---------------------------------------//\n");

        MovieLibrary movieLibrary = new MovieLibrary();
        movieLibrary.readTheNewListOfMovies();
    }
}