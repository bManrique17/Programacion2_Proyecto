package ajedrezmanrique;

import javax.swing.ImageIcon;
import javax.swing.JButton;

class Alfil extends Piezas {

    public Alfil(int jugador) {
        super(jugador);
    }

    @Override
    public void setMascaraPieza(int jugador) {
        if (jugador == 1) {
            mascaraPieza = new ImageIcon(getClass().getResource("/Imagenes/alfilBB.png"));
        } else {
            mascaraPieza = new ImageIcon(getClass().getResource("/Imagenes/alfilNN.png"));
        }
    }

    @Override
    public ImageIcon getMascaraPieza() {
        return mascaraPieza;
    }

    @Override
    public boolean ValidarMovimiento(JButton posActual, JButton posDestino, String[][] tablero, int jugador) {

        int posAAf = super.convertirCoordenadas(posActual, "fila");
        int posAAc = super.convertirCoordenadas(posActual, "columna");
        int posDDf = super.convertirCoordenadas(posDestino, "fila");
        int posDDc = super.convertirCoordenadas(posDestino, "columna");

        int mayorC, mayorF, menorC, menorF;
        if ((posAAf > posDDf && posAAc > posDDc) || (posAAf < posDDf && posAAc < posDDc)) {
            if (posAAf > posDDf) {
                mayorF = posAAf;
                menorF = posDDf;
                mayorC = posAAc;
                menorC = posDDc;
            } else {
                mayorF = posDDf;
                menorF = posAAf;
                mayorC = posDDc;
                menorC = posAAc;
            }

            for (int i = menorF + 1; i < mayorF; i++) {
                for (int j = menorC + 1; j < mayorC; j++) {
                    if (i - menorF == j - menorC) {
                        if (!tablero[i][j].equals(" ")) {
                            return false;
                        }
                    }
                }
            }

        } else {
            if ((posAAf < posDDf && posAAc > posDDc) || (posAAf > posDDf && posAAc < posDDc)) {
                if (posAAf > posDDf) {
                    mayorF = posAAf;
                    menorF = posDDf;
                    menorC = posAAc;
                    mayorC = posDDc;
                } else {
                    mayorF = posDDf;
                    menorF = posAAf;
                    menorC = posDDc;
                    mayorC = posAAc;
                }
                
                for (int i = menorF+1; i < mayorF; i++) {
                    for (int j = menorC+1; j < mayorC; j++) {
                        if(i - menorF == (mayorF-menorF)-(j - menorC)){
                            if(!tablero[i][j].equals(" "))
                                return false;
                        }
                    }
                }
            }
        }
        return posAAf - posDDf == posAAc - posDDc || posAAf - posDDf == (-1) * (posAAc - posDDc);

    }

}
