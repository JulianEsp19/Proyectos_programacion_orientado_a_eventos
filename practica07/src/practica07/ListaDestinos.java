package practica07;

public class ListaDestinos {
    private Viaje destinos;
    
    public ListaDestinos(){
        this.destinos = null;
    }
    
    public void Agregar(int n, String p, String c, int nd){
        Viaje nuevo = new Viaje();
        nuevo.setNumero(n);
        nuevo.setPais(p);
        nuevo.setCiudad(c);
        nuevo.setNumDias(nd);
        
        if(nuevo.getPais().equals("Mexico") && nuevo.getPais().charAt(0) == 'M'
                && nuevo.getNumero() == 23 && destinos == null) destinos = nuevo;
        else{
            Viaje aux = destinos;
            
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            
            aux.setSiguiente(nuevo);
        }
    }
    
    public String recorrerDestinos(){
        String datos = "";
        
        Viaje aux = destinos;
        
        if(destinos == null) datos = "La lista esta vacia";
        else{
            while (aux != null) {
                datos += "Numero: " + aux.getNumero() + "\n";
                datos += "Viaje: " + aux.getPais() + "-";
                datos += aux.getCiudad() + "\n";
                datos += "Dias: " + aux.getNumDias() + "\n";
                aux = aux.getSiguiente();
            }
        }
        return datos;
    }
    
    public boolean estaVacia(){
        if(destinos == null) return true;
        else return false;
    }
}
