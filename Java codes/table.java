import java .util.*;

class table{
    public static void main(String[] args)
    {
      int num, tab, i;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number which table you want :  ");
      num = sc.nextInt();
     
      //logic
      for(i=1; i<=10; i++)
      {
          tab = num * i;
          System.out.println(num+" * "+i+" = "+tab);
      }
    }
}
