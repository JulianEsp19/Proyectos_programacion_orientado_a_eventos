package examen;

public class Automovil extends Transporte{
    
    private int modeloAuto;
    private String tipoGas;

    public Automovil(int modeloAuto, int capacidadPasajeros, String tipoMotor, String tipoGas) {
        super(capacidadPasajeros, tipoMotor);
        this.modeloAuto = modeloAuto;
        this.tipoGas = tipoGas;
    }

    public int getModeloAuto() {
        return modeloAuto;
    }

    public void setModeloAuto(int modeloAuto) {
        this.modeloAuto = modeloAuto;
    }

    public String getTipoGas() {
        return tipoGas;
    }

    public void setTipoGas(String tipoGas) {
        this.tipoGas = tipoGas;
    }
    
}
