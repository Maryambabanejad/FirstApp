package Tamarin;

import java.util.Scanner;

public class Tamrin2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number:");
            int input = scanner.nextInt();
            if (input < 0) break;

            if (input % 2 == 0) {
                ;
                System.out.println(input);
            } else {
                System.out.println("number is not zoj");
            }
        }
    }
}


