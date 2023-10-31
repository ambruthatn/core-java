class ClockStarter
{
	public static void main(String[] timeings)
	{
		System.out.println("The starting of clock main");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		Clock clock=new Clock();
		System.out.println("The type of the clock is :"+clock.type);
		System.out.println("The company of the clock is :"+clock.company);
		System.out.println("The clock has pointers :"+clock.type);
		System.out.println("The Shape of the clock is :"+clock.shape);
		
		System.out.println("_____________________________________________");
		
		Clock clock1=new Clock("Analog");
		System.out.println("The type of the clock is :"+clock1.type);
		System.out.println("The company of the clock is :"+clock1.company);
		System.out.println("The clock has pointers :"+clock1.type);
		System.out.println("The Shape of the clock is :"+clock1.shape);
		
		System.out.println("_____________________________________________");
		
		Clock clock2=new Clock("Leo","Digital");
		System.out.println("The type of the clock is :"+clock2.type);
		System.out.println("The company of the clock is :"+clock2.company);
		System.out.println("The clock has pointers :"+clock2.type);
		System.out.println("The Shape of the clock is :"+clock2.shape);
		
		System.out.println("_____________________________________________");
		
		Clock clock3=new Clock(3);
		System.out.println("The type of the clock is :"+clock3.type);
		System.out.println("The company of the clock is :"+clock3.company);
		System.out.println("The clock has pointers :"+clock3.type);
		System.out.println("The Shape of the clock is :"+clock3.shape);
		
		System.out.println("_____________________________________________");
		
		Clock clock4=new Clock("Hexagon",2);
		System.out.println("The type of the clock is :"+clock4.type);
		System.out.println("The company of the clock is :"+clock4.company);
		System.out.println("The clock has pointers :"+clock4.type);
		System.out.println("The Shape of the clock is :"+clock4.shape);
		
		System.out.println("_____________________________________________");
		
		
		
		
	}
	
}