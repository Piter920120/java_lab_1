import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */
        int tab1[] = new int[5];
        tab1[0] = 29;

        tab1[1]=21;
        tab1[2]=3;
        tab1[3]=100;
        tab1[4]=1;
        System.out.println(tab1.length);
        for (int i = 0; i < tab1.length; i++){
            System.out.println(tab1[i] + " ");
        }


     }
}
