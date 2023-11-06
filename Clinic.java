class Clinic
{
	String specialization="diabities";
	int totalBeds=5;
	int totalPetients=3;
	Doctor doctor;
	
	Clinic(Doctor doctor)
	{
		this.doctor=doctor;
	}
	
	void displayInfo()
	{
		System.out.println("Specialization :"+this.specialization);
		System.out.println("Total Beds :"+this.totalBeds);
		System.out.println("Total Petieants :"+this.totalPetients);
		System.out.println("Doctor :"+this.doctor);
		if(this.doctor!=null)
		{
			System.out.println("Name :"+this.doctor.name);
			System.out.println("Exp :"+this.doctor.exp);
			System.out.println("Fake :"+this.doctor.fake);
			System.out.println("Fees :"+this.doctor.fees);
			
		}	
	}
	
}