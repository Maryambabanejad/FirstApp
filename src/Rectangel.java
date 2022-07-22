import java.util.Scanner;
public class Rectangel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int width = scanner.nextInt(),length = scanner.nextInt();
        long area = width * length;
        System.out.println(area);
    }
}
