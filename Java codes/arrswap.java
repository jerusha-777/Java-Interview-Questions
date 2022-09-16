import java.util.*;
public class arrswap {
    public static void main(String [] args)throws Exception{
        int arr1[] = {1, 2, 3};
        int brr2[] = {4, 5, 6};

        System.out.println("ARRAYS BEFORE SWAPPING:"+ Arrays.toString(arr1));
        System.out.println("ARRAYS BEFORE SWAPPING:"+ Arrays.toString(brr2));

        for(int i =0; i<arr1.length; i++){
            
            arr1[i] = arr1[i] ^ brr2[i];
            brr2[i] = arr1[i] ^ brr2[i];
            arr1[i] = arr1[i] ^ brr2[i];
        }
        System.out.println("ARRAYS AFTER SWAPPING:"+ Arrays.toString(arr1));
        System.out.println("ARRAYS AFTER SWAPPING:"+ Arrays.toString(brr2));
    }
    
}
