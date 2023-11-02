class MakeupKit
{
	int noOfEyeShadow=38;
	double price;
	boolean transferProof;
	String brand;
	
	MakeupKit()
	{
		this(false);
		System.out.println("The makeupkit  has some features");
	}
	MakeupKit(boolean transferProof)
	{
		this.transferProof=transferProof;
		System.out.println("The makeupkit has transfer Proof base is :"+transferProof);
	}
	MakeupKit(String brand,double price)
	{
		this.brand=brand;
		this.price=price;
		System.out.println("The brand is:"+brand);
		System.out.println("The price of the kit is:"+price);
	}
	MakeupKit(boolean transferProof,int noOfEyeShadow)
	{
		this.transferProof=transferProof;
		System.out.println("The makeupkit kit is transfer proof :"+transferProof);
	}
	MakeupKit(String brand,int noOfEyeShadow)
	{
		this.brand=brand;
		this.noOfEyeShadow=noOfEyeShadow;
		System.out.println("the brand is :"+brand);
		System.out.println("there are eye shadow pallet of :"+noOfEyeShadow);
	
	}
}
