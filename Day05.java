//Find Greatest of Two Numbers
import java.util.*;

public class Day05{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: -");
        int number1 = sc.nextInt();
        System.out.print("Enter the sceond number: -");
        int number2 = sc.nextInt();

        if(number1 == number2){
            System.out.println("Numbers are equal");
        }else{
        String result = number1 > number2 ? "First number" : "Second number";
        System.out.println(result + " is the largest");
        }

    }
}