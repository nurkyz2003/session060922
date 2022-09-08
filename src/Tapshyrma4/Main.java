package Tapshyrma4;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            linkedList1.add(i, random.nextInt(1, 20));
        }
        System.out.println(linkedList1);
        method1(linkedList1,n);
    }
    static void method1 (LinkedList<Integer> linkedList,int n){
        for (int i = 0; i < 10; i++) {
            if (linkedList.get(i) % 2 == 0){
                linkedList.set(i,(linkedList.get(i)*n));
            }
        }
        System.out.println(linkedList);
    }
}
