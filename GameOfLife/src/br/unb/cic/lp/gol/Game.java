package br.unb.cic.lp.gol;

/**
 * Classe Game implementa o Padr�o Fa�ade, tornando a cria��o
 * de um Game mais f�cil de ser utilizada.
 * 
 * @author Matheus Ervilha
 * 
 */
public class Game {
	private GameController controller;
	
	/**
	 * Construtor do Game
	 * @param height Altura do tabuleiro
	 * @param width Largura do tabuleiro
	 */
	public Game(int height, int width){
		controller = new GameController();
		
		GameRule gameRule = new GameRule_Standard(); //Jogo com as regras Padr�es
		
		GameEngine engine = new GameEngine(height, width, gameRule);	
		
		GameView board = new GameView(controller, engine);
		
		controller.setBoard(board);
		controller.setEngine(engine);
	}
	
	/* Inicia todo o processo do jogo */
	public void start(){
		controller.start();
	}

}
