package practica07;

public class Viaje {
    private int numero;
    private String pais;
    private String ciudad;
    private int numDias;
    
    private Viaje siguiente;
    
    public Viaje(){
        this.numero = -1;
        this.pais = "";
        this.ciudad = "";
        this.numDias = 0;
        this.siguiente = null;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNumDias() {
        return numDias;
    }

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    public Viaje getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Viaje siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
