import java.util.*;

class repeat{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
   int arr[]=new int[a];
   for(int i=0;i<a;i++){
	   arr[i]=sc.nextInt();
   }
   Arrays.sort(arr);
   int key=sc.nextInt();
   int ans=binarysearch(key,arr); 
   //System.out.println("ans "+ans);
   int fo=firstoccourence(key,arr);
   //System.out.println("fo "+fo);
   int lo=lastoccourence(key,arr);
   //System.out.println("lo "+lo); 
   int occ=lo-fo+1;
   System.out.println(occ);
}
static int binarysearch(int key,int[] values){
	int low = 0;
	int high = values.length -1;

	while(low <= high){
		int middle = (low + high) / 2;

		if(key > values[middle])
			low = middle+1;
		else if(key < values[middle])
			high = middle-1;
		else 
			return middle;

	}	
	return -1;
}
static int firstoccourence(int key,int[] values){
	int low=0;
	int high=values.length-1;
	while(low<=high){
		int mid=(low+high)/2;
		if(key==values[mid] && ( mid==0 || (values[mid]-1!=key)))
			return mid;
		
		else if(values[mid]<key)
			low=mid+1;
		
		else if(values[mid]>key)
			high=mid-1;
		
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
