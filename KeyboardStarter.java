class KeyboardStarter
{
	public static void main(String[] args)
	{
		
	
	
	System.out.println("Starting of main");
	
	Keyboard keyboard=new Keyboard();
	System.out.println("The brand is :"+keyboard.brand);
	System.out.println("The type is :"+keyboard.type);
	System.out.println("The color is :"+keyboard.color);
	System.out.println("The type is :"+keyboard.noOfKeys);
	System.out.println("The cost is :"+keyboard.cost);
	
	System.out.println("------------------------------------");
	
	Keyboard keyboard1=new Keyboard("LENOVO","PINK","WIRELESS");
	System.out.println("The brand is :"+keyboard1.brand);
	System.out.println("The type is :"+keyboard1.type);
	System.out.println("The color is :"+keyboard1.color);
	System.out.println("The type is :"+keyboard1.noOfKeys);
	System.out.println("The cost is :"+keyboard1.cost);
	
	System.out.println("------------------------------------");
	
	Keyboard keyboard2=new Keyboard(60000,"HP");
	System.out.println("The brand is :"+keyboard2.brand);
	System.out.println("The type is :"+keyboard2.type);
	System.out.println("The color is :"+keyboard2.color);
	System.out.println("The type is :"+keyboard2.noOfKeys);
	System.out.println("The cost is :"+keyboard2.cost);
	
	System.out.println("------------------------------------");
	
	Keyboard keyboard3=new Keyboard(56,"WIRED");
	System.out.println("The brand is :"+keyboard3.brand);
	System.out.println("The type is :"+keyboard3.type);
	System.out.println("The color is :"+keyboard3.color);
	System.out.println("The type is :"+keyboard3.noOfKeys);
	System.out.println("The cost is :"+keyboard3.cost);
	
	System.out.println("------------------------------------");
	
	Keyboard keyboard4=new Keyboard("OPPO",70);
	System.out.println("The brand is :"+keyboard4.brand);
	System.out.println("The type is :"+keyboard4.type);
	System.out.println("The color is :"+keyboard4.color);
	System.out.println("The type is :"+keyboard4.noOfKeys);
	System.out.println("The cost is :"+keyboard4.cost);
	
	System.out.println("------------------------------------");
	
	Keyboard keyboard5=new Keyboard("WHITE","WIRED");
	System.out.println("The brand is :"+keyboard5.brand);
	System.out.println("The type is :"+keyboard5.type);
	System.out.println("The color is :"+keyboard5.color);
	System.out.println("The type is :"+keyboard5.noOfKeys);
	System.out.println("The cost is :"+keyboard5.cost);
	
	System.out.println("------------------------------------");
	
	Keyboard keyboard6=new Keyboard(41000,70);
	System.out.println("The brand is :"+keyboard6.brand);
	System.out.println("The type is :"+keyboard6.type);
	System.out.println("The color is :"+keyboard6.color);
	System.out.println("The type is :"+keyboard6.noOfKeys);
	System.out.println("The cost is :"+keyboard6.cost);
	
	System.out.println("------------------------------------");
	}
	
	
}