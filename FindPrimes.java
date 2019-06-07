class FindPrimes{
	public static void main(String args[]){
		int num;
		boolean isprime = true;
		num=7;
		for(int i=2;i<=num/2;i++){
			if ((num%i)==0){
				isprime=false;
				break;
			}
		}		
		if(isprime) 
			System.out.println("Prime"); 
		else
			System.out.println("Not Prime"); 
  	}
}
