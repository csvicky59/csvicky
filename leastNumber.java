 import java.util.*;

 public class leastNumber {

   public static void main(String[] args) 
   {
	   Scanner sc=new Scanner(System.in);
	   int num=sc.nextInt();
	   int k=sc.nextInt();
	   String ss=Integer.toString(num);
       int m=ss.length()-k; 
	   int arr[]=new int[ss.length()];
	   for(int i=0;i<ss.length();i++){
		   arr[i]=ss.charAt(i) -'0';
	   }
	   Arrays.sort(arr);
	   String ans="";
	  for(int i=0;i<m;i++){
		  String a=Integer.toString(arr[i]);
		   ans=ans+a;
	  }
	  System.out.println(ans);
   }
 }