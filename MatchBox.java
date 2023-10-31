class MatchBox
{
	String brand;
	int noOfSticks=100;
	double length;
	double price=10;
	char size='S';
	double weight;
	String type;
	
	MatchBox()
	{
		System.out.println("The MatchBox has");
	}
		
		MatchBox(String brand)
		{
		this.brand=brand;
		
		System.out.println("The brand is :"+brand);
		
		}
		
		
		
		MatchBox( int noOfSticks)
			{
			this.noOfSticks=noOfSticks;
			
			System.out.println("The no. of sticks present is :"+noOfSticks);
			}
		
			
			
		MatchBox(String brand,char size)
		{
			this.brand=brand;
			this.size=size;
			System.out.println("The brand of the match sticks is :"+brand);
			System.out.println("The size of the sticks is :"+size);
				
			}			
			
			
		MatchBox(double price,char size)
				{
				this.price=price;
				this.size=size;
				System.out.println("The price of the matchbox is :"+price);
				System.out.println("The size of the sticks is :"+size);
				}
				
			
			
		MatchBox(double weight,String type)
				{
				this.weight=weight;
				this.type=type;
				
				
				System.out.println("The weight  is :"+weight);
				System.out.println("The type of the matches is :"+type);
				}
				
				
		MatchBox(char size,String brand)
				{
					this.size=size;
					this.brand=brand;
					System.out.println("The size of the sticks is :"+size);
				System.out.println("The brand of the matchbox is :"+brand);
					
				}
			
		MatchBox(int noOfSticks, double price)
				{
					this.noOfSticks=noOfSticks;
					this.price=price;
					System.out.println("The no.of sticks present is :"+noOfSticks);
				System.out.println("The price of the matchbox is :"+price);
					
				}
			
		
		
		
		
	
	
}