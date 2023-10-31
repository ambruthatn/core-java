class Keyboard
{
	String brand="hp";
	String color="white";
	int noOfKeys;
	String type;
	double	cost;
	
	Keyboard()
	{
		System.out.println("The keyboard has");
	}
		
		Keyboard(String brand,String color,String type)
		{
		this.brand=brand;
		this.type=type;
		this.color=color;
		System.out.println("The brand is :"+brand);
		System.out.println("The type is :"+type);
		System.out.println("The color is :"+color);
		}
		
		
		
			Keyboard(double cost,String brand)
			{
			this.cost=cost;
			this.brand=brand;
			System.out.println("The cost is :"+cost);
			System.out.println("The brand is :"+brand);
			}
		
			
			
			Keyboard(int noOfKeys,String type){
				
			
				this.noOfKeys=noOfKeys;
				this.type=type;
				System.out.println("The number of keys present :"+noOfKeys);
				System.out.println("The keyboard type is :"+type);
				
			}			
			
			
				Keyboard(String brand,int noOfKeys)
				{
				this.brand=brand;
				this.noOfKeys=noOfKeys;
				System.out.println("The brand name is :"+brand);
				System.out.println("The number of keys present :"+noOfKeys);
				}
				
			
			
				Keyboard(String color,String type)
				{
				this.color=color;
				this.type=type;
				
				
				System.out.println("The color is :"+color);
				System.out.println("The type is :"+type);
				}
				
				
				Keyboard(double cost,int noOfKeys)
				{
					this.cost=cost;
					this.noOfKeys=noOfKeys;
					System.out.println("The cost is :"+cost);
				System.out.println("The no. of keys is :"+noOfKeys);
					
				}
			
		
		
		
		
		
	
	
}