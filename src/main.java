import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		

        Scanner sc=new Scanner(System.in);

      
        menu.printLogo();
        
        //: While-loop that keeps the progrm running forever.
        while(true) {
        	
            //: Dispalys the menu
            System.out.print(""+
    				" ------------------------------------ "	+ "\n" +
    				" |              Menu                | " + "\n" +
    				" ------------------------------------ "	+ "\n" +
    				" | Press 1 to register an emplyee   | " + "\n" +
    				" |--------------------------------- | "	+ "\n" +
    				" | Press 2 to print all countrys    | " + "\n" +
    				" |--------------------------------- | "	+ "\n" +
    				" | Press 3 to a specified country   | " + "\n" +
    				" |--------------------------------- | "	+ "\n" +
    				" | Press 4 to add money to country  | " + "\n" +
    				" |--------------------------------- | "	+ "\n" +
    				" | Press 5 to pay a country’s debt  | " + "\n" +
    				" |--------------------------------- | "	+ "\n" +
    				" | Press 6 to change a country      | " + "\n" +
    				" |--------------------------------- | "	+ "\n" +
    				" | Press 7 to quit the program      | " + "\n" +
    				" ------------------------------------ " + "\n" +
    				" Input a number : ");


            //: Gets the user input, with some fail safes
            Scanner menuScanner = new Scanner(System.in);
			char input = 'a';
			try {
				input = menuScanner.nextLine().charAt(0);
			}catch(Exception e) {}
		
		
        }
	}

	public static void print(Object o) {
	    System.out.print(o);
	   
	}
	
	public static void cls() {
		   for(int i = 0;  i < 100; i++) {
			   print("\n");
		   }  
		}
	
}
