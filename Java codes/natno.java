import java .util.*;

class natno{
    public static void main(String[] args)
    {
      int i, n ;    
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter end number to print series of natural numbers: ");
      n = sc.nextInt();
      System.out.println("Displaying the series of natural numbers: ");
      for(i=1; i<=n; i++)
      {
         System.out.println(i);
      }
    }
}