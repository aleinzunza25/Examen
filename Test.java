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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BubbleSort BubbleSort= new BubbleSort();
        InsertionSort insertionSort= new InsertionSort();
        SellSort SellSort= new SellSort();
        

           
        
        int[] arreglo = { 20,18,19,15,17,16,11,13,14,12,10,1,5,4,3,2,6,8,7,9};
        
        insertionSort.imprimirArreglo(arreglo);
        
       
	}
    }
    

