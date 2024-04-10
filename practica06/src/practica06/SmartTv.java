package practica06;

public class SmartTv extends Television{
    private String sistemaOperativo;
    private String resolucion;

    public SmartTv(String sistemaOperativo, String resolucion, String marca, String modelo, int tamanoPantalla, float precio) {
        super(marca, modelo, tamanoPantalla, precio);
        this.sistemaOperativo = sistemaOperativo;
        this.resolucion = resolucion;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }
}
