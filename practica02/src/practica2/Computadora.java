package practica2;

public class Computadora {
    
    private int serie;
    private String marca;
    private String modelo;
    private int ram;

    public Computadora(int serie, String marca, String modelo, int ram) {
        this.serie = serie;
        this.marca = marca;
        this.modelo = modelo;
        this.ram = ram;
    }

    public Computadora() {
    }
    
    
    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
