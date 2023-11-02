class Rocket
{
	int noOfSpaceJackets;
	double length;
	boolean sound;
	String researchCenter="Nasa";
	
	Rocket()
	{
		this(7);
		System.out.println("The Rocket has some features");
	}
	Rocket(int noOfSpaceJackets)
	{
		this.noOfSpaceJackets=noOfSpaceJackets;
		System.out.println("The no. of space jackets is :"+noOfSpaceJackets);
	}
	Rocket(double length,String researchCenter)
	{
		this.length=length;
		this.researchCenter=researchCenter;
		System.out.println("The rocket length is:"+length);
		System.out.println("The name of researchCenter is:"+researchCenter);
	}
	Rocket(boolean sound)
	{
		this.sound=sound;
		System.out.println("The rocket has sound :"+sound);
	}
	Rocket(double length,int noOfSpaceJackets)
	{
		this.length=length;
		this.researchCenter=researchCenter;
		System.out.println("the length of rocket is :"+length);
		System.out.println("the no. of jackets is :"+noOfSpaceJackets);
	
	}
}
