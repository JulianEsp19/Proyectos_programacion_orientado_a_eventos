package practica10;

public class PilaPrestamo {
    private Prestamo inicio;

    public PilaPrestamo() {
        this.inicio = null;
    }
    
    public boolean estaVacio(){
        return inicio == null;
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
    
    public String toString(){
        String resultado = "";
        Prestamo temporal = inicio;
        
        while (temporal != null) {
            resultado += "ID prestamo: " + temporal.getIdPrestamo()+ "\n"+
                    "Fecha prestamo: " + temporal.getFechaPrestamo()+ "\n"+
                    "Fecha devolucion: " + temporal.getFechaDevolucion()+ "\n" +
                    "ID alumno: " + temporal.getIdAlumno()+ "\n\n" +
                    "------------------------------------------" + "\n\n";
            temporal = temporal.getSiguiente();
        }
        
        return resultado;
    }
    
}
