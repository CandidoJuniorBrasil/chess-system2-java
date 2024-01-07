package xadrez;

import jogodetabuleiro.Tabuleiro;

public class PartidaXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8,8);
	}
	
	public ElementoXadrez[][] obtendoElemento() {
		ElementoXadrez[][] mat = new ElementoXadrez[tabuleiro.getLinha()][tabuleiro.getColuna()];
		for ( int i=0; i<tabuleiro.getLinha(); i++) {
			for (int j=0; j<tabuleiro.getColuna(); j++) {
				mat[i][j] = (ElementoXadrez) tabuleiro.elemento(i,j);
			}
		}
		return mat;
	}
}
