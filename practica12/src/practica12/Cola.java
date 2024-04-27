package practica12;

public class Cola {
    private Nodo inicioCola;
    private Nodo finalCola;
    private int tamano;

    public Cola() {
        this.inicioCola = this.finalCola = null;
        this.tamano = 0;
    }
    
    public boolean estaVacio(){
        return inicioCola == null;
    }
    
    public void encolar(int dato){
        Nodo temp = new Nodo(dato);
        if(estaVacio()) inicioCola = finalCola = temp;
        else{
            finalCola.setSiguiente(temp);
            finalCola = temp;
        }
        tamano++;
    }
    
    public void desencolar(){
        if (inicioCola != null) {
            int resultado = inicioCola.getDato();
            inicioCola = inicioCola.getSiguiente();
            if (inicioCola == null) {
                finalCola = null;
            }
            tamano--;
        }
    }
    
    @Override
    public String toString(){
        String resultado = "";
        Nodo temp = inicioCola;
        
        while (temp != null) {
            resultado += temp.getDato() + "\n";
            temp = temp.getSiguiente();
        }
        
        return resultado;
    }
    
    
}
