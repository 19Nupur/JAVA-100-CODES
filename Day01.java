import java.util.*;
//Code to Check if a Number is Positive or Negative
public class Day01{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();

        //using Ternary operator
        if(number == 0){
            System.out.println("Zero"); 
        }
        else{
            String result = number > 0 ? "Number is positive":"Number is negative";
        System.out.println(result);
        }
    }
}