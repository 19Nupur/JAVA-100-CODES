//Greatest Number Among Three Numbers
import java.util.*;
public class Day06{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: -");
        int number1 = sc.nextInt();
        System.out.println("Enter second number: -");
        int number2 = sc.nextInt();
        System.out.println("Enter third number: -");
        int number3 = sc.nextInt();

        int  temp = number1 > number2? number1 : number2;
        
        int result = temp > number3 ? temp : number3;

        System.out.println(result + " is greater");

    }
}