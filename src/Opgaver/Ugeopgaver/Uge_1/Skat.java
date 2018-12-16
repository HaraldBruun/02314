package Opgaver.Ugeopgaver.Uge_1;

public class Skat {
    public static void main(String [] args){

        int indkomst = 120000;
        int personfradrag = 33400;

        int ambi, pension, bundskat;

        ambi = indkomst * 8 / 100;
        pension = indkomst * 1 / 100;
        System.out.println("Arbejdsmarkedsbidrag: " + ambi + ",-");
        System.out.println("Særlig pensionsopsparing: " + pension + ",-");
        bundskat = (indkomst - ambi - pension - personfradrag) * 7 / 100;
        System.out.println("Bundskat: " + bundskat + ",-");



    }
}
