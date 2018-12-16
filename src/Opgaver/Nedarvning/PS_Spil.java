package Opgaver.Nedarvning;
public class PS_Spil extends Spil{
    private int PSKonsol;
    private boolean isMultiplayer;
    private boolean isOnline;

    public PS_Spil(String title, String genre, double pris, int PSKonsol, boolean isMultiplayer, boolean isOnline){
        super(title, genre, pris);
        this.PSKonsol = PSKonsol;
        this.isMultiplayer = isMultiplayer;
        this.isOnline = isOnline;
    }

    @Override
    public void info(){
        String infoString = "Title: " + title + " Genre: " + genre + " Pris: " + pris + " PSKonsol: " + PSKonsol + " Multiplayer: " + isMultiplayer + " Online: " + isOnline;
        System.out.println(infoString);
    }
}
