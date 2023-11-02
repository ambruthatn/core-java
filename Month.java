class Month
{
	String name;
	int noOfDays;
	int noOfWeekEnds;
	int noOfHolidays;
	
	Month()
	{
		System.out.println("invoking the Month const...");
		
	}
	Month(String name,int noOfDays,int noOfWeekEnds,int noOfHolidays)
	{
		this.name=name;
		this.noOfDays=noOfDays;
		this.noOfWeekEnds=noOfWeekEnds;
		this.noOfHolidays=noOfHolidays;
		System.out.println("Created Month with String,int,int Constructor");
	}
	void displayInfo(){
		
		System.out.println("Starting displayInfo");
		System.out.println(this.name=name);
		System.out.println(this.noOfDays=noOfDays);
		System.out.println(this.noOfWeekEnds=noOfWeekEnds);
		System.out.println(this.noOfHolidays=noOfHolidays);
		
		System.out.println("Ending displayInfo");
		
	}
}