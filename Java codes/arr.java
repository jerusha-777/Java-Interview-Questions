import java.util.*;
class arr{
    public static void main(String [] args){
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("length of marks");
        int size = sc.nextInt();
        System.out.println("Enter the marks");
        int marks[] = new int[size];

        //input
        for(i=0; i<size; i++){
            marks[i] = sc.nextInt();
        }
        System.out.println(""); //space between i/p  and o/p

        //output
        for(i=0;i<size;i++){
            System.out.println(marks[i]);
        }



    }
}