package practica10;

public class PilaPrestamo {
    private Prestamo inicio;

    public PilaPrestamo() {
        this.inicio = null;
    }
    
    private boolean estaVacio(){
        return inicio == null;
    }
    
    public void push(int idPrestamo, String fechaPrestamo, String fechaDevolucion, String idAlumno){
        Prestamo temporal = new Prestamo(idPrestamo, fechaPrestamo, fechaDevolucion, idAlumno);
        
        if(estaVacio()) inicio = temporal;
        else{
            temporal.setSiguiente(inicio);
            inicio = null;
        }
    }
    
    public void pop(){
        if(!estaVacio()){
            inicio = inicio.getSiguiente();
        }
    }
    
}
