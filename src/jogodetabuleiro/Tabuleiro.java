package jogodetabuleiro;

public class Tabuleiro {
	
	private int linha;
	private int coluna;
	private Elemento[][] elementos;
	
	public Tabuleiro(int linha, int coluna) {
		if (linha < 1 || coluna < 1) {
			throw new ExcecoesTabuleiro("Erro criando Tabuleiro: deve haver pelo menos 1 linha e 1 coluna");
		}
		this.linha = linha;
		this.coluna = coluna;
		elementos = new Elemento[linha][coluna];
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}

	public Elemento elemento(int linha, int coluna) {
		if (! existePosicao(linha,coluna)) {
			throw new ExcecoesTabuleiro("Não existe esta posição no Tabuleiro");
		}
		return elementos[linha][coluna];
	}
	
	public Elemento elemento(Posicao posicao) {
		if (! existePosicao(posicao)) {
			throw new ExcecoesTabuleiro("Não existe esta posição no Tabuleiro");
		}
		return elementos[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void movimentaElemento(Elemento elemento, Posicao posicao ) {
		if (haUmElemento(posicao)) {
			throw new ExcecoesTabuleiro("Já existe uma peça nesta posição" + posicao);
		}
		elementos[posicao.getLinha()][posicao.getColuna()] = elemento;
		elemento.posicao = posicao;
	}
	
	public boolean existePosicao(int linha, int coluna ) {
		return linha >= 0 && linha <= this.linha && coluna >= 0 && coluna <= this.coluna;
	}
	
	public boolean existePosicao(Posicao posicao ) {
		return existePosicao(posicao.getLinha(), posicao.getColuna());	
	}
	
	public boolean haUmElemento(Posicao posicao) {
		if (! existePosicao(linha,coluna)) {
			throw new ExcecoesTabuleiro("Não existe esta posição no Tabuleiro");
		}
		return elemento(posicao) != null;
	}

}
