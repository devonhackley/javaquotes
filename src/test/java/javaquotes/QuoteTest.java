package javaquotes;

import org.junit.Test;
import static org.junit.Assert.*;

public class QuoteTest {
    @Test public void testQuoteConstructor(){
        Quote librayToTest = new Quote("Devon", "This is a body of a quote", 0,  "");
        assertEquals("Devon", librayToTest.getAuthor());
        assertEquals("This is a body of a quote", librayToTest.getText());
    }
    @Test public void testQuoteToString(){
        Quote librayToTest = new Quote("Devon", "This is a body of a quote", 0, "");
        System.out.println(librayToTest.toString());
        assertEquals("This is a body of a quote\" written by Devon", librayToTest.toString());
    }
}
