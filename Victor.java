package victor_main;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Victor {

	
	  public static void main(String[] args) {
	 
		  Victor obj1 = new Victor();
	 obj1.mainmenu();
	 obj1.Bra();
	
	//obj1.Panties();
	 
		  }

		public void  mainmenu() 
		{	
			JOptionPane.showMessageDialog(null, "Welcome to Victoria Secret!!","Welcome!",
					JOptionPane.INFORMATION_MESSAGE);
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter the item you want to buy");
	    System.out.println("Enter 'B' for Bra");
	    System.out.println("Enter 'P' for Panties");
	    System.out.println("Enter 'SS' for Sleeping Suit");
	    System.out.println("Enter 'C' for Cosmetics");  	 

	    String userName = myObj.nextLine();  // Read user input
	    System.out.println("The Item you enter is : " +userName);  // Output user input 
	    
	    System.out.println("Enter your size");
	    String bsize =myObj.nextLine();
	    System.out.println("Your size is you enter is : " +bsize); 
	    System.out.println("Press enter to continue");
	    
	    		 
	}
	public void Bra() {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		String braitem = myObj.nextLine();
		//System.out.println("Enter your size");
	  System.out.println("Choose your bra style:");
	    System.out.println("Enter 'd' for Demi");
	    System.out.println("Enter 'v' for Very Very Sexy");
	    System.out.println("Enter 'sp' for Sports");
	    //String bstyle = myObj.nextLine();
	     String bstyle1 = myObj.nextLine();
	    System.out.println("Your Bra Style is :" +bstyle1);
	}
	
	public void Panties () {
		Scanner myObjp = new Scanner (System.in);
		System.out.println("Choose your panty style");
	    System.out.println("Enter 'LF' for Lace Front");
	    System.out.println("Enter 'LC' for Lace Cotton");
	    System.out.println("Enter 'LS' for Lace String");
	    String braitem = myObjp.nextLine();
	    System.out.println(braitem);
				
		
	}}
			
	

