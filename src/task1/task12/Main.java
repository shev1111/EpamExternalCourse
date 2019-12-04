package task1.task12;

import task1.task12.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value to find perfect numbers: ");
        long value = sc.nextInt();
        Printer.printAllPerfectNumbers(value);
    }
}
