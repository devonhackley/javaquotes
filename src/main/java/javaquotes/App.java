/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package javaquotes;


import java.net.URL;

public class App {

    public static void main(String[] args) {
            String path = "src/main/resources/recentquotes.json";
            QuoteReader read = new QuoteReader(path);
            // set back up quotes
            read.setQuotesArray();

            //make request to api
            String response = read.grabRandomQuote("http://swquotesapi.digitaljedi.dk/api/SWQuote/RandomStarWarsQuote");
            System.out.println(response);
    }
}
