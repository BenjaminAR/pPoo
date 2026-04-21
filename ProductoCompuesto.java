import java.util.*;

public class ProductoCompuesto extends Producto{
    private ArrayList<Producto> productos;
    
    public ProductoCompuesto(String id, String descripcion, double tarifaIva){
        super(id, descripcion, tarifaIva);
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto p){
        this.productos.add(p);
    }
    
        
    @Override
    public double getValorIva(){
        double totalIva = 0;
        for(Producto p : productos){
            totalIva+=p.getValorIva();
        }
        return totalIva;
    }    
        
    @Override
    public double getValorVenta(){
        double totalVenta = 0;
        for(Producto p : productos){
            totalVenta+=p.getValorVenta();
        }
        return totalVenta;
    }
    
    
}
