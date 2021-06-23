package tabuleiro;

public class Peça {
	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	public Peça(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro; 
		posicao = null; // poderia nao colocar
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro; //tabuleiro não pode ser acessado pelo jogo
	}


	
	
}
