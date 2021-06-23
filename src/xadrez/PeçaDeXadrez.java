package xadrez;

import tabuleiro.Pe�a;
import tabuleiro.Tabuleiro;

public class Pe�aDeXadrez extends Pe�a{
	
	private Cor cor;
	
	public Pe�aDeXadrez(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	

}
