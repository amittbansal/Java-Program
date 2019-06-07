class Light {
	public static void main(String args[]) {
		int lightspeed; 
		long days;
		long second,distance; 
		lightspeed = 186000; 
		days=1000; 
		second=days*24*60*60; 
		distance=lightspeed*second; 
		System.out.print("IN "+days);
		
		System.out.print (" DaysLight Will Travel About "); 
		System.out.println( distance + " Miles"); 
	}
}	