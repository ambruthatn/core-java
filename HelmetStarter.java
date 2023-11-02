class HelmetStarter
{
	public static void main(String[] safty)
	{
		System.out.println("The starting of HelmetStarter main");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		Helmet helmet=new Helmet();
		System.out.println("The brand of helmet is :"+helmet.brand);
		System.out.println("The price of helmet is:"+helmet.price);
		System.out.println("The type of the helmet is  :"+helmet.type);
		System.out.println("The size of helmet is :"+helmet.size);
		System.out.println("The frontGlass of helmet is present:"+helmet.frontGlass);
		
		
		System.out.println("_____________________________________________");
		
		
		Helmet helmet1=new Helmet("Honda");
		System.out.println("The brand of helmet is :"+helmet1.brand);
		System.out.println("The price of helmet is:"+helmet1.price);
		System.out.println("The type of the helmet is  :"+helmet1.type);
		System.out.println("The size of helmet is :"+helmet1.size);
		System.out.println("The frontGlass of helmet is present:"+helmet1.frontGlass);
		
		
		System.out.println("_____________________________________________");
		
		
		Helmet helmet2=new Helmet("Samsung",999.50);
		System.out.println("The brand of helmet is :"+helmet2.brand);
		System.out.println("The price of helmet is:"+helmet2.price);
		System.out.println("The type of the helmet is  :"+helmet2.type);
		System.out.println("The size of helmet is :"+helmet2.size);
		System.out.println("The frontGlass of helmet is present:"+helmet2.frontGlass);
		
		
		System.out.println("_____________________________________________");
		
		
		Helmet helmet3=new Helmet("PopCorn",599.95,"Half");
		System.out.println("The brand of helmet is :"+helmet3.brand);
		System.out.println("The price of helmet is:"+helmet3.price);
		System.out.println("The type of the helmet is  :"+helmet3.type);
		System.out.println("The size of helmet is :"+helmet3.size);
		System.out.println("The frontGlass of helmet is present:"+helmet3.frontGlass);
		
		
		System.out.println("_____________________________________________");
		
		
		Helmet helmet4=new Helmet("Polo",699.25,"Full",'L');
		System.out.println("The brand of helmet is :"+helmet4.brand);
		System.out.println("The price of helmet is:"+helmet4.price);
		System.out.println("The type of the helmet is  :"+helmet4.type);
		System.out.println("The size of helmet is :"+helmet4.size);
		System.out.println("The frontGlass of helmet is present:"+helmet4.frontGlass);
		
		
		System.out.println("_____________________________________________");
		
		
		Helmet helmet5=new Helmet("Bata",799.50,"Half",'S',true);
		System.out.println("The brand of helmet is :"+helmet5.brand);
		System.out.println("The price of helmet is:"+helmet5.price);
		System.out.println("The type of the helmet is  :"+helmet5.type);
		System.out.println("The size of helmet is :"+helmet5.size);
		System.out.println("The frontGlass of helmet is present:"+helmet5.frontGlass);
		
		
		System.out.println("_____________________________________________");
	}
}