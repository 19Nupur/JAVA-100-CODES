//Print Prime numbers in a given range
import java.util.*;
import java.lang.Math;
public class Day09{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower :-");
        int lower = sc.nextInt();
        System.out.print("Enter the higher :-");
        int higher = sc.nextInt();

        for(int i = lower; i <= higher; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
            
        }
    }


        static boolean isPrime(int n){
            if(n < 2){
                return false;
            }

            for (int i = 2; i <= Math.sqrt (n); i++){
 	   
              if (n % i == 0){
                return false;
              }
 	           
            }

            return true;
        }

    

}