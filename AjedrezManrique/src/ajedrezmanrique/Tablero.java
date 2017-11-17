package ajedrezmanrique;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public final class Tablero extends javax.swing.JFrame {

    JButton Arreglo[][] = new JButton[8][8];
    String tableroString[][] = new String[8][8];

    Piezas peon1 = new Peon(1);
    Piezas peon2 = new Peon(2);
    Piezas torre1 = new Torre(1);
    Piezas torre2 = new Torre(2);
    Piezas caballo1 = new Caballo(1);
    Piezas caballo2 = new Caballo(2);
    Piezas rey1 = new Rey(1);
    Piezas rey2 = new Rey(2);
    Piezas reina1 = new Reina(1);
    Piezas reina2 = new Reina(2);
    Piezas alfil1 = new Alfil(1);
    Piezas alfil2 = new Alfil(2);

    Piezas listPiezas[][] = new Piezas[2][6];

    JButton posActual = new JButton();
    JButton posDestino = new JButton();

    int cont, turno;

    public Tablero() {

        initComponents();

    }

    public void LlenarArreglo() {
        listPiezas[0][0] = peon1;
        listPiezas[0][2] = torre1;
        listPiezas[0][4] = caballo1;
        listPiezas[0][1] = rey1;
        listPiezas[0][3] = reina1;
        listPiezas[0][5] = alfil1;

        listPiezas[1][0] = peon2;
        listPiezas[1][2] = torre2;
        listPiezas[1][4] = caballo2;
        listPiezas[1][1] = rey2;
        listPiezas[1][3] = reina2;
        listPiezas[1][5] = alfil2;

        Arreglo[0][0] = CERO_CERO;
        Arreglo[0][1] = CERO_UNO;
        Arreglo[0][2] = CERO_DOS;
        Arreglo[0][3] = CERO_TRES;
        Arreglo[0][4] = CERO_CUATRO;
        Arreglo[0][5] = CERO_CINCO;
        Arreglo[0][6] = CERO_SEIS;
        Arreglo[0][7] = CERO_SIETE;
        Arreglo[1][0] = UNO_CERO;
        Arreglo[1][1] = UNO_UNO;
        Arreglo[1][2] = UNO_DOS;
        Arreglo[1][3] = UNO_TRES;
        Arreglo[1][4] = UNO_CUATRO;
        Arreglo[1][5] = UNO_CINCO;
        Arreglo[1][6] = UNO_SEIS;
        Arreglo[1][7] = UNO_SIETE;
        Arreglo[2][0] = DOS_CERO;
        Arreglo[2][1] = DOS_UNO;
        Arreglo[2][2] = DOS_DOS;
        Arreglo[2][3] = DOS_TRES;
        Arreglo[2][4] = DOS_CUATRO;
        Arreglo[2][5] = DOS_CINCO;
        Arreglo[2][6] = DOS_SEIS;
        Arreglo[2][7] = DOS_SIETE;
        Arreglo[3][0] = TRES_CERO;
        Arreglo[3][1] = TRES_UNO;
        Arreglo[3][2] = TRES_DOS;
        Arreglo[3][3] = TRES_TRES;
        Arreglo[3][4] = TRES_CUATRO;
        Arreglo[3][5] = TRES_CINCO;
        Arreglo[3][6] = TRES_SEIS;
        Arreglo[3][7] = TRES_SIETE;
        Arreglo[4][0] = CUATRO_CERO;
        Arreglo[4][1] = CUATRO_UNO;
        Arreglo[4][2] = CUATRO_DOS;
        Arreglo[4][3] = CUATRO_TRES;
        Arreglo[4][4] = CUATRO_CUATRO;
        Arreglo[4][5] = CUATRO_CINCO;
        Arreglo[4][6] = CUATRO_SEIS;
        Arreglo[4][7] = CUATRO_SIETE;
        Arreglo[5][0] = CINCO_CERO;
        Arreglo[5][1] = CINCO_UNO;
        Arreglo[5][2] = CINCO_DOS;
        Arreglo[5][3] = CINCO_TRES;
        Arreglo[5][4] = CINCO_CUATRO;
        Arreglo[5][5] = CINCO_CINCO;
        Arreglo[5][6] = CINCO_SEIS;
        Arreglo[5][7] = CINCO_SIETE;
        Arreglo[6][0] = SEIS_CERO;
        Arreglo[6][1] = SEIS_UNO;
        Arreglo[6][2] = SEIS_DOS;
        Arreglo[6][3] = SEIS_TRES;
        Arreglo[6][4] = SEIS_CUATRO;
        Arreglo[6][5] = SEIS_CINCO;
        Arreglo[6][6] = SEIS_SEIS;
        Arreglo[6][7] = SEIS_SIETE;
        Arreglo[7][0] = SIETE_CERO;
        Arreglo[7][1] = SIETE_UNO;
        Arreglo[7][2] = SIETE_DOS;
        Arreglo[7][3] = SIETE_TRES;
        Arreglo[7][4] = SIETE_CUATRO;
        Arreglo[7][5] = SIETE_CINCO;
        Arreglo[7][6] = SIETE_SEIS;
        Arreglo[7][7] = SIETE_SIETE;

    }//fin llenar el arreglo con las casillas

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CERO_UNO = new javax.swing.JButton();
        CERO_CERO = new javax.swing.JButton();
        CERO_DOS = new javax.swing.JButton();
        CERO_TRES = new javax.swing.JButton();
        CERO_CUATRO = new javax.swing.JButton();
        CERO_CINCO = new javax.swing.JButton();
        CERO_SEIS = new javax.swing.JButton();
        CERO_SIETE = new javax.swing.JButton();
        UNO_CERO = new javax.swing.JButton();
        UNO_UNO = new javax.swing.JButton();
        UNO_DOS = new javax.swing.JButton();
        UNO_TRES = new javax.swing.JButton();
        UNO_CUATRO = new javax.swing.JButton();
        UNO_CINCO = new javax.swing.JButton();
        UNO_SEIS = new javax.swing.JButton();
        UNO_SIETE = new javax.swing.JButton();
        DOS_SIETE = new javax.swing.JButton();
        DOS_CINCO = new javax.swing.JButton();
        DOS_TRES = new javax.swing.JButton();
        DOS_CERO = new javax.swing.JButton();
        DOS_DOS = new javax.swing.JButton();
        DOS_UNO = new javax.swing.JButton();
        DOS_CUATRO = new javax.swing.JButton();
        DOS_SEIS = new javax.swing.JButton();
        TRES_SIETE = new javax.swing.JButton();
        TRES_DOS = new javax.swing.JButton();
        TRES_CUATRO = new javax.swing.JButton();
        TRES_CINCO = new javax.swing.JButton();
        TRES_SEIS = new javax.swing.JButton();
        TRES_CERO = new javax.swing.JButton();
        TRES_TRES = new javax.swing.JButton();
        TRES_UNO = new javax.swing.JButton();
        CUATRO_CERO = new javax.swing.JButton();
        CUATRO_DOS = new javax.swing.JButton();
        CUATRO_SIETE = new javax.swing.JButton();
        CUATRO_CINCO = new javax.swing.JButton();
        CUATRO_UNO = new javax.swing.JButton();
        CUATRO_SEIS = new javax.swing.JButton();
        CUATRO_CUATRO = new javax.swing.JButton();
        CUATRO_TRES = new javax.swing.JButton();
        CINCO_TRES = new javax.swing.JButton();
        CINCO_CERO = new javax.swing.JButton();
        CINCO_SIETE = new javax.swing.JButton();
        CINCO_DOS = new javax.swing.JButton();
        CINCO_CUATRO = new javax.swing.JButton();
        CINCO_UNO = new javax.swing.JButton();
        CINCO_SEIS = new javax.swing.JButton();
        CINCO_CINCO = new javax.swing.JButton();
        SEIS_CINCO = new javax.swing.JButton();
        SEIS_TRES = new javax.swing.JButton();
        SEIS_CERO = new javax.swing.JButton();
        SEIS_SEIS = new javax.swing.JButton();
        SEIS_DOS = new javax.swing.JButton();
        SEIS_UNO = new javax.swing.JButton();
        SEIS_SIETE = new javax.swing.JButton();
        SEIS_CUATRO = new javax.swing.JButton();
        SIETE_SIETE = new javax.swing.JButton();
        SIETE_TRES = new javax.swing.JButton();
        SIETE_CERO = new javax.swing.JButton();
        SIETE_DOS = new javax.swing.JButton();
        SIETE_CINCO = new javax.swing.JButton();
        SIETE_SEIS = new javax.swing.JButton();
        SIETE_CUATRO = new javax.swing.JButton();
        SIETE_UNO = new javax.swing.JButton();
        TURNO = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 153));

        CERO_UNO.setBackground(new java.awt.Color(134, 55, 13));
        CERO_UNO.setName("0,1"); // NOI18N
        CERO_UNO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        CERO_CERO.setBackground(new java.awt.Color(255, 204, 153));
        CERO_CERO.setName("0,0"); // NOI18N
        CERO_CERO.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                CERO_CEROAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        CERO_CERO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        CERO_DOS.setBackground(new java.awt.Color(255, 204, 153));
        CERO_DOS.setName("0,2"); // NOI18N
        CERO_DOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        CERO_TRES.setBackground(new java.awt.Color(134, 55, 13));
        CERO_TRES.setName("0,3"); // NOI18N
        CERO_TRES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        CERO_CUATRO.setBackground(new java.awt.Color(255, 204, 153));
        CERO_CUATRO.setName("0,4"); // NOI18N
        CERO_CUATRO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        CERO_CINCO.setBackground(new java.awt.Color(134, 55, 13));
        CERO_CINCO.setName("0,5"); // NOI18N
        CERO_CINCO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        CERO_SEIS.setBackground(new java.awt.Color(255, 204, 153));
        CERO_SEIS.setName("0,6"); // NOI18N
        CERO_SEIS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        CERO_SIETE.setBackground(new java.awt.Color(134, 55, 13));
        CERO_SIETE.setName("0,7"); // NOI18N
        CERO_SIETE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        UNO_CERO.setBackground(new java.awt.Color(134, 55, 13));
        UNO_CERO.setName("1,0"); // NOI18N
        UNO_CERO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        UNO_UNO.setBackground(new java.awt.Color(255, 204, 153));
        UNO_UNO.setName("1,1"); // NOI18N
        UNO_UNO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        UNO_DOS.setBackground(new java.awt.Color(134, 55, 13));
        UNO_DOS.setName("1,2"); // NOI18N
        UNO_DOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        UNO_TRES.setBackground(new java.awt.Color(255, 204, 153));
        UNO_TRES.setName("1,3"); // NOI18N
        UNO_TRES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        UNO_CUATRO.setBackground(new java.awt.Color(134, 55, 13));
        UNO_CUATRO.setName("1,4"); // NOI18N
        UNO_CUATRO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        UNO_CINCO.setBackground(new java.awt.Color(255, 204, 153));
        UNO_CINCO.setName("1,5"); // NOI18N
        UNO_CINCO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        UNO_SEIS.setBackground(new java.awt.Color(134, 55, 13));
        UNO_SEIS.setName("1,6"); // NOI18N
        UNO_SEIS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        UNO_SIETE.setBackground(new java.awt.Color(255, 204, 153));
        UNO_SIETE.setName("1,7"); // NOI18N
        UNO_SIETE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        DOS_SIETE.setBackground(new java.awt.Color(134, 55, 13));
        DOS_SIETE.setName("2,7"); // NOI18N
        DOS_SIETE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        DOS_CINCO.setBackground(new java.awt.Color(134, 55, 13));
        DOS_CINCO.setName("2,5"); // NOI18N
        DOS_CINCO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        DOS_TRES.setBackground(new java.awt.Color(134, 55, 13));
        DOS_TRES.setName("2,3"); // NOI18N
        DOS_TRES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        DOS_CERO.setBackground(new java.awt.Color(255, 204, 153));
        DOS_CERO.setName("2,0"); // NOI18N
        DOS_CERO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        DOS_DOS.setBackground(new java.awt.Color(255, 204, 153));
        DOS_DOS.setName("2,2"); // NOI18N
        DOS_DOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        DOS_UNO.setBackground(new java.awt.Color(134, 55, 13));
        DOS_UNO.setName("2,1"); // NOI18N
        DOS_UNO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        DOS_CUATRO.setBackground(new java.awt.Color(255, 204, 153));
        DOS_CUATRO.setName("2,4"); // NOI18N
        DOS_CUATRO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        DOS_SEIS.setBackground(new java.awt.Color(255, 204, 153));
        DOS_SEIS.setName("2,6"); // NOI18N
        DOS_SEIS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        TRES_SIETE.setBackground(new java.awt.Color(255, 204, 153));
        TRES_SIETE.setName("3,7"); // NOI18N
        TRES_SIETE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        TRES_DOS.setBackground(new java.awt.Color(134, 55, 13));
        TRES_DOS.setName("3,2"); // NOI18N
        TRES_DOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        TRES_CUATRO.setBackground(new java.awt.Color(134, 55, 13));
        TRES_CUATRO.setName("3,4"); // NOI18N
        TRES_CUATRO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        TRES_CINCO.setBackground(new java.awt.Color(255, 204, 153));
        TRES_CINCO.setName("3,5"); // NOI18N
        TRES_CINCO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        TRES_SEIS.setBackground(new java.awt.Color(134, 55, 13));
        TRES_SEIS.setName("3,6"); // NOI18N
        TRES_SEIS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        TRES_CERO.setBackground(new java.awt.Color(134, 55, 13));
        TRES_CERO.setName("3,0"); // NOI18N
        TRES_CERO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        TRES_TRES.setBackground(new java.awt.Color(255, 204, 153));
        TRES_TRES.setName("3,3"); // NOI18N
        TRES_TRES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        TRES_UNO.setBackground(new java.awt.Color(255, 204, 153));
        TRES_UNO.setName("3,1"); // NOI18N
        TRES_UNO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        CUATRO_CERO.setBackground(new java.awt.Color(255, 204, 153));
        CUATRO_CERO.setName("4,0"); // NOI18N
        CUATRO_CERO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        CUATRO_DOS.setBackground(new java.awt.Color(255, 204, 153));
        CUATRO_DOS.setName("4,2"); // NOI18N
        CUATRO_DOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        CUATRO_SIETE.setBackground(new java.awt.Color(134, 55, 13));
        CUATRO_SIETE.setName("4,7"); // NOI18N
        CUATRO_SIETE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        CUATRO_CINCO.setBackground(new java.awt.Color(134, 55, 13));
        CUATRO_CINCO.setName("4,5"); // NOI18N
        CUATRO_CINCO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        CUATRO_UNO.setBackground(new java.awt.Color(134, 55, 13));
        CUATRO_UNO.setName("4,1"); // NOI18N
        CUATRO_UNO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        CUATRO_SEIS.setBackground(new java.awt.Color(255, 204, 153));
        CUATRO_SEIS.setName("4,6"); // NOI18N
        CUATRO_SEIS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        CUATRO_CUATRO.setBackground(new java.awt.Color(255, 204, 153));
        CUATRO_CUATRO.setName("4,4"); // NOI18N
        CUATRO_CUATRO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        CUATRO_TRES.setBackground(new java.awt.Color(134, 55, 13));
        CUATRO_TRES.setName("4,3"); // NOI18N
        CUATRO_TRES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        CINCO_TRES.setBackground(new java.awt.Color(255, 204, 153));
        CINCO_TRES.setName("5,3"); // NOI18N
        CINCO_TRES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        CINCO_CERO.setBackground(new java.awt.Color(134, 55, 13));
        CINCO_CERO.setName("5,0"); // NOI18N
        CINCO_CERO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        CINCO_SIETE.setBackground(new java.awt.Color(255, 204, 153));
        CINCO_SIETE.setName("5,7"); // NOI18N
        CINCO_SIETE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        CINCO_DOS.setBackground(new java.awt.Color(134, 55, 13));
        CINCO_DOS.setName("5,2"); // NOI18N
        CINCO_DOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        CINCO_CUATRO.setBackground(new java.awt.Color(134, 55, 13));
        CINCO_CUATRO.setName("5,4"); // NOI18N
        CINCO_CUATRO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        CINCO_UNO.setBackground(new java.awt.Color(255, 204, 153));
        CINCO_UNO.setName("5,1"); // NOI18N
        CINCO_UNO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        CINCO_SEIS.setBackground(new java.awt.Color(134, 55, 13));
        CINCO_SEIS.setName("5,6"); // NOI18N
        CINCO_SEIS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        CINCO_CINCO.setBackground(new java.awt.Color(255, 204, 153));
        CINCO_CINCO.setName("5,5"); // NOI18N
        CINCO_CINCO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        SEIS_CINCO.setBackground(new java.awt.Color(134, 55, 13));
        SEIS_CINCO.setName("6,5"); // NOI18N
        SEIS_CINCO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        SEIS_TRES.setBackground(new java.awt.Color(134, 55, 13));
        SEIS_TRES.setName("6,3"); // NOI18N
        SEIS_TRES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        SEIS_CERO.setBackground(new java.awt.Color(255, 204, 153));
        SEIS_CERO.setName("6,0"); // NOI18N
        SEIS_CERO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        SEIS_SEIS.setBackground(new java.awt.Color(255, 204, 153));
        SEIS_SEIS.setName("6,6"); // NOI18N
        SEIS_SEIS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        SEIS_DOS.setBackground(new java.awt.Color(255, 204, 153));
        SEIS_DOS.setName("6,2"); // NOI18N
        SEIS_DOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        SEIS_UNO.setBackground(new java.awt.Color(134, 55, 13));
        SEIS_UNO.setName("6,1"); // NOI18N
        SEIS_UNO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        SEIS_SIETE.setBackground(new java.awt.Color(134, 55, 13));
        SEIS_SIETE.setName("6,7"); // NOI18N
        SEIS_SIETE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        SEIS_CUATRO.setBackground(new java.awt.Color(255, 204, 153));
        SEIS_CUATRO.setName("6,4"); // NOI18N
        SEIS_CUATRO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        SIETE_SIETE.setBackground(new java.awt.Color(255, 204, 153));
        SIETE_SIETE.setName("7,7"); // NOI18N
        SIETE_SIETE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        SIETE_TRES.setBackground(new java.awt.Color(255, 204, 153));
        SIETE_TRES.setName("7,3"); // NOI18N
        SIETE_TRES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        SIETE_CERO.setBackground(new java.awt.Color(134, 55, 13));
        SIETE_CERO.setName("7,0"); // NOI18N
        SIETE_CERO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        SIETE_DOS.setBackground(new java.awt.Color(134, 55, 13));
        SIETE_DOS.setName("7,2"); // NOI18N
        SIETE_DOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        SIETE_CINCO.setBackground(new java.awt.Color(255, 204, 153));
        SIETE_CINCO.setName("7,5"); // NOI18N
        SIETE_CINCO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        SIETE_SEIS.setBackground(new java.awt.Color(134, 55, 13));
        SIETE_SEIS.setName("7,6"); // NOI18N
        SIETE_SEIS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        SIETE_CUATRO.setBackground(new java.awt.Color(134, 55, 13));
        SIETE_CUATRO.setName("7,4"); // NOI18N
        SIETE_CUATRO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        SIETE_UNO.setBackground(new java.awt.Color(255, 204, 153));
        SIETE_UNO.setName("7,1"); // NOI18N
        SIETE_UNO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mover(evt);
            }
        });

        TURNO.setBackground(new java.awt.Color(255, 51, 0));
        TURNO.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        TURNO.setForeground(new java.awt.Color(255, 51, 0));
        TURNO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TURNO.setText("jLabel2");
        TURNO.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(234, 48, 9));
        jLabel2.setText("Manrique's games");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SEIS_CERO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(SEIS_UNO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(SEIS_DOS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(SEIS_TRES, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(SEIS_CUATRO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(SEIS_CINCO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(SEIS_SEIS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(SEIS_SIETE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UNO_CERO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(UNO_UNO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(UNO_DOS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(UNO_TRES, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(UNO_CUATRO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(UNO_CINCO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(UNO_SEIS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(UNO_SIETE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CERO_CERO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(CERO_UNO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(CERO_DOS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(CERO_TRES, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(CERO_CUATRO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(CERO_CINCO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(CERO_SEIS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(CERO_SIETE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SIETE_CERO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(SIETE_UNO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(SIETE_DOS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(SIETE_TRES, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(SIETE_CUATRO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(SIETE_CINCO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(SIETE_SEIS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(SIETE_SIETE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DOS_CERO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(DOS_UNO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(DOS_DOS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(DOS_TRES, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(DOS_CUATRO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(DOS_CINCO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(DOS_SEIS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(DOS_SIETE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TRES_CERO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(TRES_UNO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(TRES_DOS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(TRES_TRES, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(TRES_CUATRO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(TRES_CINCO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(TRES_SEIS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(TRES_SIETE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CUATRO_CERO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(CUATRO_UNO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(CUATRO_DOS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(CUATRO_TRES, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(CUATRO_CUATRO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(CUATRO_CINCO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(CUATRO_SEIS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(CUATRO_SIETE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CINCO_CERO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(CINCO_UNO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(CINCO_DOS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(CINCO_TRES, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(CINCO_CUATRO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(CINCO_CINCO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(CINCO_SEIS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(CINCO_SIETE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TURNO, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(225, 225, 225))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CERO_CERO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CERO_UNO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CERO_DOS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CERO_TRES, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CERO_CUATRO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CERO_CINCO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CERO_SEIS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CERO_SIETE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UNO_CERO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UNO_UNO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UNO_DOS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UNO_TRES, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UNO_CUATRO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UNO_CINCO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UNO_SEIS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UNO_SIETE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DOS_CERO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DOS_UNO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DOS_DOS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DOS_TRES, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DOS_CUATRO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DOS_CINCO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DOS_SEIS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DOS_SIETE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TRES_CERO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TRES_UNO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TRES_DOS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TRES_TRES, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TRES_CUATRO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TRES_CINCO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TRES_SEIS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TRES_SIETE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CUATRO_CERO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CUATRO_UNO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CUATRO_DOS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CUATRO_TRES, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CUATRO_CUATRO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CUATRO_CINCO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CUATRO_SEIS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CUATRO_SIETE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CINCO_CERO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CINCO_UNO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CINCO_DOS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CINCO_TRES, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CINCO_CUATRO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CINCO_CINCO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CINCO_SEIS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CINCO_SIETE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SEIS_CERO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SEIS_UNO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SEIS_DOS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SEIS_TRES, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SEIS_CUATRO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SEIS_CINCO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SEIS_SEIS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SEIS_SIETE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SIETE_CERO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SIETE_UNO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SIETE_DOS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SIETE_TRES, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SIETE_CUATRO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SIETE_CINCO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SIETE_SEIS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SIETE_SIETE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(TURNO, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //RECURSIVA 1
    public void llenarTTString(int fila, int columna, String[][] tablero) {
        if (fila < 8) {
            if (columna < 8) {
                tablero[fila][columna] = " ";
                columna++;
                llenarTTString(fila, columna, tablero);
            } else {
                columna = 0;
                fila++;
                llenarTTString(fila, columna, tablero);
            }
        }
    }

    private void CERO_CEROAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_CERO_CEROAncestorAdded
        turno = 1;
        llenarTTString(0, 0, tableroString);
        LlenarArreglo();
        tableroDefecto(0, 0);
        TURNO.setText("Turno: Jugador " + turno);
    }//GEN-LAST:event_CERO_CEROAncestorAdded

    private void mover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mover
        

        if (cont == 0 && ((JButton) (evt.getComponent())).getIcon() != null && tipoPieza(((JButton) (evt.getComponent()))).getJugador() == turno) {
            posActual = ((JButton) (evt.getComponent()));
            cont++;

        } else {

            if (((JButton) (evt.getComponent())) != posActual && cont > 0
                    && ((((JButton) (evt.getComponent())).getIcon() == null) || (tipoPieza(posActual).getJugador() != tipoPieza(((JButton) (evt.getComponent()))).getJugador()))) {
                posDestino = ((JButton) (evt.getComponent()));
                cont = 0;

                if (tipoPieza(posActual).ValidarMovimiento(posActual, posDestino, tableroString, turno)) {
                    String piezaTEMP = tableroString[convertirCoordenadas(posActual, "fila")][convertirCoordenadas(posActual, "CC")];
                    tableroString[convertirCoordenadas(posActual, "fila")][convertirCoordenadas(posActual, "CC")] = " ";
                    tableroString[convertirCoordenadas(posDestino, "fila")][convertirCoordenadas(posDestino, "CC")] = piezaTEMP;
                    posDestino.setIcon(posActual.getIcon());
                    posActual.setIcon(null);
                    if (turno == 1) {
                        HACKE();
                        turno++;
                        TURNO.setText("Turno: Jugador " + turno);
                    } else {
                        HACKE();
                        turno = 1;
                        TURNO.setText("Turno: Jugador " + turno);
                    }
                    if (!finDelJuego()) {
                        if (turno == 2) {
                            JOptionPane.showMessageDialog(this, "Fin del juego, ha ganado equipo Blanco");
                        } else {
                            JOptionPane.showMessageDialog(this, "Fin del juego, ha ganado equipo Negro");
                        }
                        String resp = JOptionPane.showInputDialog(this, "Desea jugar de nuevo [S/N]");
                        if (resp.equalsIgnoreCase("s")) {
                            turno = 1;
                            for (int i = 0; i < 8; i++) {
                                for (int j = 0; j < 8; j++) {
                                    Arreglo[i][j].setIcon(null);
                                    tableroString[i][j] = " ";
                                }
                            }
                            llenarTTString(0, 0, tableroString);
                            LlenarArreglo();
                            tableroDefecto(0, 0);

                        } else {
                            System.exit(0);
                        }
                    }
                    convertirPeon();

                }

            }
        }
        

    }//GEN-LAST:event_mover

    public void convertirPeon() {
        String resp;
        int i;
        if (turno == 2) {
            for (i = 0; i < 8; i++) {
                if (tableroString[0][i].equals("p1")) {
                    do {
                        resp = JOptionPane.showInputDialog(this, "**Seleccione que pieza desea\n"
                                + "(1)Reina\n"
                                + "(2)Alfil\n"
                                + "(3)Caballo\n"
                                + "(4)Torre\n");
                        switch (resp) {
                            case "1":
                                Arreglo[0][i].setIcon(reina1.getMascaraPieza());
                                tableroString[0][i] = "r1";
                                break;
                            case "2":
                                Arreglo[0][i].setIcon(alfil1.getMascaraPieza());
                                tableroString[0][i] = "a1";
                                break;
                            case "3":
                                Arreglo[0][i].setIcon(caballo1.getMascaraPieza());
                                tableroString[0][i] = "c1";
                                break;
                            case "4":
                                Arreglo[0][i].setIcon(torre1.getMascaraPieza());
                                tableroString[0][i] = "t1";
                                break;

                        }
                    } while (!resp.equals("1") && !resp.equals("2") && !resp.equals("3") && !resp.equals("4"));
                }

            }
        } else {
            for (i = 0; i < 8; i++) {
                if (tableroString[7][i].equals("p2")) {
                    do {
                        resp = JOptionPane.showInputDialog(this, "**Seleccione que pieza desea\n"
                                + "(1)Reina\n"
                                + "(2)Alfil\n"
                                + "(3)Caballo\n"
                                + "(4)Torre\n");
                        switch (resp) {
                            case "1":
                                Arreglo[7][i].setIcon(reina2.getMascaraPieza());
                                tableroString[7][i] = "r2";
                                break;
                            case "2":
                                Arreglo[7][i].setIcon(alfil2.getMascaraPieza());
                                tableroString[7][i] = "a2";
                                break;
                            case "3":
                                Arreglo[7][i].setIcon(caballo2.getMascaraPieza());
                                tableroString[7][i] = "c2";
                                break;
                            case "4":
                                Arreglo[7][i].setIcon(torre2.getMascaraPieza());
                                tableroString[7][i] = "t2";
                                break;

                        }
                    } while (!resp.equals("1") && !resp.equals("2") && !resp.equals("3") && !resp.equals("4"));
                }

            }
        }
    }

    public boolean finDelJuego() {
        int cont = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (tableroString[i][j].equals("R1") || tableroString[i][j].equals("R2")) {
                    cont++;
                }
            }
        }
        return cont == 2;
    }

    
    public int convertirCoordenadas(JButton casilla, String aRecibir) {
        String nombre = casilla.getName();
        int FF = Integer.parseInt(nombre.substring(0, nombre.indexOf(",")));
        int CC = Integer.parseInt(nombre.substring(nombre.indexOf(",") + 1, nombre.length()));
        if (aRecibir.equalsIgnoreCase("fila")) {
            return FF;
        } else {
            return CC;
        }
    }

    public Piezas tipoPieza(JButton casilla) {
        if (casilla.getIcon() == peon1.getMascaraPieza()) {
            return peon1;
        } else if (casilla.getIcon() == alfil1.getMascaraPieza()) {
            return alfil1;
        } else if (casilla.getIcon() == alfil2.getMascaraPieza()) {
            return alfil2;
        } else if (casilla.getIcon() == peon2.getMascaraPieza()) {
            return peon2;
        } else if (casilla.getIcon() == caballo1.getMascaraPieza()) {
            return caballo1;
        } else if (casilla.getIcon() == caballo2.getMascaraPieza()) {
            return caballo2;
        } else if (casilla.getIcon() == torre1.getMascaraPieza()) {
            return torre1;
        } else if (casilla.getIcon() == torre2.getMascaraPieza()) {
            return torre2;
        } else if (casilla.getIcon() == rey1.getMascaraPieza()) {
            return rey1;
        } else if (casilla.getIcon() == rey2.getMascaraPieza()) {
            return rey2;
        } else if (casilla.getIcon() == reina1.getMascaraPieza()) {
            return reina1;
        } else if (casilla.getIcon() == reina2.getMascaraPieza()) {
            return reina2;
        } else {
            return null;
        }
    }
    
    //RECURSIVA 2
    public void tableroDefecto(int fila, int columna) {
        if (fila < 8) {
            if (columna < 8) {

                if (fila == 1) {
                    Arreglo[fila][columna].setIcon(peon2.getMascaraPieza());
                    tableroString[fila][columna] = "p2";
                }
                if (fila == 6) {
                    Arreglo[fila][columna].setIcon(peon1.getMascaraPieza());
                    tableroString[fila][columna] = "p1";
                }
                if (fila == 0 && (columna == 0 || columna == 7)) {
                    Arreglo[fila][columna].setIcon(torre2.getMascaraPieza());
                    tableroString[fila][columna] = "t2";
                }
                if (fila == 7 && (columna == 0 || columna == 7)) {
                    Arreglo[fila][columna].setIcon(torre1.getMascaraPieza());
                    tableroString[fila][columna] = "t1";
                }
                if (fila == 0 && (columna == 1 || columna == 6)) {
                    Arreglo[fila][columna].setIcon(caballo2.getMascaraPieza());
                    tableroString[fila][columna] = "c2";
                }
                if (fila == 7 && (columna == 1 || columna == 6)) {
                    Arreglo[fila][columna].setIcon(caballo1.getMascaraPieza());
                    tableroString[fila][columna] = "c1";
                }
                if (fila == 0 && (columna == 2 || columna == 5)) {
                    Arreglo[fila][columna].setIcon(alfil2.getMascaraPieza());
                    tableroString[fila][columna] = "a2";
                }
                if (fila == 7 && (columna == 2 || columna == 5)) {
                    Arreglo[fila][columna].setIcon(alfil1.getMascaraPieza());
                    tableroString[fila][columna] = "a1";
                }

                if (fila == 0 && columna == 3) {
                    Arreglo[fila][columna].setIcon(rey2.getMascaraPieza());
                    tableroString[fila][columna] = "R2";
                }
                if (fila == 7 && columna == 3) {
                    Arreglo[fila][columna].setIcon(rey1.getMascaraPieza());
                    tableroString[fila][columna] = "R1";
                }

                if (fila == 0 && columna == 4) {
                    Arreglo[fila][columna].setIcon(reina2.getMascaraPieza());
                    tableroString[fila][columna] = "r2";
                }
                if (fila == 7 && columna == 4) {
                    Arreglo[fila][columna].setIcon(reina1.getMascaraPieza());
                    tableroString[fila][columna] = "r1";
                }

                columna++;
                tableroDefecto(fila, columna);
            } else {
                columna = 0;
                fila++;
                tableroDefecto(fila, columna);
            }

        }
    }

    public void HACKE() {
        try {

            for (int i = 0; i < 6; i++) {
                if (listPiezas[0][i].ValidarMovimiento(getPosicion(listPiezas[0][i]), getPosicion(rey2), tableroString, turno)) {
                    JOptionPane.showMessageDialog(null, "HACKE");
                    break;
                }
            }

            for (int i = 0; i < 6; i++) {
                if (listPiezas[1][i].ValidarMovimiento(getPosicion(listPiezas[1][i]), getPosicion(rey1), tableroString, turno)) {
                    JOptionPane.showMessageDialog(null, "HACKE");
                    break;
                }
            }

        } catch (Exception e) {
                
        }
    }

    public JButton getPosicion(Piezas pieza) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (Arreglo[i][j].getIcon() == pieza.getMascaraPieza()) {
                    return Arreglo[i][j];
                }
            }
        }
        return new JButton();
    }

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Tablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CERO_CERO;
    private javax.swing.JButton CERO_CINCO;
    private javax.swing.JButton CERO_CUATRO;
    private javax.swing.JButton CERO_DOS;
    private javax.swing.JButton CERO_SEIS;
    private javax.swing.JButton CERO_SIETE;
    private javax.swing.JButton CERO_TRES;
    private javax.swing.JButton CERO_UNO;
    private javax.swing.JButton CINCO_CERO;
    private javax.swing.JButton CINCO_CINCO;
    private javax.swing.JButton CINCO_CUATRO;
    private javax.swing.JButton CINCO_DOS;
    private javax.swing.JButton CINCO_SEIS;
    private javax.swing.JButton CINCO_SIETE;
    private javax.swing.JButton CINCO_TRES;
    private javax.swing.JButton CINCO_UNO;
    private javax.swing.JButton CUATRO_CERO;
    private javax.swing.JButton CUATRO_CINCO;
    private javax.swing.JButton CUATRO_CUATRO;
    private javax.swing.JButton CUATRO_DOS;
    private javax.swing.JButton CUATRO_SEIS;
    private javax.swing.JButton CUATRO_SIETE;
    private javax.swing.JButton CUATRO_TRES;
    private javax.swing.JButton CUATRO_UNO;
    private javax.swing.JButton DOS_CERO;
    private javax.swing.JButton DOS_CINCO;
    private javax.swing.JButton DOS_CUATRO;
    private javax.swing.JButton DOS_DOS;
    private javax.swing.JButton DOS_SEIS;
    private javax.swing.JButton DOS_SIETE;
    private javax.swing.JButton DOS_TRES;
    private javax.swing.JButton DOS_UNO;
    private javax.swing.JButton SEIS_CERO;
    private javax.swing.JButton SEIS_CINCO;
    private javax.swing.JButton SEIS_CUATRO;
    private javax.swing.JButton SEIS_DOS;
    private javax.swing.JButton SEIS_SEIS;
    private javax.swing.JButton SEIS_SIETE;
    private javax.swing.JButton SEIS_TRES;
    private javax.swing.JButton SEIS_UNO;
    private javax.swing.JButton SIETE_CERO;
    private javax.swing.JButton SIETE_CINCO;
    private javax.swing.JButton SIETE_CUATRO;
    private javax.swing.JButton SIETE_DOS;
    private javax.swing.JButton SIETE_SEIS;
    private javax.swing.JButton SIETE_SIETE;
    private javax.swing.JButton SIETE_TRES;
    private javax.swing.JButton SIETE_UNO;
    private javax.swing.JButton TRES_CERO;
    private javax.swing.JButton TRES_CINCO;
    private javax.swing.JButton TRES_CUATRO;
    private javax.swing.JButton TRES_DOS;
    private javax.swing.JButton TRES_SEIS;
    private javax.swing.JButton TRES_SIETE;
    private javax.swing.JButton TRES_TRES;
    private javax.swing.JButton TRES_UNO;
    private javax.swing.JLabel TURNO;
    private javax.swing.JButton UNO_CERO;
    private javax.swing.JButton UNO_CINCO;
    private javax.swing.JButton UNO_CUATRO;
    private javax.swing.JButton UNO_DOS;
    private javax.swing.JButton UNO_SEIS;
    private javax.swing.JButton UNO_SIETE;
    private javax.swing.JButton UNO_TRES;
    private javax.swing.JButton UNO_UNO;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
