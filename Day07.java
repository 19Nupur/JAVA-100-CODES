//Check Leap Year or not
import java.util.*;
public class Day07{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year: - ");
        int year = sc.nextInt();

        if(year%400 == 0 || year%4 == 0 && year%100 != 0){
            System.out.println("This is a Leap Year!!");
        }
        else{
            System.out.println("This is not a leap year:)");
        }
    }
}