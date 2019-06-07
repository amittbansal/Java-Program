class BoolTest {
	public static void main(String args[])	{
		boolean b; 
		b=false;

		System.out.println( " B is " +b); 
		b=true;

		System.out.println( " B is Now " +b);
		if (b) 
			System.out.println(" This Is Exacuted"); 
		
		b=false;
		if (b) 
			System.out.println("This is not executed"); 

		System.out.println(" 10 > 9 is " + (10 > 9)); 
	}
}	