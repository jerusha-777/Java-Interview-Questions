import java .util.*;

class whole{
    public static void main(String[] args)
    {
      int i, n ;    
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter end number to print series of whole numbers: ");
      n = sc.nextInt();
      for(i=0; i<=n; i++)
      {
         System.out.println(i);
      }
    }
}