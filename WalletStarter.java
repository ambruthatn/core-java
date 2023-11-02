class WalletStarter
{
	public static void main(String[] money)
	{
		System.out.println("The starting of WalletStarter main");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		Wallet wallet=new Wallet();
		System.out.println("The brand of wallet is  :"+wallet.brand);
		System.out.println("The price of the wallet is:"+wallet.price);
		System.out.println("The size of wallet is :"+wallet.size);
		System.out.println("The no. of compartments is:"+wallet.noOfCompartments);
		
		System.out.println("_____________________________________________");
		
		Wallet wallet1=new Wallet('S');
		System.out.println("The brand of wallet is  :"+wallet1.brand);
		System.out.println("The price of the wallet is:"+wallet1.price);
		System.out.println("The size of wallet is :"+wallet1.size);
		System.out.println("The no. of compartments is:"+wallet1.noOfCompartments);
		
		System.out.println("_____________________________________________");
		
		Wallet wallet2=new Wallet('M',"Woodland");
		System.out.println("The brand of wallet is  :"+wallet2.brand);
		System.out.println("The price of the wallet is:"+wallet2.price);
		System.out.println("The size of wallet is :"+wallet2.size);
		System.out.println("The no. of compartments is:"+wallet2.noOfCompartments);
		
		System.out.println("_____________________________________________");
		
		Wallet wallet3=new Wallet(8,'S');
		System.out.println("The brand of wallet is  :"+wallet3.brand);
		System.out.println("The price of the wallet is:"+wallet3.price);
		System.out.println("The size of wallet is :"+wallet3.size);
		System.out.println("The no. of compartments is:"+wallet3.noOfCompartments);
		
		System.out.println("_____________________________________________");
		
		Wallet wallet4=new 		Wallet(999,"Peacock");
		System.out.println("The brand of wallet is  :"+wallet4.brand);
		System.out.println("The price of the wallet is:"+wallet4.price);
		System.out.println("The size of wallet is :"+wallet4.size);
		System.out.println("The no. of compartments is:"+wallet4.noOfCompartments);
		
		System.out.println("_____________________________________________");
	}
}
		
		
		