import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Year:");
        year = scan.nextInt();

        if (year%400 ==0){
            System.out.println("Leap year");
        }
        else if (year%4==0){
            System.out.println("Leap Year");
        }
        else if (year%100 !=0){
            System.out.println("Not leap year");
        }
        else {
            System.out.println("Not Leap Year");
        }
    }
}
