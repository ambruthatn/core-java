class Starter{
	public static void main(String[] args)
	{
		System.out.println("Starting of main");
		
		Color color=Color.PINK;
		Tent tent=new Tent();
		Agent agent=new Agent();
		tent.showInfo(59,color,54,67);
		agent.openTent(tent);
		agent.closeTent(tent);
		agent.showInfo();
		System.out.println("Starting of main");
	}
}