import java.util.*;

public abstract class Producto{
    private String id;
    private String descripcion;
    private double tarifaIva;
    
    public Producto(String id, String descripcion, double tarifaIva){
        this.id = id;
        this.descripcion = descripcion;
        this.tarifaIva = tarifaIva;
    }
    
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setDescripcion( String descripcion){
        this.descripcion = descripcion;
    }
    
    public double getTarifaIva(){
        return tarifaIva;
    }
    
    public void setTarifaIva(double tarifaIva){
        this.tarifaIva = tarifaIva;
    }
    
    public abstract double getValorIva();
    
    public abstract double getValorVenta();
    
    @Override
    public String toString(){
        return id + " Producto: " + descripcion + ", precio: $" + tarifaIva;
    }
    
}
