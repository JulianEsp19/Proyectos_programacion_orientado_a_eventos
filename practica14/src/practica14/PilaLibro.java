package practica14;

public class PilaLibro {
    
    private Libro inicio;

    public PilaLibro() {
        this.inicio = null;
    }
    
    public boolean estaVacio(){
        return inicio == null;
    }
    
    public int tamano(){
        Libro temporal = inicio;
        int resultado = 0;
        while(temporal != null){
            resultado ++;
            temporal = temporal.getSiguiente();
        }
        return resultado;
    }
    
    public void push(int isbn, String titulo, String autor, int edicion){
        Libro temporal = new Libro(isbn, titulo, autor, edicion);
        
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
        Libro temporal = inicio;
        
        for (int i = 0; i < filas.length; i++) {
            informacion[0] = temporal.getIsbn();
            informacion[1] = temporal.getTitulo();
            informacion[2] = temporal.getAutor();
            informacion[3] = temporal.getEdicion();
            
            filas[i] = informacion;
            informacion = new Object[4];
            
            temporal = temporal.getSiguiente();
        }
        
        return filas;
    }
    
}
