//Find the Sum of First N Natural Numbers
import java.util.*;

public class Day03{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        
        for(int i = 0; i <= number; i++){
            sum += i;
        }
        
        System.out.println("Sum is: - " + sum);
    }
}