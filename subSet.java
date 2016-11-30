 import java.util.*;

 public class subSet {

   public static void main(String[] args) 
   {
	   Scanner sc=new Scanner(System.in);
	   Set set = new HashSet();
	   Set set2 = new HashSet();	 
	   int n=sc.nextInt();
	   int a1[]=new int[n];
	   for(int i=0;i<n;i++){
		   a1[i]=sc.nextInt();
		   set.add(a1[i]);
	   }
	   int n1=sc.nextInt();
	   int a2[]=new int[n1];
	   for(int i=0;i<n1;i++){
		   a2[i]=sc.nextInt();
		   set2.add(a2[i]);
	   }
     System.out.println(set2.containsAll(set));
   }
 }