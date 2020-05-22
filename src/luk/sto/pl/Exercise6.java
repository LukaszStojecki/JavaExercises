package luk.sto.pl;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Exercise6 {

    public static void ex6() {

        Queue<Integer> queueOfNumbers = new PriorityQueue<Integer>();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj ilosc liczb do losowania: ");
        int randNumbers = keyboard.nextInt();
        System.out.println("Losujemy: " + randNumbers + " liczb ");

        Random generator = new Random();
        for (int i = 0; i < randNumbers; i++) {
            queueOfNumbers.add(generator.ints(1, 100).findAny().getAsInt());
        }
        System.out.println("Wylosowane liczby to: " + queueOfNumbers);

    }

}
