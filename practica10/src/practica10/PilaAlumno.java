package practica10;

public class PilaAlumno {
    private Alumno inicio;

    public PilaAlumno() {
        this.inicio = null;
    }
    
    private boolean estaVacio(){
        return inicio == null;
    }
    
    public void push(String idAlumno, String nombre, int curso, String email){
        Alumno temporal = new Alumno(idAlumno, nombre, curso, email);
        
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
