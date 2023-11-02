class MonthStarter{
	public static void main(String[] args){
		
		System.out.println("Starting main in MonthStarter");
		
		Month month=new Month();
		month.displayInfo();
		
		Month month1=new Month("Jan",31,4,7);
		month1.displayInfo();
		
		Month month2=new Month("Feb",27,3,1);
		month2.displayInfo();
		
		Month month3=new Month("Mar",30,4,2);
		month3.displayInfo();
		
		Month month4=new Month("Apr",31,4,6);
		month4.displayInfo();
		
		Month month5=new Month("May",30,4,2);
		month5.displayInfo();
		
		Month month6=new Month("Jun",31,4,0);
		month6.displayInfo();
		
		Month month7=new Month("Jul",30,4,1);
		month7.displayInfo();
		
		Month month8=new Month("Aug",31,4,3);
		month8.displayInfo();
		
		Month month9=new Month("Sep",30,4,4);
		month9.displayInfo();
		
		Month month10=new Month("Oct",31,4,6);
		month10.displayInfo();
		
		Month month11=new Month("Nov",30,4,5);
		month11.displayInfo();
		
		Month month12=new Month("Dec",31,4,1);
		month12.displayInfo();
		
		System.out.println("Ending main in 	MonthStarter");
	}
}