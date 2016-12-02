import java.util.*;
public class zohoTwoD{
    public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
        char[][] arr=new char[5][5];
        String s="WELCOMETOZOHOCORPORATION";
        int num=0;
        for(int i=0;i<arr.length;i++){
        	for(int j=0;j<arr[i].length;j++){
        		if(num<s.length()){
        		arr[i][j]=s.charAt(num);
        		num++;
        		}
        		else{
        			arr[i][j]=' ';
        		}
        	}
        }
        for(int i=0;i<arr.length;i++){
        	for(int j=0;j<arr[i].length;j++){
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }
        for(int i=0;i<5;i++){
        	for(int j=0;j<arr[i].length-3;j++){
        		if(arr[i][j]=='T' && arr[i][j+1]=='O' & arr[i][j+2]=='O'){
        			System.out.println("start index "+i+" "+j);
        			System.out.println("End index "+i+" "+(j+2));
        		}
        	}
        }
        for(int i=0;i<arr.length-3;i++){
        	for(int j=0;j<arr[i].length;j++){
        		if(arr[i][j]=='T' && arr[i+1][j]=='O' & arr[i+2][j]=='O'){
        			System.out.println("start index "+i+" "+j);
        			System.out.println("End index "+(i+2)+" "+j);
        		}
        	}
        }
        
    }
}