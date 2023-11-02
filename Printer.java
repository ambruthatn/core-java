class Printer
{
    String brand;
	double price;
	String type="ink jet";
	int noOfPages;
	String model;
	
	Printer()
	{
		this("HP",48000);
		System.out.println("The Printer has some features");
	}
	Printer(String brand)
	{
		this.brand=brand;
		System.out.println("The brand  is :"+brand);
	}
	Printer(String brand,double price)
	{
		this.brand=brand;
		this.price=price;
		System.out.println("The brand of printer is:"+brand);
		System.out.println("The price is:"+price);
	}
	Printer(String brand,double price,String type)
	{
		this.brand=brand;
		this.price=price;
		this.type=type;
		System.out.println("The brand  is :"+brand);
		System.out.println("The price is:"+price);
		System.out.println("The type of the printer is  :"+type);
		
		
	}
	Printer(String brand,double price,String type,int noOfPages)
	{
		this(brand,price,type);
		this.noOfPages=noOfPages;
		System.out.println("The brand  is :"+brand);
		System.out.println("The price is:"+price);
		System.out.println("The type of the printer is  :"+type);
		System.out.println("The printing capacity is  :"+noOfPages);
	
	}
	
	Printer(String brand,double price,String type,int noOfPages,String model)
	{
		this(brand,price,type,noOfPages);
		this.model=model;
		System.out.println("The brand  is :"+brand);
		System.out.println("The price is:"+price);
		System.out.println("The type of the printer is  :"+type);
		System.out.println("The printing capacity is  :"+noOfPages);
	    System.out.println("The model  is :"+model);
	}
}
