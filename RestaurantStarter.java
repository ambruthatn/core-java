class RestaurantStarter{
	
	public static void main(String args[])
	{
		System.out.println("Starting of the main method");
		
		Restaurant restaurant=new Restaurant();
		
		String[] specialitems=new String[6];    // creation of the arrays
		specialitems[0]="Masal Dosa";
		specialitems[1]="idli";
		specialitems[2]="beetroot";
		specialitems[3]="papad";
		specialitems[4]="parota";
		specialitems[5]="sweet";
		restaurant.setSpecialitems(specialitems);
		restaurant.setOwnerName("Sham");
		restaurant.display();
		
		
		System.out.println("Starting of the main method");
		
}
}