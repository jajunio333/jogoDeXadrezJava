package tabuleiro;

public class Pe�a {
	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	public Pe�a(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro; 
		posicao = null; // poderia nao colocar
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro; //tabuleiro n�o pode ser acessado pelo jogo
	}


	
	
}
