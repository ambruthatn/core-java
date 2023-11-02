class Helmet
{
    String brand;
	double price;
	String type="Full";
	char size;
	boolean frontGlass;
	
	Helmet()
	{
		this("Vega",2999.99);
		System.out.println("The helmet has some features");
	}
	Helmet(String brand)
	{
		this.brand=brand;
		System.out.println("The brand of helmet is :"+brand);
	}
	Helmet(String brand,double price)
	{
		this.brand=brand;
		this.price=price;
		System.out.println("The brand of helmet is:"+brand);
		System.out.println("The price of helmet is:"+price);
	}
	Helmet(String brand,double price,String type)
	{
		this.brand=brand;
		this.price=price;
		this.type=type;
		
		System.out.println("The brand of helmet is :"+brand);
		System.out.println("The price of helmet is:"+price);
		System.out.println("The type of the helmet is  :"+type);
		
		
		
	}
	Helmet(String brand,double price,String type,char size)
	{
		this(brand,price,type);
		this.size=size;
		System.out.println("The brand of helmet is :"+brand);
		System.out.println("The price of helmet is:"+price);
		System.out.println("The type of the helmet is  :"+type);
		System.out.println("The size of helmet is :"+size);
		
	}
	
	Helmet(String brand,double price,String type,char size,boolean frontGlass)
	{
		this(brand,price,type,size);
		this.frontGlass=frontGlass;
		System.out.println("The brand of helmet is :"+brand);
		System.out.println("The price of helmet is:"+price);
		System.out.println("The type of the helmet is  :"+type);
		System.out.println("The size of helmet is :"+size);
		System.out.println("The frontGlass of helmet is present:"+frontGlass);
		
	}
}
