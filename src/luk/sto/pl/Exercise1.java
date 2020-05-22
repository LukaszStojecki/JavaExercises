package luk.sto.pl;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {


    public static void Ex1() {

        //1a
        int[] tab1 = new int[10];

        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = i +1;
            System.out.println("Dodano do tablicy: " + tab1[i]);
        }

        //1b
        System.out.print("\n");
        System.out.println("Tablica ma: " + tab1.length + " elementów");

        //1c
        System.out.print("\n");
        for (int i = 0;i <tab1.length;i++){
            System.out.print( + tab1[i] + " ");
        }

        //1d + 1e
        System.out.print("\n");
        for (int i = 0; i < tab1.length;i++){
            tab1[i] = (i + 1) * 2;
            System.out.print(tab1[i] + " ");
        }
    }

}

