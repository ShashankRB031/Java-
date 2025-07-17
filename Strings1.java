import java.util.*;
public class Strings1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name =sc.nextLine();
        // next will only take single word input, 
        // nextLine will take all input so use nextLine 
        

        System.out.println("Your name is "+ name);
        sc.close();
    }

}
