import java.util.*;;
public class palindrome {
    public static void main(String[] args){
        int n=593,temp=0, rem, sum=0;
        temp=n;
        while(n>0){
            rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;

        }

        if(temp==sum){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
    


}
