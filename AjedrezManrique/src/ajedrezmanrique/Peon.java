package ajedrezmanrique;

import javax.swing.ImageIcon;
import javax.swing.JButton;

class Peon extends Piezas {

    public Peon(int jugador) {
        super(jugador);
    }

    @Override
    public void setMascaraPieza(int jugador) {
        if (jugador == 1) {
            mascaraPieza = new ImageIcon(getClass().getResource("/Imagenes/peonBB.png"));
        } else {
            mascaraPieza = new ImageIcon(getClass().getResource("/Imagenes/peonNN.png"));
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
        if (tablero[posDDf][posDDc].equals(" ")) {

            if (jugador == 1) {
                //-------------

                return (posDDc == posAAc) && ((posDDf == posAAf - 1) || (posDDf == posAAf - 2 && posAAf == 6));

                //------------
            } else {
                //-------------

                return (posDDc == posAAc) && ((posDDf == posAAf + 1) || (posDDf == posAAf + 2 && posAAf == 1));

                //------------
            }

        } else {
            if (jugador == 1) {
                //-------------

                return (posDDc == posAAc+1 || posDDc == posAAc-1) && (posDDf == posAAf - 1);

                //------------
            } else {
                //-------------

                return (posDDc == posAAc+1 || posDDc == posAAc-1) && (posDDf == posAAf + 1);

                //------------
            }
        }
        
    }
}
