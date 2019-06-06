package javaquotes;

import org.junit.Test;
import static org.junit.Assert.*;
public class QuotesTest {
    @Test public void testQuotesConstructor(){
        Quote q1 = new Quote("Devon", "This is a body of a quote");
        Quote q2 = new Quote("Blab", "Something here here");
        Quote[] arr = new Quote[]{q1, q2};

        //create quotes instance
        Quotes qArray = new Quotes(arr);
        assertEquals(2, qArray.getSize());
        assertArrayEquals(arr, qArray.getQuotes());
    }

    @Test public void testQuotesGrabOneQuote(){
        Quote q1 = new Quote("Devon", "This is a body of a quote");
        Quote q2 = new Quote("Blab", "Something here here");
        Quote q3 = new Quote("Sa", "sadasdasdasda");
        Quote[] arr = new Quote[]{q1, q2};

        //create quotes instance
        Quotes qArray = new Quotes(arr);
        assertNotNull(qArray.grabOneQuote());
    }
}
