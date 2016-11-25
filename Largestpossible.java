import java.util.*;

class LargestPossible{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int arr[]=new int[a];
   for(int i=0;i<a;i++){
	   arr[i]=sc.nextInt();
   }
   Arrays.sort(arr);
   String s="";
   for(int i=arr.length-1;i>=0;i--){
	   String s1=Integer.toString(arr[i]);
	   s=s.concat(s1);
   }
   System.out.println(s);
}
}