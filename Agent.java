class Agent
{
	int id=59;
	String name="flipflop";
	String companyName="Flipkart";
	
	void openTent (Tent tent)
	{
		System.out.println("Starting OpenTent in Agent");
		System.out.println(tent.open());
		System.out.println(tent.slNo);
		System.out.println(tent.color);
		System.out.println(tent.width);
		System.out.println(tent.height);
		
		System.out.println("Ending openTent in Agent");
	}
	void closeTent (Tent tent)
	{
		System.out.println("Starting closeTent in Agent");
		System.out.println(tent.close());
		System.out.println(tent.slNo);
		System.out.println(tent.color);
		System.out.println(tent.width);
		System.out.println(tent.height);
		
		System.out.println("Ending closeTent in Agent");
	}
	
	void showInfo()
	{
		System.out.println("Starting showInfo in Agent");
		System.out.println("Agent id :"+id);
		System.out.println("Agent name :"+name);
		System.out.println("Agent companyName :"+companyName);
		System.out.println("Ending showInfo in Agent");
	}
}