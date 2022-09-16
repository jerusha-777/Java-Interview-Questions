import java.util.*;
 class calci {
    public static void main(String[] args){
        int num1, num2, choice;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number 1: ");
        num1 = sc.nextInt();
        System.out.println("Enter a number 2: ");
        num2 = sc.nextInt();
        System.out.println("Enter the operator you want to use: (1=Add, 2=Sub, 3=Mul, 4=Div)");
        choice = sc.nextInt();

        switch(choice){
            case 1: {
                System.out.println("Sum of numbers is:" + (num1+num2));
                break;
            }
            case 2: {
                System.out.println("Subtraction of numbers is:" + (num1-num2));
                break;
            }
            case 3: {
                System.out.println("Multiplication of numbers is:" + (num1*num2));
                break;
            } 
            case 4: {
                System.out.println("Division of numbers is:" + (num1/num2));
                break;
            }
            default:{
                System.out.println("invalid choice");
            }
            }
        }
    

    }
    
