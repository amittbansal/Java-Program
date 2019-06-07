class ISample {
	public static void main(String args[]) {
		int x,y; 
		x=10; 
		y=20;

		if (x<y)
			System.out.println("X is less than Y"); 

		x=x*2;
		
		if (x==y)
			System.out.println("X is now equal to y"); 

		x=x*2;
		
		if(x>y)
			System.out.println("X is now greater than Y"); 

		if (x==y)
			System.out.println("you won't see this"); 
	}
}	