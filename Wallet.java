class Wallet
{
    String brand;
	double price;
	char size;
	int noOfCompartments=8;
	
	Wallet()
	{
		this('M');
		System.out.println("The wallet has some features");
	}
	Wallet(char size)
	{
		this.size=size;
		System.out.println("The size is :"+size);
	}
	Wallet(char size,String brand)
	{
		this.size=size;
		this.brand=brand;
		System.out.println("The size of wallet is:"+size);
		System.out.println("The name of the brand is:"+brand);
	}
	Wallet(int noOfCompartments,char size)
	{
		this.noOfCompartments=noOfCompartments;
		this.size=size;
		System.out.println("The no. of compartments in wallet :"+noOfCompartments);
		System.out.println("The size of wallet is:"+size);
	}
	Wallet(double price,String brand)
	{
		this.price=price;
		this.size=size;
		System.out.println("the price is :"+price);
		System.out.println("the brand is :"+brand);
	
	}
}
