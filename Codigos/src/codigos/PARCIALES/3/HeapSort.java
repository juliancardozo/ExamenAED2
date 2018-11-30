/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class HeapSort {
    /******* 
   
    */
     protected TProduct[] ordenarPorHeapSort(TProduct[] datosParaClasificar) {
            for (int i = (datosParaClasificar.length - 1) / 2; i >= 0; i--) { //Armo el heap inicial de n-1 div 2 hasta 0
                    armaHeap(datosParaClasificar, i, datosParaClasificar.length - 1);
            }
            for (int i = datosParaClasificar.length - 1; i  >= 1; i--) {// ERROR >=
                    intercambiar(datosParaClasificar,0,i);
                    armaHeap(datosParaClasificar, 0, i-1);
            }
            return datosParaClasificar;
    }

    private void armaHeap(TProduct[] datosParaClasificar, int primero, int ultimo) {
            if (primero < ultimo){
                    int r = primero;
                    while(r <= ultimo / 2){
                            if (ultimo == 2*r){ //r tiene un hijo solo
                                            if (datosParaClasificar[r].compareTo(datosParaClasificar[r*2]) > 0) { // ERROR >
                                                    intercambiar(datosParaClasificar, r, 2 * r);
                                                    r = 2 * r ; // ERROR 2*r
                                            } else {
                                                    r = ultimo;
                                            }
                            } else { //r tiene 2 hijos
                                    int posicionIntercambio = 0;
                                    if (datosParaClasificar[2*r].compareTo(datosParaClasificar[2*r + 1]) > 0){
                                            posicionIntercambio = 2 * r; // ERROR -1
                                    } else {
                                            posicionIntercambio = 2 * r + 1;  // ERROR 2*r+1
                                    }
                                    if (datosParaClasificar[r].compareTo(datosParaClasificar[posicionIntercambio]) < 0){ // ERROR >
                                            intercambiar(datosParaClasificar,r,posicionIntercambio);
                                            r = posicionIntercambio;
                                    } else {
                                            r = ultimo;
                                    }
                            }
                    }			
            }
    }   
    
     private void intercambiar(TProduct[] vector, int pos1, int pos2) {
    TProduct temp = vector[pos2];
    vector[pos2] = vector[pos1];
    vector[pos1] = temp;
    }
     
     
     
     
      protected TProduct[] ordenarPorInsercion(TProduct[] datosParaClasificar) {
        if (datosParaClasificar != null) {
                for (int i = 1; i < datosParaClasificar.length; i++) {
                        int j = i;
                        while ((j > 0) && (datosParaClasificar[j-1].compareTo(datosParaClasificar[j])>0)){
                                intercambiar(datosParaClasificar, j, j-1);
                                j--;
                        }
                }
        }
        return datosParaClasificar;
    }
    
}
