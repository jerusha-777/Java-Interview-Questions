import java.util.*;
class arrmatrix{
    public static void main(String [] args){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the no of cols: ");
        int cols = sc.nextInt();
        
        System.out.println("Enter the values in rows and cols: ");
        int num[][] = new int[rows][cols];
        

        //input
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                num[i][j]= sc.nextInt();
            }

        }
        System.out.println("Your Matrix is displayed! ");
        //output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(num[i][j]+ " ");
            }
            System.out.println();
        }

    } 
}