package javaquotes;

import java.util.List;

public class Quote {
    private String author;
    private String text;
    private int id;
    private String starWarsQuote;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStarWarsQuote() {
        return starWarsQuote;
    }

    public void setStarWarsQuote(String starWarsQuote) {
        this.starWarsQuote = starWarsQuote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Quote(String author, String text, int id, String starWarsQuote){
        this.author = author;
        this.text = text;
        this.starWarsQuote = starWarsQuote;
        this.id = id;
    }

    public String toString(){
        return String.format("%s\" written by %s", this.text, this.author);
    }

}
