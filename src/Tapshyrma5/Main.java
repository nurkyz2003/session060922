package Tapshyrma5;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Country> linkedList1 = new LinkedList<>();
            linkedList1.add(new Country(3287742,2869,1407894000,"India"));
            linkedList1.add(new Country(9826067,21433,336023460,"AKW"));
            linkedList1.add(new Country(9596962,14402,1423758000,"China"));
            linkedList1.add(new Country(1919441,1120,28048850,"Indoneziya"));
            linkedList1.add(new Country(377975,5080,126351069,"Japon"));
            linkedList1.add(new Country(8515766,1839,217802980,"Braziliya"));
            linkedList1.add(new Country(1964375,1258,128649565	,"Mexica"));
            linkedList1.add(new Country(357588,3862,83349300,"Germany"));
            linkedList1.add(new Country(1002000,302,107389880,"Egipet"));

        Collections.sort(linkedList1,Country.sortByName);
        System.out.println("----------------------------------------BY NAME-----------------------------------------------");
        for (Country counts : linkedList1) {
            System.out.println(counts);
        }
        System.out.println("\n----------------------------------------BY ID-----------------------------------------------");
        Collections.sort(linkedList1,Country.sortById);
        for (Country counts : linkedList1) {
            System.out.println(counts);
        }
        LinkedList<Country> linkedList2 = new LinkedList<>(linkedList1);
        Collections.sort(linkedList2,Country.sortByPopulation);
        System.out.println("\n----------------------------------------BY POPULATION-----------------------------------------------");
        for (Country counts : linkedList2) {
            System.out.println(counts);
        }

        Collections.sort(linkedList2,Country.sortByGdp);
        System.out.println("\n----------------------------------------BY GDP-----------------------------------------------");
        for (Country counts : linkedList2) {
            System.out.println(counts);
        }
    }
}
