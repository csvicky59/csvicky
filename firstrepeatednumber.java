import java.util.*;
 class firstrepeatednumber {
	 public static void main(String args[] ){
		 Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	    	arr[i]=sc.nextInt();
	   }
	    int min=Integer.MAX_VALUE;
	    for(int i=0;i<n;i++){
	    	int  num=arr[i];
	    	for(int j=i+1;j<n;j++){
	    		if(num==arr[j]){
	    			if(min>j){
	    				min=j;
	    			}
	    		}
	    	}
	    }
	    System.out.println(arr[min]);
	 }
 }