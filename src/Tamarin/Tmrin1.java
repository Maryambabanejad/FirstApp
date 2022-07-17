/*package Tamarin;

import java.util.Scanner;
public class Tmrin1 {
    public static void main(String[] args) {
            System.out.println("برنامه ایی بنویسید که سه عدد از کاربر دریافت نمائیدو میانگین آن را محاسبه کنید ");
        Scanner input = new Scanner(System.in);
       double a = input.nextInt(),b=input.nextDouble(),c=input.nextDouble();
     double miyangin=(a+b+c)/3;
        System.out.println("number is :"+ miyangin);
}
}*/

import java.util.Scanner;

class Tmarin1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("برنامه ایی بنویسید که سه عدد از کاربر دریافت نمائیدو میانگین آن را محاسبه کنید ");
        double sum = 0;
        for (int counter = 1; counter <= 3; counter++) {
            sum += scanner.nextInt();
        }
        System.out.println(sum / 3);

    }
}




