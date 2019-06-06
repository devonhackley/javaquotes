package javaquotes;

import java.util.List;

public class Quote {
    private String author;
    private String text;

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

    public Quote(String author, String text){
        this.author = author;
        this.text = text;
    }

    public String toString(){
        return String.format("%s\" written by %s", this.text, this.author);
    }
}
