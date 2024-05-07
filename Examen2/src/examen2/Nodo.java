package examen2;

public class Nodo {
    
    private int codigoProducto;
    private String nombreProducto;
    private int cantidadDisponible;
    private float precioUnitario;
    private String fechaUltimoPedido;
    private Nodo siguiente;

    public Nodo(int codigoProducto, String nombreProducto, int cantidadDisponible, float precioUnitario, String fechaUltimoPedido) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.cantidadDisponible = cantidadDisponible;
        this.precioUnitario = precioUnitario;
        this.fechaUltimoPedido = fechaUltimoPedido;
        this.siguiente = null;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getFechaUltimoPedido() {
        return fechaUltimoPedido;
    }

    public void setFechaUltimoPedido(String fechaUltimoPedido) {
        this.fechaUltimoPedido = fechaUltimoPedido;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
