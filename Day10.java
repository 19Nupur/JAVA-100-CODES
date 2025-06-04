//Sum of digits of a Number
import java.util.*;

public class Day10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: - ");
        int number = sc.nextInt();
        int sum = 0;

        while(number != 0){
           sum += number % 10;
           number = number / 10; 
        }
        System.out.println(sum);
    }
}