import java.util.*;

//https://paiza.io/projects/DxWFbsS714U13-pS4IkLSg?language=java

public class Main {
    public static void main(String[] args) throws Exception {
        
        Producto p1 = new ProductoPrecioFijo("pr1", "Coca-cola", 0.16, 19.5);
  
        Producto p2 = new ProductoPesoVariable("pr2", "Mango", 0.00, 1, 40.0, "Kg");
        
        ProductoCompuesto despensa = new ProductoCompuesto("Cb001", "Canasta básica",  0.0);
        
        despensa.agregarProducto(p1);
        despensa.agregarProducto(p2);
        
        System.out.println("P1:" + p1.getValorVenta());
        System.out.println("TOTAL DESPENSA: $" + despensa.getValorVenta());
        
    }
}
