class Menu {
	public static void main(String args[]) throws java.io.IOException {
		char Choice; 

		do {
			System.out.println(" Help On : "); 
			System.out.println(" 1. IF "); 
			System.out.println(" 2. SWITCH "); 
			System.out.println(" 3. WHILE "); 
			System.out.println(" 4. DO WHILE "); 
			System.out.println(" 5. FOR \n "); 
			System.out.println(" Choose One : "); 
			Choice = (char) System.in.read();
		}

		while(Choice < '1' || Choice >'5'); 
		System.out.println ("\n"); 
		switch(Choice){
			case '1':
				System.out.println (" The IF : \n"); 
				System.out.println (" if(condition) statement "); 
				System.out.println (" else statement; ");
				break; 

			case '2':
				System.out.println (" The SWITCH : \n"); 
				System.out.println (" switch(expression) { "); 
				System.out.println (" Case constant : "); 
				System.out.println (" statement sequence "); 
				System.out.println (" break; "); 
				System.out.println (" //..... "); 
				System.out.println ( " } ");
				break; 

			case '3':
				System.out.println (" The WHILE : \n "); 
				System.out.println (" while (condition) statement; "); 
				break;
 
			case '4':
				System.out.println ( " The DO-­‐WHILE : \n"); 
				System.out.println(" do { "); 
				System.out.println ("statement"); 
				System.out.println(" } while (condition);"); 
				break;

			case'5':
				System.out.println("The For :\n"); 
				System.out.println ( "for (init;condition;iteration)"); 
				System.out.println("satatement");
				break;
		}

	}
}	