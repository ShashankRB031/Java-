import java.util.*;
public class Indexprint {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number to get array :");
        int size=sc.nextInt();
        int numbers []=new int [size];
        //input 
        for(int i=0; i<size; i++){
            numbers[i]=sc.nextInt();
        }
        System.out.print("Enter the num to get index: ");
        
        int x =sc.nextInt();


        //output
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==x){
                System.out.println("x found at index " + i);
            }
        }
    }
    
}
