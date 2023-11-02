class RocketStarter
{
	public static void main(String[] space)
	{
		System.out.println("The starting of rocketStarter main");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		Rocket rocket=new Rocket();
		System.out.println("The no. of space jackets is  :"+rocket.noOfSpaceJackets);
		System.out.println("The rocket length is:"+rocket.length);
		System.out.println("The rocket has sound:"+rocket.sound);
		System.out.println("The name of researchCenter is:"+rocket.researchCenter);
		
		System.out.println("_____________________________________________");
		
		Rocket rocket1=new Rocket(12);
		System.out.println("The no. of space jackets is  :"+rocket1.noOfSpaceJackets);
		System.out.println("The rocket length is:"+rocket1.length);
		System.out.println("The rocket has sound:"+rocket1.sound);
		System.out.println("The name of researchCenter is:"+rocket1.researchCenter);
		
		System.out.println("_____________________________________________");
		
		Rocket rocket2=new Rocket(78.90,"ISRO");
		System.out.println("The no. of space jackets is  :"+rocket2.noOfSpaceJackets);
		System.out.println("The rocket length is:"+rocket2.length);
		System.out.println("The rocket has sound:"+rocket2.sound);
		System.out.println("The name of researchCenter is:"+rocket2.researchCenter);
		
		System.out.println("_____________________________________________");
		
		Rocket rocket3=new Rocket(false);
		System.out.println("The no. of space jackets is  :"+rocket3.noOfSpaceJackets);
		System.out.println("The rocket length is:"+rocket3.length);
		System.out.println("The rocket has sound:"+rocket3.sound);
		System.out.println("The name of researchCenter is:"+rocket3.researchCenter);
		
		System.out.println("_____________________________________________");
		
		Rocket rocket4=new Rocket(80.78,10);
		System.out.println("The no. of space jackets is  :"+rocket4.noOfSpaceJackets);
		System.out.println("The rocket length is:"+rocket4.length);
		System.out.println("The rocket has sound:"+rocket4.sound);
		System.out.println("The name of researchCenter is:"+rocket4.researchCenter);
		
		System.out.println("_____________________________________________");
		
	}
	
}