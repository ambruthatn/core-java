class Clock
{
	String type;
	String company;
	int noOfPointers;
	String shape;
	
	Clock()
	{
		this("Round","Digital");
		System.out.println("The clock has some features");
	}
	Clock(String type)
	{
		this.type=type;
		System.out.println("The tpe of the clock is :"+type);
	}
	Clock(String company,String type)
	{
		this.company=company;
		this.type=type;
		System.out.println("The clock company   is:"+company);
		System.out.println("The clock type is:"+type);
	}
	Clock(int noOfPointers)
	{
		this.noOfPointers=noOfPointers;
		System.out.println("The clock has pointers :"+noOfPointers);
	}
	Clock(String shape,int noOfPointers)
	{
		this.shape=shape;
		this.type=type;
		System.out.println("the clocks shape and type  is :"+shape);
		System.out.println("the clocks has :"+noOfPointers);
	
	}
}