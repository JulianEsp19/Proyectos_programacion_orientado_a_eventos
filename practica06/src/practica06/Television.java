package practica06;

public class Television {
    private String marca;
    private String modelo;
    private int tamanoPantalla;
    private float precio;

    public Television(String marca, String modelo, int tamanoPantalla, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanoPantalla = tamanoPantalla;
        this.precio = precio;
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

    public int getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(int tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
