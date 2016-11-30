 import java.util.*;
 class oneOccourence {
	 public static void main(String args[] ){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
    	   arr[i]=sc.nextInt();
       }
       Arrays.sort(arr);
      for(int i=0;i<arr.length;i++){
       int k=arr[i];
       int fo=firstOccourence(arr,k);
       int lo=lastOccourence(arr,k);
       if(fo==lo){
    	   System.out.println(arr[fo]);
       }
      }
      
	 }
	 public static int firstOccourence(int[] arr,int key){
		 int low=0;
		 int high=arr.length-1;
		 while(low<=high){
			 int mid=(low+high)/2;
			 if(key==arr[mid] &&(mid==0 || arr[mid-1]!=key)){
				 return mid;
			 }
			 else if(key<=arr[mid]){
				 high=mid-1;
			 }
			 else{
				 low=mid+1;
			 }
		 }
		 return -1;
	 }
	 public static int lastOccourence(int[] arr,int key){
		 int low=0;
		 int high=arr.length-1;
		int size=high;
		 while(low<=high){
			 int mid=(low+high)/2;
			 if(key==arr[mid] &&(mid==size || arr[mid+1]!=key) ){
				 return mid;
			 }
			 else if(key>=arr[mid]){
				 low=mid+1;
			 }
			 else{
				 high=mid-1;
			 }
		 }
		 return -1;
	 }
 }