import java.util.*;

class fact{
    public static void main(String[] args)
    {
       int num, fact=1, i;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a Number:");
       num = sc.nextInt();
       
       //logic
       for(i=1; i<=num; i++)
       {
           fact = fact * i;
       }
       
       System.out.println("Factorial of number: "+fact);
    }
}
