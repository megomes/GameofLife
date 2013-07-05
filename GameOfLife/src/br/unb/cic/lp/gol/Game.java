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
		
		GameEngine engine = new GameEngine(height, width);	
		
		GameView board = new GameView(controller, engine);
		
		controller.setBoard(board);
		controller.setEngine(engine);
	}
	
	/* Inicia todo o processo do jogo */
	public void start(){
		controller.start();
	}

}
