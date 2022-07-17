package string1;
import java.util.Scanner;
public class String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] value;
        int length; () {
            System.out.println("برنامه ایی بنویسید که یک رشته را دریافت نماید و رشته دریافتی را بصورت معکوس در خروجی چاپ نماید");
            String str = input.next();
            System.out.println(str);
            System.out.println();
            return value.length;
            for (int i = str.length() - 1; i >= 0; i--) {
                System.out.println(str.charAt(i));
            }
        }
    }
}
