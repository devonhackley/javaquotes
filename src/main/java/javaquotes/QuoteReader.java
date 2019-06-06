package javaquotes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class QuoteReader {
    private String path;
    private BufferedReader reader;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public BufferedReader getReader() {
        return reader;
    }

    public void setReader(BufferedReader reader) {
        this.reader = reader;
    }

    public QuoteReader(String path) {
        this.path = path;
    }

    public void readFromFile(){
        try
        {
            this.reader = new BufferedReader(new FileReader(this.path));
        }
        catch (FileNotFoundException ex){
            System.out.println("Could not find the file");
            this.reader = null;
        }
    }
}
