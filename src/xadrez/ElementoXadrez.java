package xadrez;

import jogodetabuleiro.Elemento;
import jogodetabuleiro.Tabuleiro;

public class ElementoXadrez extends Elemento {
	
	private Cor cor;

	public ElementoXadrez(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}
}
