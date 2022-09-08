package Tapshyrma3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 50; i++) {
            arrayList1.add(i, random.nextInt(0, 5));
        }
        System.out.println(arrayList1);
        int n = scanner.nextInt();
        for (int i = 0; i < 50; i++) {
            if (arrayList1.get(i) == 0)
                arrayList1.set(i,n);
        }
        System.out.println(arrayList1);
    }
}