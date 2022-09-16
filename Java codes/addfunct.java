import java.util.*;
public class addfunct {
    public static int addMyNos(int a , int b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("The addition of two numbers is :" + addMyNos(a, b));

    }
    

    
}
