package luk.sto.pl;

import java.util.ArrayList;

public class Exercise4 {

    public static void ex4() {

        ArrayList<String> listOfNames = new ArrayList<String>();
        //4a
        listOfNames.add("Tomek");
        listOfNames.add("Mikolaj");
        listOfNames.add("Jolanta");
        listOfNames.add("Michal");
        //4b
        for (int i = 0;i<listOfNames.size();i++){
            System.out.println("Wyswietlenie imion: " + listOfNames.get(i));
        }
        //4c
        for (int i = listOfNames.size() -1 ;i >= 0;i--){
            System.out.println("Wyswietlenie od konca: " + listOfNames.get(i));
        }
    }
}
