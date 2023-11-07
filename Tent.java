class Tent
{
	int slNo;
	Color color;
	double width;
	double height;
	
	boolean open(){
		System.out.println("tent open");
		return true;
	}
	
	boolean close()
	{
		System.out.println("tent close");
		return false;
		
	}
	void showInfo(int slNo,Color color,double width,double height)
	{
		this.color=color;
		this.slNo=slNo;
		this.width=width;
		this.height=height;
		
		System.out.println("Starting showInfo in tent");
		System.out.println("tent slNo :"+slNo);
		
		if(color!=null)
		{
			System.out.println("tent color "+color.PINK);
			System.out.println("tent color "+color.SAFRON);
			System.out.println("tent color "+color.GREEN);
			
			
		}
		System.out.println("tent width :"+width);
		System.out.println("Ending showInfo in tent");
	}
}