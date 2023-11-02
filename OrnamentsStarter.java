class OrnamentsStarter
{
	public static void main(String[] design)
	{
		System.out.println("The starting of ornamentStarter main");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		Ornaments ornaments=new Ornaments();
		System.out.println("The brand  is  :"+ornaments.brand);
		System.out.println("The price  is:"+ornaments.price);
		System.out.println("The type of the ornaments is  :"+ornaments.type);
		System.out.println("The size of ornaments is:"+ornaments.size);
		
		System.out.println("_____________________________________________");
		
		Ornaments ornaments1=new Ornaments("Hukuna");
		System.out.println("The brand  is  :"+ornaments1.brand);
		System.out.println("The price  is:"+ornaments1.price);
		System.out.println("The type of the ornaments is  :"+ornaments1.type);
		System.out.println("The size of ornaments is:"+ornaments1.size);
		
		System.out.println("_____________________________________________");
		
		Ornaments ornaments2=new Ornaments('L',987.99);
		System.out.println("The brand  is  :"+ornaments2.brand);
		System.out.println("The price  is:"+ornaments2.price);
		System.out.println("The type of the ornaments is  :"+ornaments2.type);
		System.out.println("The size of ornaments is:"+ornaments2.size);
		
		System.out.println("_____________________________________________");
		
		Ornaments ornaments3=new Ornaments("Single",'M',455.99);
		System.out.println("The brand  is  :"+ornaments3.brand);
		System.out.println("The price  is:"+ornaments3.price);
		System.out.println("The type of the ornaments is  :"+ornaments3.type);
		System.out.println("The size of ornaments is:"+ornaments3.size);
		
		System.out.println("_____________________________________________");
		
		Ornaments ornaments4=new Ornaments("Double","LOTO");
		System.out.println("The brand  is  :"+ornaments4.brand);
		System.out.println("The price  is:"+ornaments4.price);
		System.out.println("The type of the ornaments is  :"+ornaments4.type);
		System.out.println("The size of ornaments is:"+ornaments4.size);
		
		System.out.println("_____________________________________________");
	}
}
		
		