package jogodetabuleiro;

public class Tabuleiro {
	
	private int linha;
	private int coluna;
	private Elemento[][] elementos;
	
	public Tabuleiro(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
		elementos = new Elemento[linha][coluna];
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	
	public Elemento elemento(int linha, int coluna) {
		return elementos[linha][coluna];
	}
	
	public Elemento elemento(Posicao posicao) {
		return elementos[posicao.getLinha()][posicao.getColuna()];
	}

}
