class Free
{
	String what;
	String why;
	int freeForAll;
	
	Free()
	{
		System.out.println("invoking the free const...");
		
	}
	Free(String what,String why,int freeForAll)
	{
		this.what=what;
		this.why=why;
		this.freeForAll=freeForAll;
		System.out.println("Created Free with String,String,int Constructor");
	}
	void displayInfo(){
		
		System.out.println("Starting displayInfo");
		System.out.println(this.what=what);
		System.out.println(this.why=why);
		System.out.println(this.freeForAll=freeForAll);
		
		
		System.out.println("Ending displayInfo");
		
	}
}