class Course
{
	String courseName;
	int fee;
	int noOfTopics;
	int noOfStudents;
	boolean online;
	int noOfTrainers;
	String location;
	
	Course()
	{
		System.out.println("invoking the Cource const...");
		
	}
	Course(String courseName,int fee,int noOfTopics,int noOfStudents,boolean online,int noOfTrainers,String location)
	{
		this.courseName=courseName;
		this.fee=fee;
		this.noOfTopics=noOfTopics;
		this.noOfStudents=noOfStudents;
		this.online=online;
		this.noOfTrainers=noOfTrainers;
		this.location=location;
		System.out.println("Created Course with String,int,int,int Constructor");
	}
	void displayInfo(){
		
		System.out.println("Starting displayInfo");
		System.out.println(this.courseName=courseName);
		System.out.println(this.fee=fee);
		System.out.println(this.noOfTopics=noOfTopics);
		System.out.println(this.noOfStudents=noOfStudents);
		System.out.println(this.online=online);
		System.out.println(this.noOfTrainers=noOfTrainers);
		
		System.out.println(this.location=location);
		
		System.out.println("Ending displayInfo");
		
	}
}