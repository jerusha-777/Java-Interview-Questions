
public class arravg{
	public static void main(String[] args) {
	    int sum=0;
	    int x=0;
	    int arr[] = {1,2,3,4,6,5};
	    for(int i=0; i < arr.length; i++){
	        System.out.println(arr[i]);
	        
	    }
	    for(int i=0;i<arr.length; i++){
	        sum=sum+arr[i];
	        
	    }
	    x=sum/arr.length;
	    System.out.print("Average of the above numbers is: " + " "+x);
	    
	    
	    
		
	}
}
