class ShowRoom
{
	String name;
	int noOfManagers;
	double squareFeetInMeters=1960.69;
	int noOfWorkers;
	String typeOfShowroom;
	boolean mostFamous=false;
	String location;
	
	ShowRoom()
	{
		System.out.println("The ShowRoom has");
	}
		
		ShowRoom(String name)
		{
		this.name=name;
		
		System.out.println("The name of the showroom is :"+name);
		
		}
		
		
		
		ShowRoom(int noOfManagers)
			{
			this.noOfManagers=noOfManagers;
			
			System.out.println("The no. of manager present is :"+noOfManagers);
			}
		
			
			
		ShowRoom(double squareFeetInMeters)
		{
			this.squareFeetInMeters=squareFeetInMeters;
			
			System.out.println("The squareFeet In Meters is :"+squareFeetInMeters);
			
				
			}			
			
			
		ShowRoom(String name,int noOfWorkers)
				{
				this.noOfWorkers=noOfWorkers;
				this.name=name;
				
				System.out.println("The no. of workers is :"+noOfWorkers);
				System.out.println("The name of the showroom is :"+name);
				
				}
				
			
			
		ShowRoom(String typeOfShowroom,boolean mostFamous)
				{
				this.typeOfShowroom=typeOfShowroom;
				this.mostFamous=mostFamous;
				
				
				System.out.println("The type is :"+typeOfShowroom);
				System.out.println("The showroom is :"+mostFamous);
				}
				
				
		ShowRoom(String location,String name)
				{
					this.location=location;
					this.name=name;
					System.out.println("The locationis :"+location);
				System.out.println("The name is :"+name);
					
				}
			
		ShowRoom(int noOfManagers,int noOfWorkers)
				{
					this.noOfManagers=noOfManagers;
					this.noOfWorkers=noOfWorkers;
					System.out.println("The no.of managers is :"+noOfManagers);
				System.out.println("The noOfWorkers is :"+noOfWorkers);
					
				}
				
		ShowRoom(boolean mostFamous,double squareFeetInMeters)
				{
					this. mostFamous= mostFamous;
					this.squareFeetInMeters=squareFeetInMeters;
					System.out.println("The showroom is :"+mostFamous);
				System.out.println("The squareFeet of showroom is :"+squareFeetInMeters);
					
				}
		
		
		
		
	
	
}