import java.util.*;
class even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if (n%2==0){
            System.out.println("It is an even no!");
        }
        else{
            System.out.println("It is an odd no!");
        }
    }
}