import java.util.*;

class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1:\t");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2:\t");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("sum : "+sum);
        int sub = num1 - num2;
        System.out.println("Sub : " +sub);
        
    }
}