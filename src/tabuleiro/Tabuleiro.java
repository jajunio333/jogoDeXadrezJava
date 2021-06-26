package tabuleiro;

public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private Pe�a[][] pe�as;
	
	public Tabuleiro(int linhas, int colunas) {
		if (linhas < 1 || colunas < 1) {
			throw new TabuleiroException("Erro ao criar tabuleiro: deve haver pelo menos 1 linha e 1 coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pe�as = new Pe�a[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public Pe�a pe�a (int linha, int coluna) {
		if (!posicaoExistente(linha, coluna)) {
			throw new TabuleiroException("Posicao inexistente");
		}
		return pe�as[linha][coluna];
	}
	public Pe�a pe�a (Posicao posicao) {
		if (!posicaoExistente(posicao)) {
			throw new TabuleiroException("Posicao inexistente");
		}
		return pe�as[posicao.getLinha()][posicao.getColuna()];
	}
	public void colocarPe�a(Pe�a pe�a, Posicao posi��o){
		if (haUmaPe�a(posi��o)) {
			throw new TabuleiroException("J� existe uma pe�a na posi��o " + posi��o);
		}
		pe�as[posi��o.getLinha()][posi��o.getColuna()] = pe�a;
		pe�a.posicao = posi��o;
	}
	private boolean posicaoExistente(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}

	public boolean posicaoExistente(Posicao posicao) {
		return posicaoExistente(posicao.getLinha(), posicao.getColuna());
	}

	public boolean haUmaPe�a(Posicao posicao) {
		if (!posicaoExistente(posicao)) {
			throw new TabuleiroException("Posicao inexistente");
		}
		return pe�a(posicao) != null;
	}
}
