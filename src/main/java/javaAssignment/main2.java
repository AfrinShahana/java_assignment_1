package javaAssignment;


//2. Write a program that will count number of notes from given array
//        [1000,500,200,100,50,20,10,5,2,1]
//        Input: 562
//        Output:
//        500 1
//        50 1
//        10 1
//        2 1
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();
        int[] notes = { 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
        int[] noteCounter = new int[10];

        for (int i = 0; i < 10; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }

        System.out.println("Currency Count ->");
        for (int i = 0; i < 10; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : " + noteCounter[i]);
            }
        }
    }
}
