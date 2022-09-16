import java.util.*;
public class arrindex {
    public static void main(String[]args){
        int i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:   ");
        int size = sc.nextInt();
        
        System.out.println("Enter the values you want:  ");
        int numbs[] = new int[size];
        
        //input
        
        for(i = 0; i<size; i++){
            numbs[i]= sc.nextInt();
        }
        
        System.out.println("Enter value of x");
        int x = sc.nextInt();
        
        
         
         
        //output
        for(i = 0; i<numbs.length; i++){
            if(numbs[i]==x){
                System.out.println("x found at index :" + "" + i);
                
            }
        
        
        
        
        
    }
    
    }
    
}