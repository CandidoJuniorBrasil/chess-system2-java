package aplicacao;

import jogodetabuleiro.Tabuleiro;
import xadrez.PartidaXadrez;

public class JogoXadrez {

	public static void main(String[] args) {
		
	    PartidaXadrez partidaXadrez = new PartidaXadrez();
	    UI.mostraTabuleiro(partidaXadrez.obtendoElemento());

	}

}
