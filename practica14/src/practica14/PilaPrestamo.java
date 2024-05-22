package practica14;

public class PilaPrestamo {
    private Prestamo inicio;

    public PilaPrestamo() {
        this.inicio = null;
    }
    
    public boolean estaVacio(){
        return inicio == null;
    }
    
    public int tamano(){
        Prestamo temporal = inicio;
        int resultado = 0;
        while(temporal != null){
            resultado ++;
            temporal = temporal.getSiguiente();
        }
        return resultado;
    }
    
    public void push(int idPrestamo, String fechaPrestamo, String fechaDevolucion, String idAlumno){
        Prestamo temporal = new Prestamo(idPrestamo, fechaPrestamo, fechaDevolucion, idAlumno);
        
        if(estaVacio()) inicio = temporal;
        else{
            temporal.setSiguiente(inicio);
            inicio = temporal;
        }
    }
    
    public void pop(){
        if(!estaVacio()){
            inicio = inicio.getSiguiente();
        }
    }
    
    public Object[] toObject(){
        Object filas[] = new Object[tamano()];
        Object informacion[] = new Object[4];
        Prestamo temporal = inicio;
        
        for (int i = 0; i < filas.length; i++) {
            informacion[0] = temporal.getIdPrestamo();
            informacion[1] = temporal.getFechaPrestamo();
            informacion[2] = temporal.getFechaDevolucion();
            informacion[3] = temporal.getIdAlumno();
            
            filas[i] = informacion;
            informacion = new Object[4];
            
            temporal = temporal.getSiguiente();
        }
        
        return filas;
    }
    
}
