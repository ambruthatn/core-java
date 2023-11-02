class MakeupKitStarter
{
	public static void main(String[] items)
	{
		System.out.println("The starting of MakeupKitStarter main");
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		MakeupKit makeupKit=new MakeupKit();
		System.out.println("there are eye shadow pallet of   :"+makeupKit.noOfEyeShadow);
		System.out.println("The price of the kit is:"+makeupKit.price);
		System.out.println("The makeupkit has transfer Proof base is :"+makeupKit.transferProof);
		System.out.println("The brand is:"+makeupKit.brand);
		
		System.out.println("_____________________________________________");
		
		MakeupKit makeupKit1=new MakeupKit(true);
		System.out.println("there are eye shadow pallet of   :"+makeupKit1.noOfEyeShadow);
		System.out.println("The price of the kit is:"+makeupKit1.price);
		System.out.println("The makeupkit has transfer Proof base is :"+makeupKit1.transferProof);
		System.out.println("The brand is:"+makeupKit1.brand);
		
		System.out.println("_____________________________________________");
		
		MakeupKit makeupKit2=new MakeupKit("Aqua",899.9);
		System.out.println("there are eye shadow pallet of   :"+makeupKit2.noOfEyeShadow);
		System.out.println("The price of the kit is:"+makeupKit2.price);
		System.out.println("The makeupkit has transfer Proof base is :"+makeupKit2.transferProof);
		System.out.println("The brand is:"+makeupKit2.brand);
		
		System.out.println("_____________________________________________");
		
		
		MakeupKit makeupKit3=new MakeupKit(false,64);
		System.out.println("there are eye shadow pallet of   :"+makeupKit3.noOfEyeShadow);
		System.out.println("The price of the kit is:"+makeupKit3.price);
		System.out.println("The makeupkit has transfer Proof base is :"+makeupKit3.transferProof);
		System.out.println("The brand is:"+makeupKit3.brand);
		
		System.out.println("_____________________________________________");
		
		MakeupKit makeupKit4=new MakeupKit("Lakme",45);
		System.out.println("there are eye shadow pallet of   :"+makeupKit4.noOfEyeShadow);
		System.out.println("The price of the kit is:"+makeupKit4.price);
		System.out.println("The makeupkit has transfer Proof base is :"+makeupKit4.transferProof);
		System.out.println("The brand is:"+makeupKit4.brand);
		
		System.out.println("_____________________________________________");
		
	}
}
		
		
		