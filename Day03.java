//Find the Sum of First N Natural Numbers
import java.util.*;

public class Day03{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: - ");
        int number = sc.nextInt();
        int sum = (number * (number + 1)/ 2);
        System.out.println("Sum is: - " + sum);
    }
}