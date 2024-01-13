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
				
		moveNovoElemento('c', 1, new Torre(tabuleiro, Cor.Branco));
		moveNovoElemento('c', 2, new Torre(tabuleiro, Cor.Branco));
		moveNovoElemento('d', 2, new Torre(tabuleiro, Cor.Branco));
		moveNovoElemento('e', 2, new Torre(tabuleiro, Cor.Branco));
		moveNovoElemento('e', 1, new Torre(tabuleiro, Cor.Branco));
		moveNovoElemento('d', 1, new Rei(tabuleiro, Cor.Branco));

        moveNovoElemento('c', 7, new Torre(tabuleiro, Cor.Preto));
        moveNovoElemento('c', 8, new Torre(tabuleiro, Cor.Preto));
        moveNovoElemento('d', 7, new Torre(tabuleiro, Cor.Preto));
        moveNovoElemento('e', 7, new Torre(tabuleiro, Cor.Preto));
        moveNovoElemento('e', 8, new Torre(tabuleiro, Cor.Preto));
        moveNovoElemento('d', 8, new Rei(tabuleiro, Cor.Preto));
	}
}
