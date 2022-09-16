import java .util.*;

class fibo{
    public static void main(String[] args)
    {
       int f1=0, f2=1, f3, i;
       System.out.print(f1+" "+f2);
       
       //logic
       for(i=2; i<=7; i++)
       {
           f3= f1+f2;
           System.out.print(" "+f3);
           f1 = f2;
           f2 = f3;
           
       }
    }
}
