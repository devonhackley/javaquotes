package javaquotes;

import org.junit.Test;


import static org.junit.Assert.*;
public class QuoteReaderTest {
    @Test public void testQuoteReaderConstructor(){
        String path = "src/main/resources/recentquotes.json";
        QuoteReader libraryToTest = new QuoteReader(path);

        assertEquals(path, libraryToTest.getPath());
    }

    @Test public void testQuoteReaderReadFile(){
        String path = "src/main/resources/recentquotes.json";
        QuoteReader libraryToTest = new QuoteReader(path);

        libraryToTest.readFromFile();

        assertNotNull(libraryToTest.getReader());
    }
    @Test public void testQuoteReaderReadFileFileNotFound(){
        String path = "";
        QuoteReader libraryToTest = new QuoteReader(path);

        libraryToTest.readFromFile();
        assertNull(libraryToTest.getReader());
    }
    @Test public void testQuoteReaderSetQuotes(){
        String path = "src/main/resources/recentquotes.json";
        QuoteReader libraryToTest = new QuoteReader(path);

        libraryToTest.setQuotesArray();
        assertNotNull(libraryToTest.getQuotesList());
    }
    @Test public void testQuoteReaderGrabRandomQuote(){
        String path = "src/main/resources/recentquotes.json";
        String url = "http://swquotesapi.digitaljedi.dk/api/SWQuote/RandomStarWarsQuote";
        QuoteReader libraryToTest = new QuoteReader(path);

        String test = libraryToTest.grabRandomQuote(url);
        assertNotNull(test);
        assertNotNull(libraryToTest.getQuotesList());
    }
    @Test public void testQuoteReaderGrabRandomQuoteNoURL(){
        String path = "src/main/resources/recentquotes.json";
        String url = "";
        QuoteReader libraryToTest = new QuoteReader(path);
        libraryToTest.setQuotesArray();

        String test = libraryToTest.grabRandomQuote(url);
        assertNotNull(test);
    }

}
