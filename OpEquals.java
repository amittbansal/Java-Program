class OpEquals {
	public static void main(String args[]) {
		int a=1,b=2,c=3; 
		a+=5;
		b*=4;
		c+=a*b; 
		c%=b;
		
		System.out.println(" A = " +a); 
		System.out.println(" B = " +b); 
		System.out.println(" C = " +c); 
	}
}	