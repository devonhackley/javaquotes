package javaquotes;

import java.util.Random;

public class Quotes {
    private Quote[] quotes;
    private int size;

    public Quote[] getQuotes() {
        return quotes;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setQuotes(Quote[] quotes) {
        this.quotes = quotes;
    }

    public Quotes(Quote[] quotes){
        this.quotes = quotes;
        this.size = quotes.length;
    }

    public Quote grabOneQuote(){
        Random rand = new Random();
        int randomNumber =rand.nextInt(this.size);
        return this.quotes[randomNumber];
    }
}
