class Bracelet

{
    double length;
	int noOfBeats;
	String type;
	int price;
	char size;
	
	
	Bracelet()
	{
		this(7.50,20);
		System.out.println("The Bracelet has some features");
	}
	Bracelet(double length)
	{
		this.length=length;
		System.out.println("The length of the bracelet is :"+length);
	}
	Bracelet(double length,int noOfBeats)
	{
		this.length=length;
		this.noOfBeats=noOfBeats;
		System.out.println("The length of the bracelet is :"+length);
		System.out.println("The no. of beats used :"+noOfBeats);
	}
	Bracelet(double length,int noOfBeats,String type)
	{
		this.length=length;
		this.noOfBeats=noOfBeats;
		this.type=type;
		
		System.out.println("The length of the bracelet is :"+length);
		System.out.println("The no. of beats used :"+noOfBeats);
		System.out.println("The type of the bracelet is  :"+type);
		
		
		
	}
	Bracelet(double length,int noOfBeats,String type,int price)
	{
		this(length,noOfBeats,type);
		this.price=price;
		System.out.println("The length of the bracelet is :"+length);
		System.out.println("The no. of beats used :"+noOfBeats);
		System.out.println("The type of the bracelet is  :"+type);
		System.out.println("The price of bracelet is :"+price);
		
	}
	
	Bracelet(double length,int noOfBeats,String type,int price,char size)
	{
		this(length,noOfBeats,type,price);
		this.size=size;
		System.out.println("The length of the bracelet is :"+length);
		System.out.println("The no. of beats used :"+noOfBeats);
		System.out.println("The type of the bracelet is  :"+type);
		System.out.println("The price of bracelet is :"+price);
		System.out.println("The size of bracelet is :"+size);
		
	}
}
