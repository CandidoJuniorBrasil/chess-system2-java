package xadrez;

import jogodetabuleiro.Posicao;
import jogodetabuleiro.Tabuleiro;
import xadrez.elementos.Rei;
import xadrez.elementos.Torre;

public class PartidaXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8,8);
		inicioConfiguracao();
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
	
	private void inicioConfiguracao () {
		tabuleiro.movimentaElemento(new Torre(tabuleiro, Cor.Branco), new Posicao(2,1));
		tabuleiro.movimentaElemento(new Rei(tabuleiro, Cor.Preto), new Posicao(0,4));
		tabuleiro.movimentaElemento(new Rei(tabuleiro, Cor.Branco), new Posicao(7,4));
	}
}
