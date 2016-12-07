 import javax.swing.JOptionPane;

 public class projectADD {

   public static void main(String[] args) 
   {
	   String fn=JOptionPane.showInputDialog("Enter the number to add");
	   String sn=JOptionPane.showInputDialog("Enter the second number to add");
       
	   int num1=Integer.parseInt(fn);
	   int num2=Integer.parseInt(sn);
	   int add=num1+num2;
	   JOptionPane.showMessageDialog(null,"The addition is"+add,"Guvi",JOptionPane.PLAIN_MESSAGE);
   }
 }