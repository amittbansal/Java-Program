class SampleSwitch {
	public static void main(String args[]) {
		for (int i=0;i<6;i++) 
			switch(i)
			{
				case 0:
					System.out.println( "I is ZERO"); 
					break;

				case 1:
					System.out.println( "I is ONE"); 
					break;

				case 2:
					System.out.println( "I is TWO"); 
					break;

				case 3:
					System.out.println( "I is THREE"); 
					break;

				case 4:
					System.out.println( "I is greater then three"); 
					break;

				case 5:
					System.out.println( "I is greater than three"); 
					break;

				default:
					System.out.println( " Overflow" ); 
	}
}	