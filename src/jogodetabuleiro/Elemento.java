package jogodetabuleiro;

public class Elemento {

	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	public Elemento(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		posicao = null;
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	
}
 