package javaquotes;

import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;
public class QuoteReaderTest {
    @Test public void testQuoteReaderConstructor(){
        String path = "/Users/dhackle/codefellows/401/labs/lab8/javaquotes/src/test/resources/test.json";
        QuoteReader libraryToTest = new QuoteReader(path);

        assertEquals(path, libraryToTest.getPath());
    }

    @Test public void testQuoteReaderReadFile(){
        String path = "/Users/dhackle/codefellows/401/labs/lab8/javaquotes/src/test/resources/test.json";
        QuoteReader libraryToTest = new QuoteReader(path);

        libraryToTest.readFromFile();

        assertNotNull(libraryToTest.getReader());
    }
    @Test public void testQuoteReaderReadFileFileNotFound(){
        String path = "/Users/dhackle/codefellows/401/labs/lab8/javaquotes/src/test/resources/blarg.json";
        QuoteReader libraryToTest = new QuoteReader(path);

        libraryToTest.readFromFile();
        assertNull(libraryToTest.getReader());
    }
}
