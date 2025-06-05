// Reverse a given number
import java.util.*;

public class Day11{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter number: - ");
        int number = sc.nextInt();
        int rem, reverse = 0;

        while(number > 0){
            rem = number % 10;
            reverse = reverse * 10 + rem;
            number = number / 10;
        }
        System.out.println(reverse);

    }
}