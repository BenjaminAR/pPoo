public class ProductoPrecioFijo extends Producto{
    private double precio;
    
    public ProductoPrecioFijo(String id, String descripcion, double tarifaIva, double precio){
        super(id, descripcion, tarifaIva);
        
        this.precio = precio;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void SetPrecio(double precio){
        this.precio = precio;
    }
    
    @Override
    public double getValorIva(){
        return this.precio * getTarifaIva();
    }
    
    @Override
    public double getValorVenta(){
        return this.precio + getValorIva();
    }
    
    @Override
    public String toString(){
        return super.toString() + "Total: $" + getValorVenta() + "\n iva: $" + getValorIva();
    }

}
