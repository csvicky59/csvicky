 import java.util.*;

 public class commonPrefix {


   public static void main(String[] args) 
   {
	   Scanner sc=new Scanner(System.in);
	   int num=sc.nextInt();
       String ss[]=new String[num];
       for(int i=0;i<ss.length;i++){
    	   ss[i]=sc.next();
       }
     String ans=longestCommonPrefix(ss);
     System.out.println(ans);
   }
   public static String longestCommonPrefix(String[] s) {
	    if (s.length == 0) {
	        return "";   
	    }

	    for (int Len = 0; Len < s[0].length(); Len++) {
	    	char c = s[0].charAt(Len);
	        for (int i = 1; i < s.length; i++) {
	            if ( Len >= s[i].length() ||
	                 s[i].charAt(Len) != c ) {
	              
	                return s[i].substring(0,Len);
	            }
	        }
	    }
	    return s[0];
	}
 }