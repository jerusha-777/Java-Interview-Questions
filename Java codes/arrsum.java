import java.util.*;
public class arrsum {
    
    public static void main(String [] args){
        int x=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int numb[]= new int[size];

        //input
        for(int i=0; i<size; i++){
            System.out.println("Enter the value of" + " " + i+ "index");
            numb[i]= sc.nextInt();
        }
        //output
        System.out.println("Your entered values are displayed!");
        
        for(int i=0; i<size; i++){
            x = x + numb[i];
            
            
        }
        System.out.println("sum of array is : "+ x);

        


    }

}
