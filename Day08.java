//Prime Number Program
import java.util.*;
import java.lang.Math;
public class Day08{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: -");
        int number = sc.nextInt();
        boolean isPrime = true;

        if(number < 2){
            isPrime = false;
        }else{
            for(int i = 2; i <= Math.sqrt(number); i++){
                if(number % i == 0){
                    isPrime = false;
                    break;
                }

            }
        }
        String result = isPrime? "Prime" : "not prime";
        System.out.println(number + " is " + result);
    }
}