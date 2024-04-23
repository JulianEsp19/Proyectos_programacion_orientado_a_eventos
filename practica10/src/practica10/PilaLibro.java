package practica10;

public class PilaLibro {
    
    private Libro inicio;

    public PilaLibro() {
        this.inicio = null;
    }
    
    public boolean estaVacio(){
        return inicio == null;
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
    
    @Override
    public String toString(){
        String resultado = "";
        Libro temporal = inicio;
        
        while (temporal != null) {
            resultado += "ISBN: " + temporal.getIsbn()+ "\n"+
                    "Titulo: " + temporal.getTitulo()+ "\n"+
                    "Autor: " + temporal.getAutor()+ "\n" +
                    "Edicion: " + temporal.getEdicion()+ "\n\n" +
                    "------------------------------------------" + "\n\n";
            temporal = temporal.getSiguiente();
        }
        
        return resultado;
    }
    
}
