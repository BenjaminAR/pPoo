public class ProductoPesoVariable extends Producto{
    
    private double cantidad;
    private double precioPorUnidadDeMedida;
    private String unidadDeMedida;
    
    public ProductoPesoVariable(String id, String descripcion, double tarifaIva, double cantidad, double precioPorUnidadDeMedida, String unidadDeMedida){
        super(id, descripcion, tarifaIva);
        this.cantidad = cantidad;
        this.precioPorUnidadDeMedida = precioPorUnidadDeMedida;
        this.unidadDeMedida = unidadDeMedida;
    }
        
        public double getCantidad(){
            return cantidad;
        }
        
        public void setCantidad(double cantidad){
            this.cantidad = cantidad;
        }
        
        public String getUnidadDeMedida(){
            return unidadDeMedida;
        }
        
        public void getUnidadDeMedida(String unidadDeMedida){
            this.unidadDeMedida = unidadDeMedida; 
        }
        
        public double getPrecioPorUnidadDeMedida(){
            return precioPorUnidadDeMedida;
        }
        
        public void setPrecioPorUnidadDeMedida( Double precioPorUnidadDeMedida){
            this.precioPorUnidadDeMedida = precioPorUnidadDeMedida;
        }
         
        @Override
        public double getValorIva(){
            return this.precioPorUnidadDeMedida * cantidad * getTarifaIva();
        }
        
        @Override
        public double getValorVenta(){
            return this.precioPorUnidadDeMedida * cantidad + getValorIva();
        }
        
        @Override
        public String toString(){
            return super.toString() + "Total: $" + getValorVenta() + "\n iva: $" + getValorIva();
        }

        
    
}
