package xadrez.elementos;

import jogodetabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.ElementoXadrez;

public class Rei extends ElementoXadrez {

	public Rei(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}

	@Override
	
	public String toString() {
		return "R";
	}
}
