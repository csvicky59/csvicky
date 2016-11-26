import java.util.*;

class uniqueIndex{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int arr[]=new int[a];
   for(int i=0;i<a;i++){
	   arr[i]=sc.nextInt();
   }
  findIndex(arr);
}
static void findIndex(int[] arr){
	for(int i=0;i<arr.length;i++){
		if(i==arr[i]){
			System.out.println(i);
		}
	}
}
}
