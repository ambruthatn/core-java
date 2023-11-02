class CarromStarter
{
	public static void main(String[] game)
	{
		System.out.println("The starting of CarromStarter main");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		Carrom carrom=new Carrom();
		System.out.println("The length of the board is :"+carrom.boardLength);
		System.out.println("The price is  :"+carrom.price);
		System.out.println("The brand of carrom is :"+carrom.brand);
		System.out.println("The NO. of coins in carrom is :"+carrom.noOfCoins);
		System.out.println("The NO. of colors in carrom is:"+carrom.noOfColors);
		
		
		System.out.println("_____________________________________________");
		
		Carrom carrom1=new Carrom(48.25);
		System.out.println("The length of the board is :"+carrom1.boardLength);
		System.out.println("The price is  :"+carrom1.price);
		System.out.println("The brand of carrom is :"+carrom1.brand);
		System.out.println("The NO. of coins in carrom is :"+carrom1.noOfCoins);
		System.out.println("The NO. of colors in carrom is:"+carrom1.noOfColors);
		
		
		System.out.println("_____________________________________________");
		Carrom carrom2=new Carrom(50.50,999);
		System.out.println("The length of the board is :"+carrom2.boardLength);
		System.out.println("The price is  :"+carrom2.price);
		System.out.println("The brand of carrom is :"+carrom2.brand);
		System.out.println("The NO. of coins in carrom is :"+carrom2.noOfCoins);
		System.out.println("The NO. of colors in carrom is:"+carrom2.noOfColors);
		
		
		System.out.println("_____________________________________________");
		
		Carrom carrom3=new Carrom(47.25,700,"Sonata");
		System.out.println("The length of the board is :"+carrom3.boardLength);
		System.out.println("The price is  :"+carrom3.price);
		System.out.println("The brand of carrom is :"+carrom3.brand);
		System.out.println("The NO. of coins in carrom is :"+carrom3.noOfCoins);
		System.out.println("The NO. of colors in carrom is:"+carrom3.noOfColors);
		
		
		System.out.println("_____________________________________________");
		
		Carrom carrom4=new Carrom(50.45,888,"Temper",19);
		System.out.println("The length of the board is :"+carrom4.boardLength);
		System.out.println("The price is  :"+carrom4.price);
		System.out.println("The brand of carrom is :"+carrom4.brand);
		System.out.println("The NO. of coins in carrom is :"+carrom4.noOfCoins);
		System.out.println("The NO. of colors in carrom is:"+carrom4.noOfColors);
		
		
		System.out.println("_____________________________________________");
		
		Carrom carrom5=new Carrom(42.75,500,"GS",19,3);
		System.out.println("The length of the board is :"+carrom5.boardLength);
		System.out.println("The price is  :"+carrom5.price);
		System.out.println("The brand of carrom is :"+carrom5.brand);
		System.out.println("The NO. of coins in carrom is :"+carrom5.noOfCoins);
		System.out.println("The NO. of colors in carrom is:"+carrom5.noOfColors);
		
		
		System.out.println("_____________________________________________");
	}
}
		
		
		
		