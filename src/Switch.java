/*import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Number:");
        int number= reader.nextInt();
        switch (number) {
            case 1:
                System.out.println("Ali");
                break;
            case 5:
                System.out.println("Reza");
                break;
            case 32:
                System.out.println("Mehdi");
                break;
            default:
        }
        System.out.println("Error");
    }
}*/
 import java.util.Scanner;

public class MySwithch {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("please enter the number of your birth month");
        int monthenumber = keyboardInput.nextInt();
        switch (monthenumber) {
            case 1:
                System.out.println("you are born in Farvardin");
                break;
            case 2:
                System.out.println("you are born in Ordibehesht");
                break;
            case 3:
                System.out.println("you are born in Khordad");
                break;
            case 4:
                System.out.println("you are born in Tir");
                break;
            case 5:
                System.out.println("you are born in Mordad");
                break;
            case 6:
                System.out.println("you are born in Shahrivar");
               break;
            case 7:
                System.out.println("you are born in Mehr");
               break;
            case 8:
                System.out.println("you are born in Aban");
                break;
            case 9:
                System.out.println("you are born in Azar");
                break;
            case 10:
                System.out.println("you are born in Day");
                break;
            case 11:
                System.out.println("you are born in Bahman");
                break;
            case 12:
                System.out.println("you are born in Esfand");
                break;
            default:
                System.out.println("you made mistake");
        }
        keyboardInput.close();
    }
}