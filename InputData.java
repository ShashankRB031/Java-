import java.util.Scanner;

public class InputData{
   public static void main(String args[])
    {
        Scanner reader =new Scanner(System.in) ; //reaser is an object
        System.out.println("Enter a number = ");
           int num = reader.nextInt();   //reader Input
          System.out.println("Entered number is: "+ num);
        }
}