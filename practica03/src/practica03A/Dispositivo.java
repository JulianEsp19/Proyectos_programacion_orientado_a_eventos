package practica03A;

public class Dispositivo {
    private String modelo;
    private int capacidadBateria;
    private String tipoDispositivo;

    public Dispositivo(String modelo, int capacidadBateria, String tipoDispositivo) {
        this.modelo = modelo;
        this.capacidadBateria = capacidadBateria;
        this.tipoDispositivo = tipoDispositivo;
    }

    public Dispositivo() {
        this.modelo = "abc";
        this.capacidadBateria = 5000;
        this.tipoDispositivo = "telefono";
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public String getTipoDispositivo() {
        return tipoDispositivo;
    }

    public void setTipoDispositivo(String tipoDispositivo) {
        this.tipoDispositivo = tipoDispositivo;
    }
    
    
}
