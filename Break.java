class Break{
	public static void main(String args[]){
		boolean t = true;
		first:{
			second:{
				third:{
					System.out.println("Before the break");
					if (t) 
						break second;
					System.out.println("this cann't execute");
				}
				System.out.println("This cannot be exeuted");
			}
			System.out.println("This is after second block");
		}
   	}
}
