//Sum of the Numbers in a Given Range 
import java.util.*;

public class Day04{
    public static void main(String args[]){
        Scanner sc = new Scanner(System .in);
        System.out.print("Enter number 1: - " );
        int number1 = sc.nextInt(); 
        System.out.print("Enter number 2: - " );
        int number2 = sc.nextInt(); 
        int sum = 0;

        for(int i = number1; i <= number2; i++){
           sum += i;
        }

        System.out.println("Sum is equal to: - " +sum);
    }
}