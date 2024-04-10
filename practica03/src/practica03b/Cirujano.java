package practica03b;

public class Cirujano extends Medico{
    private String tipoCirujano;
    private int numCirujias;
    private String hospitalTrabajo;

    public Cirujano(String tipoCirujano, int numCirujias, String hospitalTrabajo, String nombre, String especialidad, int experiencia) {
        super(nombre, especialidad, experiencia);
        this.tipoCirujano = tipoCirujano;
        this.numCirujias = numCirujias;
        this.hospitalTrabajo = hospitalTrabajo;
    }

    public Cirujano() {
    }    

    public String getTipoCirujano() {
        return tipoCirujano;
    }

    public void setTipoCirujano(String tipoCirujano) {
        this.tipoCirujano = tipoCirujano;
    }

    public int getNumCirujias() {
        return numCirujias;
    }

    public void setNumCirujias(int numCirujias) {
        this.numCirujias = numCirujias;
    }

    public String getHospitalTrabajo() {
        return hospitalTrabajo;
    }

    public void setHospitalTrabajo(String hospitalTrabajo) {
        this.hospitalTrabajo = hospitalTrabajo;
    }
    
    
}
