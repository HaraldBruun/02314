package Opgaver.Nedarvning;

public abstract class Spil {
    protected String title;
    protected String genre;
    protected double pris;

    protected Spil ( String title, String genre, double pris){
        this.title = title;
        this.genre = genre;
        this.pris = pris;
    }

    // Info
    protected void info(){
        String infoString = "Title: " + title + " Genre: " + genre + " Pris: " + pris;
        System.out.println(infoString);
    }
}
