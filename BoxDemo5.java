class Box{
	double width;
	double height;
	double depth;

	double volume(){
		return width*height*depth;
	}

	void setdim(double w,double h,double d){
		width=w;
		height=h;
		depth=d;
	}
}

class BoxDemo5{
	public static void main(String args[]){ 
		Box mybox1 = new Box(); 
		Box mybox2 = new Box();
		double vol;

		mybox1.setdim(10,20,15);
		mybox2.setdim(5,10,15);

		vol=mybox1.volume();
		System.out.println("volume of box1 is"+vol);

		vol=mybox2.volume();
		System.out.println("volume of box2 is" +vol);
   	}
}
