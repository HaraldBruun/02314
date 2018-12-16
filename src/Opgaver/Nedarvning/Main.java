package Opgaver.Nedarvning;
public class Main {
    public static void main(String[] args){

    PS_Spil mario = new PS_Spil( "Mario", "Adventure", 99.95, 2, true, false);
    mario.info();

    PC_Spil gta4 = new PC_Spil("Grand Theft Auto IV", "Action", 499.95, true, true, false);
    gta4.info();

    // Arrays
        PC_Spil[] mine_PCSpil = new PC_Spil[3];
        mine_PCSpil[0] = new PC_Spil("Mordern Warfare 2", "FPS", 79.95, true, true,false);
        mine_PCSpil [1] = new PC_Spil("League of Legends", "MOBA", 0, true, true, true);
        mine_PCSpil [2] = new PC_Spil("Counter Strike Global Offensive", "FPS", 149.95, true, true,true);

        PC_Spil Spil1 = mine_PCSpil[0];
        Spil1.info();
        PC_Spil Spil2 = mine_PCSpil[1];
        Spil2.info();
        PC_Spil Spil3 = mine_PCSpil[2];
        Spil3.info();

        int[] myIntArray = new int[5];
        myIntArray[0] = 2;
        myIntArray[1] = 4;
        myIntArray[2] = 8;
        myIntArray[3] = 16;
        myIntArray[4] = 32;
        System.out.println(myIntArray[0] + myIntArray[1] + myIntArray[2] + myIntArray[3] + myIntArray[4]);

}
}