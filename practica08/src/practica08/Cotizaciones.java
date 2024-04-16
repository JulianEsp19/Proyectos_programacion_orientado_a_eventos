package practica08;

public class Cotizaciones {
    
    //Atributos
    Cotizacion inicio;

    //Constructor
    public Cotizaciones() {
        inicio = null;
    }
    
    //Funcion para saber si la lista anidada esta vacia o tiene valores
    public boolean estaVacio(){
        return inicio == null;
    }
    
    /* se añade la cotizacion en la lista enlazada y se calcula el subTotal, iva, totalPagar y 
    las mensualidades*/
    public void anadirCotizacion(String nombre, int cantidadDias, String destinoTuristico, String tipoHabitacion, String tipoPago){
        float subTotal = calcularSubTotal(cantidadDias, destinoTuristico, tipoHabitacion);
        float iva = (float) (subTotal * 0.16);
        float totalPagar = subTotal + iva;
        float mensualidad = calcularMensualidad(totalPagar, tipoPago);
        
        Cotizacion temp = new Cotizacion(nombre, cantidadDias, destinoTuristico, tipoHabitacion, tipoPago, subTotal, iva, totalPagar, mensualidad, null);
        if(estaVacio()) inicio = temp;
        else{
            temp.setSiguiente(inicio);
            inicio = temp;
        }
    }
    
    /*Funcion para buscar una cotizacion en la lista anidada a partir del nombre, y devuelve todos los 
    datos de la cotizacion*/
    public String buscarCotizacion(String nombre){
        Cotizacion temp = inicio;
        while (temp != null) {
            if(temp.getNombre().equals(nombre)) 
                return "Nombre: " + temp.getNombre() + "\n" +
                       "Cantidad de dias: " + temp.getCantidadDias() + "\n" + 
                       "Destino turistico: " + temp.getDestinoTuristico() + "\n" +
                       "Tipo de habitacion: " + temp.getTipoPago() + "\n" +
                       "Subtotal: " + temp.getSubTotal() + "\n" +
                       "Iva: " + temp.getIva() + "\n" + 
                       "Total a pagar: " + temp.getTotalPagar() + "\n" +
                       "Mensualidad: " + temp.getMensualidad() + "\n";
            temp = temp.getSiguiente();
        }
        return "No encontrado";
    }
    
    /*Funcion para calcular los pagos mensuales, si es que fuera el caso, ya que puede que solo
    sea un pago unico*/
    private float calcularMensualidad(float totalPagar, String tipoPago){
        float mensualidad = 0;
        
        switch (tipoPago) {
            case "Monto Unico" -> mensualidad = 0;
            case "Mensualidades" -> mensualidad = totalPagar/6;
        }
        
        return mensualidad;
    }
    
    /*Funcion para calcular el subTotal a partir de sumar el precio de destino y se multiplica
    el tipo de habitacion por el numero de dias que se va a hacer en el viaje*/
    private float calcularSubTotal(int cantidadDias, String destinoTuristico, String tipoHabitacion){
        float subTotal = 0;
        
        switch (destinoTuristico) {
            case "Paris, Francia" -> subTotal += 50000;
            case "Machu Picchu, Peru" -> subTotal += 20000;
            case "Santorini, Grecia" -> subTotal += 60000;
            case "Kioto, Japon" -> subTotal += 40000;
            case "Maldivas, Republica de Maldivas" -> subTotal += 55000;
            default -> subTotal += 0;
        }
        
        switch (tipoHabitacion) {
            case "Sencilla" -> subTotal += (1200 * cantidadDias);
            case "Doble" -> subTotal += (2100 * cantidadDias);
            case "Suite" -> subTotal += (3500 * cantidadDias);
            default -> subTotal += 0;
        }
        
        return subTotal;
    }
    
}
