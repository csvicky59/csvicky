import java.util.*;
class uniqueNumber{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
   int arr[]=new int[a];
   for(int i=0;i<a;i++){
	   arr[i]=sc.nextInt();
   }
   Arrays.sort(arr);
   for(int i=0;i<arr.length;i++){
	   int key=arr[i];
	   int fo=firstoccourence(key,arr);
	   int lo=lastoccourence(key,arr);
	   if(fo!=-1 && lo!=-1){
	   int occ=(lo-fo)+1;
	   if(occ>=2){
		   i=lo;
	   }
	   else{
		   System.out.println(arr[fo]);
	   }
	   }
   } 
}
static int firstoccourence(int key,int[] values){
	int low = 0;
	int high = values.length -1 ;

	while(low <= high){
		int mid = (low+high) / 2;
		if(key == values[mid] && (mid == 0 || key != values[mid-1]))
			return mid;
		else if(key <= values[mid])
			high = mid - 1;
		else
			low = mid + 1;	
	}
	return -1;
}
static int lastoccourence(int key, int[] values){
	int low = 0;
	int high = values.length -1 ;
	int arrayLength = high; 

	while(low <= high){
		int mid = (low+high) / 2;			
		if(key == values[mid] && (mid == arrayLength || key != values[mid+1]))
			return mid;
		else if(key >= values[mid])
			low = mid + 1;
		else
			high = mid - 1;		
	}
	return -1;
}
}