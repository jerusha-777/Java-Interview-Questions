import java.util.*;
class prime {
    public static void main(String [] args){
        int num, i, stor=0, flag=0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = sc.nextInt();
        
        stor = num/2;
        if(num==0 || num == 1){
            System.out.println("non prime");
        }
        else{
            for(i=2; i<=stor; i++){
                if(num%i==0){
                System.out.println("Non-prime");
                flag=1;
                break;
                }
            }
            if(flag == 0){
                System.out.print("Prime number");
            }
    
        } 

       
    }
}




