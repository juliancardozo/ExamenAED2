
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Instanciar productos del ecommerce leyendo del archivo.
        String[] lineas = ManejadorArchivosGenerico.leerArchivo("src/codigos/PARCIALES/3/flipkart-ecommerce-sample.csv", true);
        int i = 0;
        //int MAX_CANTIDAD_PRODUCTO = 50000;
        
       
        List<TProduct> productos = new ArrayList<TProduct>();
        
        for(String linea : lineas) {
            try {
                TProduct producto = new TProduct(linea);
                if (producto.isValid()) {
                        i += 1;
                        // Agregar el producto a una colección del tipo apropiado.
                         productos.add(producto);
                   
                    
                }
                
                
                
                
                
            } catch (Exception ex) {
                Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Se cargaron " + i + " productos");
        
        
        
        
        
        HeapSort ordenarProductos = new HeapSort(); 
        
        TProduct[] productosArray = productos.toArray(new TProduct[productos.size()]);
        
        TProduct[] ordenado = ordenarProductos.ordenarPorHeapSort(productosArray);
        
         String[] lineaProducto = new String[ordenado.length];
         int indice = 0;
        
        // Escribir los resultados al archivo "salida.txt"
        for (TProduct linea : ordenado) {
            lineaProducto[indice] = linea.getUniq_id() + " " + linea.getName();
            indice++;
        }
       
       
        
       
        ManejadorArchivosGenerico.escribirArchivo("salida.txt", lineaProducto);
        // Emitir un archivo de salida, "salida.txt" con la lista de productos ordenados por la propiedad indicada en el pizarrón.
    }
}
