package xadrez;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pe�as.Rei;
import xadrez.pe�as.Torre;

public class PartidaDeXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		iniciarPartida();
	}
	public Pe�aDeXadrez[][] getPe�as(){
		Pe�aDeXadrez[][] mat = new Pe�aDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i= 0; i<tabuleiro.getLinhas();i++) {
			for (int j = 0; j < tabuleiro.getColunas(); j++) {
				mat[i][j] = (Pe�aDeXadrez) tabuleiro.pe�a(i, j);
			}
		}
		return mat;
	}
	private void iniciarPartida(){
		tabuleiro.colocarPe�a(new Torre(tabuleiro, Cor.BRANCA), new Posicao(2,1));
		tabuleiro.colocarPe�a(new Rei(tabuleiro, Cor.PRETA), new Posicao(2,2));
		tabuleiro.colocarPe�a(new Rei(tabuleiro, Cor.PRETA), new Posicao(2,4));
	}
}
