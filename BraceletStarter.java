class BraceletStarter
{
	public static void main(String[] fashion)
	{
		System.out.println("The starting of BraceletStarter main");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		Bracelet bracelet=new Bracelet();
		System.out.println("The length of the bracelet is :"+bracelet.length);
		System.out.println("The no. of beats used :"+bracelet.noOfBeats);
		System.out.println("The type of the bracelet is  :"+bracelet.type);
		System.out.println("The price of bracelet is :"+bracelet.price);
		System.out.println("The size of bracelet is :"+bracelet.size);
		
		
		System.out.println("_____________________________________________");
		
		Bracelet bracelet1=new Bracelet(10.5);
		System.out.println("The length of the bracelet is :"+bracelet1.length);
		System.out.println("The no. of beats used :"+bracelet1.noOfBeats);
		System.out.println("The type of the bracelet is  :"+bracelet1.type);
		System.out.println("The price of bracelet is :"+bracelet1.price);
		System.out.println("The size of bracelet is :"+bracelet1.size);
		
		
		System.out.println("_____________________________________________");
		
		Bracelet bracelet2=new Bracelet(15.75,40);
		System.out.println("The length of the bracelet is :"+bracelet2.length);
		System.out.println("The no. of beats used :"+bracelet2.noOfBeats);
		System.out.println("The type of the bracelet is  :"+bracelet2.type);
		System.out.println("The price of bracelet is :"+bracelet2.price);
		System.out.println("The size of bracelet is :"+bracelet2.size);
		
		
		System.out.println("_____________________________________________");
		
		Bracelet bracelet3=new Bracelet(16.25,35,"silver");
		System.out.println("The length of the bracelet is :"+bracelet3.length);
		System.out.println("The no. of beats used :"+bracelet3.noOfBeats);
		System.out.println("The type of the bracelet is  :"+bracelet3.type);
		System.out.println("The price of bracelet is :"+bracelet3.price);
		System.out.println("The size of bracelet is :"+bracelet3.size);
		
		
		System.out.println("_____________________________________________");
		
		Bracelet bracelet4=new Bracelet(10.50,60,"gold",12000);
		System.out.println("The length of the bracelet is :"+bracelet4.length);
		System.out.println("The no. of beats used :"+bracelet4.noOfBeats);
		System.out.println("The type of the bracelet is  :"+bracelet4.type);
		System.out.println("The price of bracelet is :"+bracelet4.price);
		System.out.println("The size of bracelet is :"+bracelet4.size);
		
		
		System.out.println("_____________________________________________");
		
		Bracelet bracelet5=new Bracelet(14.50,50,"slim",700,'S');
		System.out.println("The length of the bracelet is :"+bracelet5.length);
		System.out.println("The no. of beats used :"+bracelet5.noOfBeats);
		System.out.println("The type of the bracelet is  :"+bracelet5.type);
		System.out.println("The price of bracelet is :"+bracelet5.price);
		System.out.println("The size of bracelet is :"+bracelet5.size);
		
		
		System.out.println("_____________________________________________");
	}
}
		
		
		
		
		
		