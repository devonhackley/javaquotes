package javaquotes;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;

public class QuoteReader {
    private String path;
    private BufferedReader reader;
    private FileReader fileReader;
    private List<Quote> quotesList;
    private  Quotes qArray;

    public List<Quote> getQuotesList() {
        return quotesList;
    }

    public void setQuotesList(List<Quote> quotesList) {
        this.quotesList = quotesList;
    }

    public Quotes getqArray() {
        return qArray;
    }

    public void setqArray(Quotes qArray) {
        this.qArray = qArray;
    }

    public FileReader getFileReader() {
        return fileReader;
    }

    public void setFileReader(FileReader fileReader) {
        this.fileReader = fileReader;
    }

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
        this.quotesList = new LinkedList<>();
    }

    public void readFromFile(){
        try
        {
            this.fileReader = new FileReader(this.path);
            this.reader = new BufferedReader(this.fileReader);
        }
        catch (FileNotFoundException ex){
            System.out.println("Could not find the file");
            this.reader = null;
        }
    }

    public void writeToFile(){
        Gson gson = new Gson();
        try
        {
           FileWriter fw = new FileWriter(this.path);
           gson.toJson(this.quotesList, fw);
           fw.close();
        }
        catch (IOException ex){
            System.out.println("Could not write to file");
            this.reader = null;
        }
    }

    public void setQuotesArray(){
        Gson gson = new Gson();
        Quote[] quotes;
        try {
            this.readFromFile();
            quotes = gson.fromJson(this.reader, Quote[].class);
            this.reader.close();
            this.fileReader.close();
            this.qArray = new Quotes(quotes);
            for(Quote q : this.qArray.getQuotes()){
                this.quotesList.add(q);
            }
        } catch (IOException ex){
            System.out.println("Could not read from file");
        }
    }

    public String grabRandomQuote(String apiURL){
        Gson gson = new Gson();
        try {
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader((con.getInputStream())));
            Quote quote = gson.fromJson(reader, Quote.class);
            this.quotesList.add(quote);
            this.writeToFile();
            return quote.getStarWarsQuote();

        } catch(IOException ex) {

            return this.qArray.grabOneQuote().toString();
        }
    }
}
