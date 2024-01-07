package xadrez.elementos;

import jogodetabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.ElementoXadrez;

public class Torre extends ElementoXadrez {

	public Torre(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}

	@Override
	
	public String toString () {
		return "T";
	}
	
}
