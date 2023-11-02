class CourceStarter{
	public static void main(String[] args){
		
		System.out.println("Starting main in CourseStarter");
		
		Course course=new Course();
		course.displayInfo();
		
		Course course1=new Course("Java",24000,3,40,false,3,"BTM");
		course1.displayInfo();
		
		Course course2=new Course("Data science",40000,2,30,true,1,"Indiranagar");
		course2.displayInfo();
		
		Course course3=new Course("Python",45000,4,10,true,8,"MG road");
		course3.displayInfo();
		
		Course course4=new Course("DAP",20000,3,13,false,4,"Nelmangala");
		course4.displayInfo();
		
		Course course5=new Course("Adv java",27000,2,80,true,2,"RamNagar");
		course5.displayInfo();
		
		Course course6=new Course("Ajax",20000,1,38,false,1,"Nagarbavai");
		course6.displayInfo();
		
		Course course7=new Course("angular js",25000,2,45,true,1,"Apmc");
		course7.displayInfo();
		
		Course course8=new Course("JAP",23000,3,60,false,3,"JP nagar");
		course8.displayInfo();
		
		Course course9=new Course("C",28000,3,55,true,2,"Jaynagar");
		course9.displayInfo();
		
		Course course10=new Course("Ruby",10000,3,70,false,1,"Silkboard");
		course10.displayInfo();
		
		Course course11=new Course("Sql",29000,3,69,true,1,"Chikpet");
		course11.displayInfo();
		
		System.out.println("Ending main in 	CourseStarter");
	}
}