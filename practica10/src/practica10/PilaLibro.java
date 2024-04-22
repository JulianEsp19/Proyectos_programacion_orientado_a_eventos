package practica10;

public class PilaLibro {
    
    private Libro inicio;

    public PilaLibro() {
        this.inicio = null;
    }
    
    private boolean estaVacio(){
        return inicio == null;
    }
    
    public void push(int isbn, String titulo, String autor, int edicion){
        Libro temporal = new Libro(isbn, titulo, autor, edicion);
        
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
