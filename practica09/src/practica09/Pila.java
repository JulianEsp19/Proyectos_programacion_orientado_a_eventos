package practica09;

public class Pila {
    private Nodo pila;

    public Pila() {
        this.pila = null;
    }
    
    
    public void push(int valor){
        Nodo temporal = new Nodo(valor);
        if(pila==null) pila = temporal;
        else{
            temporal.setSiguiente(pila);
            pila = temporal;
        }
    }
    
    public void recorrerPila(){
        if(pila == null) System.out.println("No hay datos dentro de la Pila");
        else{
            Nodo temporal = pila;
            while (temporal != null) {
                System.out.println("Valor: " + temporal.getValor());
                temporal = temporal.getSiguiente();
            }
        }
    }
    
    public void pop(){
        if(pila == null) System.out.println("La pila esta vacia");
        else{
            pila = pila.getSiguiente();
            
            System.out.println("Primer elemento eliminado");
        }
    }
    
}
