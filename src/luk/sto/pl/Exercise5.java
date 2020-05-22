package luk.sto.pl;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise5 {

    public static void ex5() {

        ArrayList<String> listOdNames = new ArrayList<String>();
        System.out.println("Wprowadz Imiona: ");
        Scanner keyboard = new Scanner(System.in);

        //5a
        for (int i = 0; i < 5; i++) {
            String names = keyboard.nextLine();
            listOdNames.add(names);
            System.out.println("Wprowadzone imiona do listy to: " + listOdNames);
        }

        //5b
        int number = 0;
        while (number < listOdNames.size()) {
            System.out.println("Imiona w liscie to: " + listOdNames.get(number));
            number++;
        }

    }
}
