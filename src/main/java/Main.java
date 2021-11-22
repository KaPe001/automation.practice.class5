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

        try {
            File newMoviesList = new File("src/main/resources/movies.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(newMoviesList);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("movie");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                System.out.println("\nNode Name: " + node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("Movie ID: " + element.getElementsByTagName("id").item(0).getTextContent());
                    System.out.println("Title: " + element.getElementsByTagName("title").item(0).getTextContent());
                    System.out.println("Year: " + element.getElementsByTagName("year").item(0).getTextContent());
                    System.out.println("Director: " + element.getElementsByTagName("director").item(0).getTextContent());
                    System.out.println("Genre: " + element.getElementsByTagName("genre").item(0).getTextContent());
                    System.out.println("Actors:");
                    System.out.println(element.getElementsByTagName("actor").item(0).getTextContent());
                    System.out.println(element.getElementsByTagName("actor").item(1).getTextContent());
                    System.out.println(element.getElementsByTagName("actor").item(2).getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}