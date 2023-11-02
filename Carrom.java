class Carrom

{
    double boardLength;
	int price=1500;
	String brand;
	int noOfCoins;
	int noOfColors;
	
	
	Carrom()
	{
		this(50.50);
		System.out.println("The carrom board has some features");
	}
	Carrom(double boardLength)
	{
		this.boardLength=boardLength;
		System.out.println("The length of the board is :"+boardLength);
	}
	Carrom(double boardLength,int price)
	{
		this.boardLength=boardLength;
		this.brand=brand;
		System.out.println("The length of the board is :"+boardLength);
		System.out.println("The price is :"+price);
	}
	Carrom(double boardLength,int price,String brand)
	{
		this.boardLength=boardLength;
		this.price=price;
		this.brand=brand;
		System.out.println("The length of the board is :"+boardLength);
		System.out.println("The price is :"+price);
		System.out.println("The brand of carrom is  :"+brand);
		
	}
	Carrom(double boardLength,int price,String brand,int noOfCoins)
	{
		this(boardLength,price,brand);
		this.noOfCoins=noOfCoins;
		System.out.println("The length of the board is :"+boardLength);
		System.out.println("The price is :"+price);
		System.out.println("The brand of carrom is  :"+brand);
		System.out.println("The NO. of coins in carrom is  :"+noOfCoins);
		
		
	}
	
	Carrom(double boardLength,int price,String brand,int noOfCoins,int noOfColors)
	{
		this(boardLength,price,brand,noOfCoins);
		this.noOfColors=noOfColors;
		System.out.println("The length of the board is :"+boardLength);
		System.out.println("The price is :"+price);
		System.out.println("The brand of carrom is  :"+brand);
		System.out.println("The NO. of coins in carrom is  :"+noOfCoins);
		System.out.println("The NO. of colors in carrom is  :"+noOfColors);
		
	}
}
