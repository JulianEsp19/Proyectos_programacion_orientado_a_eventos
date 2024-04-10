package examen;

public class Transporte {
    private int capacidadPasajeros;
    private String tipoMotor;

    public Transporte(int capacidadPasajeros, String tipoMotor) {
        this.capacidadPasajeros = capacidadPasajeros;
        this.tipoMotor = tipoMotor;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
    
    
}
