/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

/**
 *
 * @author Administrador
 */
public class SellSort extends Ordenacion{
     public static void shellSort( int a[ ]){ 
            for( int gap = a.length / 2; gap > 0; gap = gap == 2 ? 1 : (int) ( gap / 2.2 ) ){
                for( int i = gap; i < a.length; i++ ){
                    int tmp = a[ i ];
                    int j;
                    for(j = i; j >= gap && tmp < a[ j - gap ] ; j -= gap ){
                        a[ j ] = a[ j - gap ];
                    }
                }
            }
     }

    @Override
    public void ordenar(int[] elements) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimirArreglo(int[] array) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
