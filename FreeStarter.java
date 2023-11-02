class FreeStarter{
	public static void main(String[] args){
		
		System.out.println("Starting main in FreeStarter");
		
		Free free=new Free();
		free.displayInfo();
		
		Free free1=new Free("Watch","Timing",2);
		free1.displayInfo();
		
		Free free2=new Free("TV","whatching",1);
		free2.displayInfo();
		
		Free free3=new Free("UNO","fun",52);
		free3.displayInfo();
		
		Free free4=new Free("courceOfJava","jobPurpose",50);
		free4.displayInfo();
		
		Free free5=new Free("Bottel","dringingPurpose",3);
		free5.displayInfo();
		
		Free free6=new Free("cylinder","cooking",1500);
		free6.displayInfo();
		
		Free free7=new Free("Project","college",6);
		free7.displayInfo();
		
		Free free8=new Free("games","mindRefreshment",20);
		free8.displayInfo();
		
		Free free9=new Free("Fan","cool",3);
		free9.displayInfo();
		
		Free free10=new Free("cables","electricPurpose",10);
		free10.displayInfo();
		
		Free free11=new Free("flower","decoration",2);
		free11.displayInfo();
		
		System.out.println("Ending main in FreeStarter");
	}
}
