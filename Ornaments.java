class Ornaments
{
    String brand="botai";
	double price;
	String type;
	char size;
	
	Ornaments()
	{
		this("Blue Star");
		System.out.println("The ornaments has some features");
	}
	Ornaments(String brand)
	{
		this.brand=brand;
		System.out.println("The brand  is :"+size);
	}
	Ornaments(char size,double price)
	{
		this.size=size;
		this.price=price;
		System.out.println("The size of ornaments is:"+size);
		System.out.println("The price is:"+price);
	}
	Ornaments(String type,char size,double price)
	{
		this.type=type;
		this.size=size;
		this.price=price;
		System.out.println("The type of the ornaments is  :"+type);
		System.out.println("The size of wallet is:"+size);
		System.out.println("The price is:"+price);
	}
	Ornaments(String type,String brand)
	{
		this.price=price;
		this.size=size;
		System.out.println("The type of the ornaments is :"+type);
		System.out.println("the brand is :"+brand);
	
	}
}