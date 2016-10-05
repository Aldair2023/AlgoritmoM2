/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aldair
 */
public class Helper {
   public static int mensaje(Component ventana, String info, String titulo, int tipo) {
        int retorno = -1;
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, info, titulo, JOptionPane.WARNING_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, info, titulo, JOptionPane.ERROR_MESSAGE);
                break;
            case 3:
                retorno = JOptionPane.showConfirmDialog(ventana, info, titulo, JOptionPane.YES_NO_OPTION);
                break;
        }
        return retorno;
    }

    public static String recibirDatos(Component ventana, String info) {
        String aux;
        aux = JOptionPane.showInputDialog(ventana, info);
        return aux;

    }

    public static void habilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);

        }
    }

    public static void deshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);

        }
    }

    public static void limpiarTabla(JTable tabla) {
        int nFilas, nColumnas;
        nFilas = tabla.getRowCount();
        nColumnas = tabla.getColumnCount();

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {

                tabla.setValueAt("", i, j);
            }
        }
    }

    public static void tablaPorDefecto(JTable tabla) {
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla.getModel();
        tm.setColumnCount(0);
        tm.setRowCount(0);

    }

    public static void DiagonalSecundaria(JTable TablaInicial, JTable TablaResultado) {
        int nFilas, nColumnas, aux;

        nFilas = TablaInicial.getColumnCount();
        nColumnas = TablaInicial.getRowCount();

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {

                aux = (int) TablaInicial.getValueAt(i, j);
                if (i + j == nFilas - 1) {
                    TablaResultado.setValueAt(aux, i, j);
                }

            }

        }
    }

    public static void TriangularSuperior(JTable TablaInicial, JTable TablaResultado) {
        int nFilas, nColumnas, aux;

        nFilas = TablaInicial.getColumnCount();
        nColumnas = TablaInicial.getRowCount();

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                aux = (int) TablaInicial.getValueAt(i, j);
                if (i == j || i <= j) {
                    TablaResultado.setValueAt(aux, i, j);
                }

            }

        }
    }

    public static void TriangularInferior(JTable TablaInicial, JTable TablaResultado) {
        int nFilas, nColumnas, aux;

        nFilas = TablaInicial.getColumnCount();
        nColumnas = TablaInicial.getRowCount();

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                aux = (int) TablaInicial.getValueAt(i, j);
                if ((i == j || i >= j)) {
                    TablaResultado.setValueAt(aux, i, j);
                }

            }

        }
    }

    public static void MatrizTranspouesta(JTable TablaInicial, JTable TablaResultado) {
        int nFilas, nColumnas, aux;

        nFilas = TablaInicial.getColumnCount();
        nColumnas = TablaInicial.getRowCount();

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                aux = (int) TablaInicial.getValueAt(i, j);
                TablaResultado.setValueAt(aux, j, i);

            }

        }
    }

    public static void LetraA(JTable TablaInicial, JTable TablaResultado) {
        int nFilas, nColumnas, aux;

        nFilas = TablaInicial.getColumnCount();
        nColumnas = TablaInicial.getRowCount();

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                aux = (int) TablaInicial.getValueAt(i, j);
                if (nFilas != nColumnas && nFilas % 2 != 0 && nColumnas % 2 != 0) {

                }
                if (j == 0 || i == 0 || j == nColumnas - 1 || i == nFilas / 2) {
                    TablaResultado.setValueAt(aux, i, j);
                }

            }

        }
    }

    public static void LetraZ(JTable TablaInicial, JTable TablaResultado) {
        int nFilas, nColumnas, aux;

        nFilas = TablaInicial.getColumnCount();
        nColumnas = TablaInicial.getRowCount();

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                aux = (int) TablaInicial.getValueAt(i, j);
                if ((i + j == nFilas - 1) || i == 0 || i == nFilas - 1) {
                    TablaResultado.setValueAt(aux, i, j);
                }

            }

        }
    }

    public static void LetraT(JTable TablaInicial, JTable TablaResultado) {
        int nFilas, nColumnas, aux;

        nFilas = TablaInicial.getColumnCount();
        nColumnas = TablaInicial.getRowCount();

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                aux = (int) TablaInicial.getValueAt(i, j);
                if (i == 0 || j == nColumnas / 2) {
                    TablaResultado.setValueAt(aux, i, j);
                }

            }

        }
    }

    public static void LetraV(JTable TablaInicial, JTable TablaResultado) {
        int nFilas, nColumnas, aux;

        nFilas = TablaInicial.getColumnCount();
        nColumnas = TablaInicial.getRowCount();

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                aux = (int) TablaInicial.getValueAt(i, j);
                if ((i + j == nFilas - 1 && i <= j) || (i == j && i + j <= nFilas)) {
                    TablaResultado.setValueAt(aux, i, j);
                }

            }

        }
    }

    public static void LetraE(JTable TablaInicial, JTable TablaResultado) {
        int nFilas, nColumnas, aux;

        nFilas = TablaInicial.getColumnCount();
        nColumnas = TablaInicial.getRowCount();

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                aux = (int) TablaInicial.getValueAt(i, j);
                if (i == 0 || i == nFilas / 2 || i == nFilas - 1 || j == 0) {
                    TablaResultado.setValueAt(aux, i, j);
                }
            }

        }
    }

    public static void LetraF(JTable TablaInicial, JTable TablaResultado) {
        int nFilas, nColumnas, aux;

        nFilas = TablaInicial.getColumnCount();
        nColumnas = TablaInicial.getRowCount();

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                aux = (int) TablaInicial.getValueAt(i, j);
                if ((j == 0 || i == 0 || i == nFilas / 2)) {
                    TablaResultado.setValueAt(aux, i, j);
                }
            }

        }
    }

    public static void LetraP(JTable TablaInicial, JTable TablaResultado) {
        int nFilas, nColumnas, aux;

        nFilas = TablaInicial.getColumnCount();
        nColumnas = TablaInicial.getRowCount();

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                aux = (int) TablaInicial.getValueAt(i, j);
                if ((j == 0 || i == 0 || i == nFilas / 2) || (j == nColumnas - 1 && j / i >= 2)) {
                    TablaResultado.setValueAt(aux, i, j);
                }
            }

        }
    }

    public static void LetraI(JTable TablaInicial, JTable TablaResultado) {
        int nFilas, nColumnas, aux;

        nFilas = TablaInicial.getColumnCount();
        nColumnas = TablaInicial.getRowCount();

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                aux = (int) TablaInicial.getValueAt(i, j);
                if ((i == 0 || i == nFilas - 1 || j == nColumnas / 2)) {
                    TablaResultado.setValueAt(aux, i, j);
                }
            }

        }
    }

    public static void LetraN(JTable TablaInicial, JTable TablaResultado) {
        int nFilas, nColumnas, aux;

        nFilas = TablaInicial.getColumnCount();
        nColumnas = TablaInicial.getRowCount();

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                aux = (int) TablaInicial.getValueAt(i, j);
                if ((i == j || j == 0 || j == nColumnas - 1)) {
                    TablaResultado.setValueAt(aux, i, j);
                }
            }

        }
    }

    public static void LetraY(JTable TablaInicial, JTable TablaResultado) {
        int nFilas, nColumnas, aux;

        nFilas = TablaInicial.getColumnCount();
        nColumnas = TablaInicial.getRowCount();
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                aux = (int) TablaInicial.getValueAt(i, j);

                if (j == nColumnas / 2 && j <= i || (i + j == nFilas - 1 && i <= j) || (i == j && i + j <= nFilas)) {
                    TablaResultado.setValueAt(aux, i, j);
                }
            }

        }
    }

    public static void LetraX(JTable TablaInicial, JTable TablaResultado) {
        int nFilas, nColumnas, aux;

        nFilas = TablaInicial.getColumnCount();
        nColumnas = TablaInicial.getRowCount();
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                aux = (int) TablaInicial.getValueAt(i, j);
                if (i + j == nFilas - 1 || i == j) {
                    TablaResultado.setValueAt(aux, i, j);
                }
            }

        }
    } 
}
