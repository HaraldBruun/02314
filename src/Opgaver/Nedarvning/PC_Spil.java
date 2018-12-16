package Opgaver.Nedarvning;

public class PC_Spil extends Spil {
    private boolean isOnline;
    private boolean isWindows;
    private boolean isMac;

    public PC_Spil(String title, String genre, double pris, boolean isOnline, boolean isWindows, boolean isMac) {
        super(title, genre, pris);
        this.isOnline = isOnline;
        this.isWindows = isWindows;
        this.isMac = isMac;
    }

    @Override
    public void info() {
        String infoString = "Title: " + title + " Genre: " + genre + " Pris: " + pris + " Online: " + isOnline + " Kompatibel med Windows: " + isWindows + " Kompatibel med Mac: " + isMac;
        System.out.println(infoString);
    }
}