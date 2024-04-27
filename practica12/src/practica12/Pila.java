package practica12;

public class Pila {
    private Nodo inicio;

    public Pila() {
        this.inicio = null;
    }
    
    public boolean estaVacio(){
        return inicio == null;
    }
    
    public void push(int valor){
        Nodo temp = new Nodo(valor);
        if(estaVacio()) inicio = temp;
        else{
            temp.setSiguiente(inicio);
            inicio = temp;
        }
    }
    
    public void pop(){
        inicio = inicio.getSiguiente();
    }
    
    @Override
    public String toString(){
        String resultado = "";
        Nodo temp = inicio;
        
        while (temp != null) {
            resultado += temp.getDato() + "\n";
            temp = temp.getSiguiente();
        }
        
        return resultado;
    }
    
}
