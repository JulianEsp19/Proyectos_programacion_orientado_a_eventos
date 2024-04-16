package practica08;

public class Cotizacion {
    
    //atributos
    private String nombre;
    private int cantidadDias;
    private String destinoTuristico;
    private String tipoHabitacion;
    private String tipoPago;
    private float subTotal;
    private float iva;
    private float totalPagar;
    private float mensualidad;
    private Cotizacion siguiente;

    //Constructor
    public Cotizacion(String nombre, int cantidadDias, String destinoTuristico, String tipoHabitacion, String tipoPago, float subTotal, float iva, float totalPagar, float mensualidad, Cotizacion siguiente) {
        this.nombre = nombre;
        this.cantidadDias = cantidadDias;
        this.destinoTuristico = destinoTuristico;
        this.tipoHabitacion = tipoHabitacion;
        this.tipoPago = tipoPago;
        this.subTotal = subTotal;
        this.iva = iva;
        this.totalPagar = totalPagar;
        this.mensualidad = mensualidad;
        this.siguiente = siguiente;
    }    

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public String getDestinoTuristico() {
        return destinoTuristico;
    }

    public void setDestinoTuristico(String destinoTuristico) {
        this.destinoTuristico = destinoTuristico;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public float getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(float totalPagar) {
        this.totalPagar = totalPagar;
    }

    public float getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(float mensualidad) {
        this.mensualidad = mensualidad;
    }

    public Cotizacion getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Cotizacion siguiente) {
        this.siguiente = siguiente;
    }
}
