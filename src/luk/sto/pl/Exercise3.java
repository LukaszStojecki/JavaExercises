package luk.sto.pl;

import java.util.ArrayList;

public class Exercise3 {

    public static void ex3(){

        ArrayList<Double> tab3 = new ArrayList<Double>();
        tab3.add(2.5);
        tab3.add(6.5);
        tab3.add(3.5);
        tab3.add(4.5);
        tab3.add(5.5);
        tab3.add(2.5);
        tab3.add(8.5);
        tab3.add(8.5);
        tab3.add(7.5);
        tab3.add(8.5);
        //System.out.println(tab3);
        double elementFirst = tab3.get(0);
        double elementSecond = tab3.get(1);
        double elementBeforeLast = tab3.get(8);
        double elementLast = tab3.get(9);

        System.out.println("Suma pierwszego i ostatniego elementu: " + (elementFirst + elementLast) );
        System.out.println("Iloczyn pierwszego i ostatniego elementu: " + elementFirst * elementLast );
        System.out.println("Iloraz drugiego i przedostatniego elementu: " + elementSecond / elementBeforeLast);
    }
}
