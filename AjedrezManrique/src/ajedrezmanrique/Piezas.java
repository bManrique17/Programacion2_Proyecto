package ajedrezmanrique;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public abstract class Piezas {

    protected int jugador;
    protected ImageIcon mascaraPieza;
    
    public Piezas() {
    }

    public int getJugador() {
        return jugador;
    }
    
    public Piezas(int jugador) {
        this.jugador = jugador;
        setMascaraPieza(jugador);
    }

    public int convertirCoordenadas(JButton casilla, String aRecibir){
        String nombre = casilla.getName();
        int FF = Integer.parseInt(nombre.substring(0,nombre.indexOf(",")));
        int CC = Integer.parseInt(nombre.substring(nombre.indexOf(",")+1,nombre.length()));       
        if(aRecibir.equalsIgnoreCase("fila"))
            return FF;
        else
            return CC;
    }
    
    public abstract ImageIcon getMascaraPieza();
    public abstract void setMascaraPieza(int jugador);
    public abstract boolean ValidarMovimiento(JButton posActual,JButton posDestino,String[][]tablero,int jugador);

}
