package tabuleiro;

public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private Peça[][] peças;
	
	public Tabuleiro(int linhas, int colunas) {
		if (linhas < 1 || colunas < 1) {
			throw new TabuleiroException("Erro ao criar tabuleiro: deve haver pelo menos 1 linha e 1 coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		peças = new Peça[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public Peça peça (int linha, int coluna) {
		if (!posicaoExistente(linha, coluna)) {
			throw new TabuleiroException("Posicao inexistente");
		}
		return peças[linha][coluna];
	}
	public Peça peça (Posicao posicao) {
		if (!posicaoExistente(posicao)) {
			throw new TabuleiroException("Posicao inexistente");
		}
		return peças[posicao.getLinha()][posicao.getColuna()];
	}
	public void colocarPeça(Peça peça, Posicao posição){
		if (haUmaPeça(posição)) {
			throw new TabuleiroException("Já existe uma peça na posição " + posição);
		}
		peças[posição.getLinha()][posição.getColuna()] = peça;
		peça.posicao = posição;
	}
	private boolean posicaoExistente(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}

	public boolean posicaoExistente(Posicao posicao) {
		return posicaoExistente(posicao.getLinha(), posicao.getColuna());
	}

	public boolean haUmaPeça(Posicao posicao) {
		if (!posicaoExistente(posicao)) {
			throw new TabuleiroException("Posicao inexistente");
		}
		return peça(posicao) != null;
	}
}
