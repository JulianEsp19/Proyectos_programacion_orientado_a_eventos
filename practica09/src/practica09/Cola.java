package practica09;

public class Cola {
    
    private Nodo cola;

    public Cola() {
        this.cola = null;
    }
    
    public void encolar(int v){
        Nodo nuevo = new Nodo(v);
        if(cola == null) cola = nuevo;
        else{
            
            Nodo aux = cola;
            
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }
    
    public void recorrerCola(){
        Nodo temporal = cola;
        
        if(cola == null) System.out.println("La cola esta vacia");
        else{
            while (temporal != null) {
                System.out.println("Valor: " + temporal.getValor());
                temporal = temporal.getSiguiente();
            }
        }
        
    }
    
    public void desencolar(){
        if(cola == null) System.out.println("La pila esta vacia");
        else{
            cola = cola.getSiguiente();
            
            System.out.println("Primer elemento eliminado");
        }
    }
    
}
