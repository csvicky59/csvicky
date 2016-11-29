 import java.util.*;
 class checkString {
	 static char chararr[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	static  LinkedList<String> list= new LinkedList<String>();
	 public static void main(String args[] ){
		 Scanner sc=new Scanner(System.in);
		 try{
		 int num=sc.nextInt();
		 String stab="";int no=1;
		   String s=Integer.toString(num);
		   int arr[]=new int[s.length()];
		   for(int i=0;i<s.length();i++){
			   int a=s.charAt(i)-'0';
			   arr[i]=a;
		   }
        String stable =createfirst(arr,stab);
       list.add(stable);
       String temp;
       for(int i=0;i<=arr.length-2;i++){
    	      temp=stable;
    	   String a=Integer.toString(arr[i]);
    	   String b=Integer.toString(arr[i+1]);
    	   String c=a.concat(b);
    	   int d=Integer.parseInt(c);
    	   if(d<=26 && d>=10){
    		   no++;
    		   addanotherString(i,temp,d,arr,stable);
    	   }
       }
       String ss="";
       lastCheck(ss,arr);
       System.out.println(list.size());
	 }
  catch(Exception e){
	  System.out.println("Wrong input Enter input without zero");
  }
       }
	 public static String createfirst(int arr[],String stable){
		  for(int i=0;i<arr.length;i++){
			   int place=arr[i];
			   if(place!=0){
			   char c=chararr[place-1];
			   stable=stable+c;
		   }
		   }
		  return stable;
	 }
	 public static void addanotherString(int i,String temp,int d,int[] arr,String stable){
			
		 int plc=d;
		 char cc=chararr[plc-1];
		 //temp=temp.replace(temp.charAt(i),cc);
		 String tmp2=temp.substring(0,i)+cc;
		 i=i+2;
		 for(int j=i;j<arr.length;j++){
			 int place=arr[j];
			 String c=Character.toString(chararr[place-1]);
			 tmp2=tmp2.concat(c);
		 }
	 if(tmp2!=stable){
		 list.add(tmp2);
	 }
 }
	 
	 public static void lastCheck(String ss,int[] arr){
		 for(int i=0;i<arr.length;i++){  
			   if(i<arr.length-1){
				   String a=Integer.toString(arr[i]);
				   String b=Integer.toString(arr[i+1]);
				   String ccc=a.concat(b);
				   int d=Integer.parseInt(ccc);
				   if(d<=26 && d>=10){
					   String sx=Character.toString(chararr[d-1]);
					   ss=ss+sx;
					   i=i+1;
				   }
				   else{
					   int pl=arr[i];
					   String sx=Character.toString(chararr[pl-1]);
					   ss=ss+sx;
				   }
			   }
			   else{
				   int pl=arr[i];
				   String sx=Character.toString(chararr[pl-1]);
				   ss=ss+sx;
			   }
		   }
		 String sarr[]=list.toArray(new String[list.size()]);
		 boolean last=true;
		 for(int i=0;i<sarr.length;i++){
			 if(sarr[i]==ss){
				 last=false;
				 break;
			 }
		 }
		 if(last){
			 list.add(ss);
		 }
	 }
}
