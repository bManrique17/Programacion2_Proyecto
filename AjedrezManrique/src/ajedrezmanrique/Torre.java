package ajedrezmanrique;

import javax.swing.ImageIcon;
import javax.swing.JButton;

class Torre extends Piezas {

    public Torre(int jugador) {
        super(jugador);
    }

    @Override
    public void setMascaraPieza(int jugador) {
        if (jugador == 1) {
            mascaraPieza = new ImageIcon(getClass().getResource("/Imagenes/torreBB.png"));
        } else {
            mascaraPieza = new ImageIcon(getClass().getResource("/Imagenes/torreNN.png"));
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
        return ((posDDc == posAAc && posDDf != posAAf) || (posDDf == posAAf && posDDc != posAAc)) && caminoLibre(posAAf, posDDf, posAAc, posDDc, tablero);
    }

    public boolean caminoLibre(int filaII, int filaFF, int columnaII, int columnaFF, String[][] tablero) {
        if (filaII == filaFF) {
            if (columnaII < columnaFF) {
                for (int i = columnaII + 1; i < columnaFF; i++) {
                    if (!tablero[filaII][i].equals(" ")) {
                        return false;
                    }
                }
                return true;
            } else {
                for (int i = columnaFF + 1; i < columnaII; i++) {
                    if (!tablero[filaII][i].equals(" ")) {
                        return false;
                    }
                }
                return true;
            }

        } else {
            if (filaII < filaFF) {
                for (int i = filaII + 1; i < filaFF; i++) {
                    if (!tablero[i][columnaII].equals(" ")) {
                        return false;
                    }
                }
                return true;
            } else {
                for (int i = filaFF + 1; i < filaII; i++) {
                    if (!tablero[i][columnaII].equals(" ")) {
                        return false;
                    }
                }
                return true;
            }
            
        }
    }
    
    
}
