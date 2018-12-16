package Opgaver.Ugeopgaver.Uge_1;
import java.util.Arrays;
import java.util.Scanner;

public class MindsteTal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Indtast tal 1");
        double n1 = scan.nextDouble();
        System.out.println("Indtast tal 2");
        double n2 = scan.nextDouble();
        System.out.println("Indtast tal 3");
        double n3 = scan.nextDouble();
        double[] a = new double[3];

        a[0] = n1;
        a[1] = n2;
        a[2] = n3;
        Arrays.sort(a);
        System.out.println("Det mindste er: " + a[0]);
    }}