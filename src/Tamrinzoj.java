import java.util.Scanner;

public class Tamrinzoj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("برنامه ایی بنوسید که فقط اعداد زوج را دریافت کرده و نتیجه را درخروجی چاپ کند");
            int i = scanner.nextInt();
            if (i < 0) break;
            if (i % 2 == 0) {
                System.out.println("number is zoj" + i);
            } else {
                System.out.println("number is not zoj");
            }
        }
    }
}