//Check Whether a Number is Even or Odd
import java.util.*;

public class Day02{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        String result = number%2 == 0? "even": "odd";
        System.out.println("Number is " + result);
    }
}