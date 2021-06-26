package xadrez;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.peças.Rei;
import xadrez.peças.Torre;

public class PartidaDeXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		iniciarPartida();
	}
	public PeçaDeXadrez[][] getPeças(){
		PeçaDeXadrez[][] mat = new PeçaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i= 0; i<tabuleiro.getLinhas();i++) {
			for (int j = 0; j < tabuleiro.getColunas(); j++) {
				mat[i][j] = (PeçaDeXadrez) tabuleiro.peça(i, j);
			}
		}
		return mat;
	}
	private void iniciarPartida(){
		tabuleiro.colocarPeça(new Torre(tabuleiro, Cor.BRANCA), new Posicao(2,1));
		tabuleiro.colocarPeça(new Rei(tabuleiro, Cor.PRETA), new Posicao(2,2));
		tabuleiro.colocarPeça(new Rei(tabuleiro, Cor.PRETA), new Posicao(2,4));
	}
}
