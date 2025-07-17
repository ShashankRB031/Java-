import java.util.*;
public class ArrayTypetwo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number to get array :");
        int size=sc.nextInt();
        int numbers []=new int [size];

        //input3
        for(int i=0; i<size; i++){
            numbers[i]=sc.nextInt();
        }

        //output 
        for(int i=0; i<size; i++){
            System.out.println(numbers[i]);
            sc.close();
        }
        
    }
    
}
