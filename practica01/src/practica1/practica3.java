package practica1;

import java.util.Scanner;

public class practica3 {
    
    private static final Automovil automoviles[] = new Automovil[20];
    private static final Scanner scanner = new Scanner(System.in);
        
    public static void main(String[] args) {
      
        int opcion = 0;
        
        do{
            
            System.out.println("""
                               ----------Menu-------------
                               1.-Nuevo automovil 
                               2.-Editar automovil
                               3.-Borrar automovil
                               4.-Imprimir automoviles
                               0.-Salir
                               """);
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1 -> System.out.println(nuevoAutomovil());
                case 2 -> System.out.println(editarAutomovil());
                case 3 -> System.out.println(borrarAutomovil());
                case 4 -> imprimirAutomovils();
                case 0 -> System.out.println("Saliendo....");
                default -> System.out.println("El valor seleccionado no esta en el menu");
            }
            
            
        }while(opcion != 0);
    }
    
    private static String nuevoAutomovil(){
        String  tipoCombustible = "", transmision = "", marca = "",
                modelo = "", color = "";
        int numeroPuertas = 0, cilindrada = 0, anoFabricacion = 0;
        int indiceAutomovil = obtenerIndiceAutomovil();
        Automovil nuevoAutomovil;
        
        if(indiceAutomovil == -1) return "No se logro insertar el automovil";
        
        System.out.print("Ingrese la numeroPuertas del automovil: ");
        numeroPuertas = scanner.nextInt();
        
        System.out.print("Ingrese la tipoCombustible del automovil: ");
        tipoCombustible = scanner.next();
        
        System.out.print("Ingrese el transmision del automovil: ");
        transmision = scanner.next();
        
        System.out.print("Ingrese la cilindrada del automovil: ");
        cilindrada = scanner.nextInt();
        
        System.out.print("Ingrese la marca del automovil: ");
        marca = scanner.next();
        
        System.out.print("Ingrese el modelo del automvil: ");
        modelo = scanner.next();
        
        System.out.print("Ingrese el año de fabricacion del automovil: ");
        anoFabricacion = scanner.nextInt();
        
        System.out.print("Ingrese el color del automovil: ");
        color = scanner.next();
        
        nuevoAutomovil = new Automovil(numeroPuertas, tipoCombustible, 
                transmision, cilindrada, marca, modelo, anoFabricacion,
        color);
        
        automoviles[indiceAutomovil] = nuevoAutomovil;
        
        return "El automovil se inserto con exito";
    }
    
    private static String editarAutomovil(){
        int opcionEditar = 0, automovilEditar = 0;
        
        imprimirAutomovils();
        
        System.out.println("SELECCIONE EL EVENTO A EDITAR");
        
        automovilEditar = scanner.nextInt()-1;
        
        System.out.println("""
                           Menu Edicion 
                           1.- Numero puertas
                           2.- Tipo de combustible 
                           3.- Tipo de transmision
                           4.- Cilindraje
                           5.- Marca
                           6.- Modelo
                           7.- Año de Fabricacion
                           8.- Color
                           """);
        opcionEditar = scanner.nextInt();
        
        try{
            switch (opcionEditar) {
                case 1:
                    int numeroPuertas;
                    System.out.print("Ingrese la nueva numeroPuertas: ");
                    numeroPuertas = scanner.nextInt();
                    automoviles[automovilEditar].setNumeroPuertas(numeroPuertas);
                    break;
                case 2:
                    String tipoCombustible;
                    System.out.print("Ingrese la nueva tipoCombustible: ");
                    tipoCombustible = scanner.next();
                    automoviles[automovilEditar].setTipoCombustible(tipoCombustible);
                    break;
                case 3:
                    String transmision;
                    System.out.print("Ingrese la nueva transmision: ");
                    transmision = scanner.next();
                    automoviles[automovilEditar].setTransmision(transmision);
                    break;
                case 4:
                    int cilindraje;
                    System.out.print("Ingrese el nuevo cilindraje: ");
                    cilindraje = scanner.nextInt();
                    automoviles[automovilEditar].setCilindrada(cilindraje);
                case 5:
                    String marca;
                    System.out.print("Ingrese la nueva marca: ");
                    marca = scanner.next();
                    automoviles[automovilEditar].setMarca(marca);
                    break;
                case 6:
                    String modelo;
                    System.out.print("Ingrese la nueva modelo: ");
                    modelo = scanner.next();
                    automoviles[automovilEditar].setModelo(modelo);
                    break;
                case 7:
                    int anoFabricacion;
                    System.out.print("Ingrese el nuevo año de fabricacion: ");
                    anoFabricacion = scanner.nextInt();
                    automoviles[automovilEditar].setAnoFabricacion(anoFabricacion);
                    break;
                case 8:
                    String color;
                    System.out.print("Ingrese el nuevo color: ");
                    color = scanner.next();
                    automoviles[automovilEditar].setColor(color);
            }
            return "El automovil se ha editado con exito";
        }
        catch(Exception e){
            return "El automovil no se ha editado";
        }
    }
    
    private static String borrarAutomovil(){
        try{
            int automovilEliminar = 0;
        
            imprimirAutomovils();

            System.out.println("SELECCIONE EL EVENTO A ELIMINAR");

            automovilEliminar = scanner.nextInt()-1;

            reordenarAutomovils(automovilEliminar);

            return "El automovil se ha eliminado con exito";
        }
        catch(Exception e){
            return "El automovil no se ha podido eliminar";
        }
        
    }
    
    private static void reordenarAutomovils(int indice){
        for (int i = indice; i < (automoviles.length-1); i++) {
            automoviles[i] = automoviles[i+1];
        }
    }
    
    private static void imprimirAutomovils(){
        int indiceImpresion = obtenerIndiceAutomovil();
        if(indiceImpresion != 0){
            for (int i = 0; i < indiceImpresion; i++) {
            System.out.println("---------------Automovil "+(i+1)+"---------------");
            System.out.println("Numero de puertas: "+automoviles[i].getNumeroPuertas());
            System.out.println("Tipo de combustible: "+automoviles[i].getTipoCombustible());
            System.out.println("Transmision: "+automoviles[i].getTransmision());
            System.out.println("Cilindraje: "+automoviles[i].getCilindrada());
            System.out.println("Marca: "+automoviles[i].getMarca());
            System.out.println("Modelo: "+automoviles[i].getModelo());
            System.out.println("Año de fabricacion: "+automoviles[i].getAnoFabricacion());
            System.out.println("Color: "+automoviles[i].getColor());
            }
        }else{
            System.out.println("no hay automovil para mostrar");
        }
    }
    
    private static int obtenerIndiceAutomovil(){
        for(int i = 0; i < automoviles.length; i++){
            if(automoviles[i] == null) return i;
        }
        return -1;
    }

}

abstract class Vehiculo{
    private String marca;
    private String modelo;
    private int anoFabricacion;
    private String color;

    public Vehiculo(String marca, String modelo, int anoFabricacion, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacion = anoFabricacion;
        this.color = color;
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

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(int anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public abstract void arrancar();
    public abstract void acelerar();
    public abstract void frenar();
    public abstract void apagar();

}

class Automovil extends Vehiculo{
    
    private int numeroPuertas;
    private String tipoCombustible;
    private String transmision;
    private int cilindrada;

    public Automovil(int numeroPuertas, String tipoCombustible, String transmision, int cilindrada, String marca, String modelo, int anoFabricacion, String color) {
        super(marca, modelo, anoFabricacion, color);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
        this.transmision = transmision;
        this.cilindrada = cilindrada;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    @Override
    public void arrancar(){
        System.out.println("El automovil esta arrancando");
    }
    
    @Override
    public void acelerar(){
        System.out.println("El automovil esta acelerando");
    }
    @Override
    public void frenar(){
        System.out.println("El automovil esta frenando");
    }
    @Override
    public void apagar(){
        System.out.println("El automovil se apago");
    }
}
