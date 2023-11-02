class PrinterStarter
{
	public static void main(String[] design)
	{
		System.out.println("The starting of PrinterStarter main");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		Printer printer=new Printer();
		System.out.println("The brand  is  :"+printer.brand);
		System.out.println("The price  is:"+printer.price);
		System.out.println("The type of the printer is :"+printer.type);
		System.out.println("The printing capacity is :"+printer.noOfPages);
		System.out.println("The model is  :"+printer.model);
		
		System.out.println("_____________________________________________");
		
		Printer printer1=new Printer("Lenevo");
		System.out.println("The brand  is  :"+printer1.brand);
		System.out.println("The price  is:"+printer1.price);
		System.out.println("The type of the printer is :"+printer1.type);
		System.out.println("The printing capacity is :"+printer1.noOfPages);
		System.out.println("The model is  :"+printer1.model);
		
		System.out.println("_____________________________________________");
		
		Printer printer3=new Printer("Acer",30000);
		System.out.println("The brand  is  :"+printer3.brand);
		System.out.println("The price  is:"+printer3.price);
		System.out.println("The type of the printer is :"+printer3.type);
		System.out.println("The printing capacity is :"+printer3.noOfPages);
		System.out.println("The model is  :"+printer3.model);
		
		System.out.println("_____________________________________________");
		
		Printer printer4=new Printer("Hmko",50000,"digital");
		System.out.println("The brand  is  :"+printer4.brand);
		System.out.println("The price  is:"+printer4.price);
		System.out.println("The type of the printer is :"+printer4.type);
		System.out.println("The printing capacity is :"+printer4.noOfPages);
		System.out.println("The model is  :"+printer4.model);
		
		System.out.println("_____________________________________________");
		
		Printer printer5=new Printer("Leo",46000,"ink-jet",70);
		System.out.println("The brand  is  :"+printer5.brand);
		System.out.println("The price  is:"+printer5.price);
		System.out.println("The type of the printer is :"+printer5.type);
		System.out.println("The printing capacity is :"+printer5.noOfPages);
		System.out.println("The model is  :"+printer5.model);
		
		System.out.println("_____________________________________________");
		
		Printer printer6=new Printer("Zam-Zam",78000,"digital",89,"CA");
		System.out.println("The brand  is  :"+printer6.brand);
		System.out.println("The price  is:"+printer6.price);
		System.out.println("The type of the printer is :"+printer6.type);
		System.out.println("The printing capacity is :"+printer6.noOfPages);
		System.out.println("The model is  :"+printer6.model);
		
		System.out.println("_____________________________________________");
		
}
}
