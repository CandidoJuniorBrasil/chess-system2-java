package xadrez;

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
	
	private void moveNovoElemento(char coluna, int linha, ElementoXadrez elemento) {
		tabuleiro.movimentaElemento(elemento,  new PosicaoXadrez(coluna, linha).paraPosicao());
	}
	
	private void inicioConfiguracao () {
		moveNovoElemento('b', 6, new Torre(tabuleiro,Cor.Branco));
		moveNovoElemento('e', 8, new Rei(tabuleiro,Cor.Preto));
		moveNovoElemento('e', 1, new Rei(tabuleiro,Cor.Branco));
	}
}
