/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examened;

/**
 *
 * @author alumno
 */
public class ExamenED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public boolean ordenarPorSeleccion(int[] listaNumeros) {
        int temporal;//NOD 1
        boolean listaOrdenada = true;

        for (int i = 0; i < listaNumeros.length - 1; i++) {//NOD2
            for (int j = i + 1; j < listaNumeros.length; j++) {//NOD 3
                if (listaNumeros[i] > listaNumeros[j]) {//NOD4
                    temporal = listaNumeros[i];
                    listaNumeros[i] = listaNumeros[j];//NOD5
                    listaNumeros[j] = temporal;
                    listaOrdenada = false;
                }
            }
        }
        return listaOrdenada;//NOD6
    }

}
