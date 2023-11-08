class GameStarter{
	
	public static void main(String[] apply){
		
		
		
		System.out.println("Starting Game");
		TotalPlayers totalPlayers=TotalPlayers.HUNDERED;
		Game game=new Game(20,"Football",totalPlayers,"Outdoor");
		Player player=new Player("Richard",game);
		
		game.showInfo();
		player.showInfo();
		player.playGame();
		player.pauseGame();
		player.endGame();
		System.out.println("Ending Game");
		
		
	}

}