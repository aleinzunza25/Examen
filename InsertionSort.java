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
public class InsertionSort extends Ordenacion {
    
    public InsertionSort(){
    }
    
    void insertionSort(int[] arr) {
      int i, j, newValue;
      for (i = 1; i < arr.length; i++) {
            newValue = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > newValue) {
                  arr[j] = arr[j - 1];
                  j--;
            }
            arr[j] = newValue;
      }
}

    @Override
    public void ordenar(int[] array) {
    boolean swapped = true;
        int j = 0;
        int tmp;      
      while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < array.length - j; i++) {                                       
                  if (array[i] > array[i + 1]) {                          
                        tmp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = tmp;
                        swapped = true;
                  }
            }                
      }
    
}    
    

    @Override
    public void imprimirArreglo(int[] array) {
           
	

		for (int i = 0; i < array.length; i++) {	
			if(i != (array.length-1))
				System.out.print(array[i] + " - ");
			else
				System.out.print(array[i]);
		}

		System.out.print("\n"); 
    }
}
