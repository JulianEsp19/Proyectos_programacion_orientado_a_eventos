package practica03A;

import java.util.Scanner;

public class Practica_02a_ESPARZA_ROSAS_JESUS_JULIAN {

    private static Dispositivo dispositivos[] = new Dispositivo[20];
    private static int indiceDispositivo = 0;
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcion = 0;
        inicializarDispositivos();
        
        do {
            System.out.println("""
                               ---------------MENU---------------
                               1.-Registrar un nuevo dispositivo
                               2.-Buscar dispositivo
                               3.-Consultar dispositivos
                               0.-Salir
                               """);
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1 -> registrarDispositivo();
                case 2 -> buscarDispositivo();
                case 3 -> consultarDispositivos();
                case 0 -> System.out.println("Saliendo ....");
                default -> System.out.println("El numero ingresado no es una opcion del menu");
            }
        } while (opcion != 0);
        
        
    }
    
    private static void inicializarDispositivos(){
        for (int i = 0; i < 20; i++) {
            dispositivos[i] = new Dispositivo();
        }
    }

    private static void registrarDispositivo() {
        if (indiceDispositivo < 20) {
            String modelo;
            int capacidadBateria;
            String tipoDispositivo;

            System.out.print("Ingrese el modelo del dispositivo: ");
            modelo = scanner.next();

            System.out.print("Ingrese la capacidad de bateria del dispositivo: ");
            capacidadBateria = scanner.nextInt();

            System.out.print("Ingrese el tipo de dispositivo: ");
            tipoDispositivo = scanner.next();

            dispositivos[indiceDispositivo].setModelo(modelo);
            dispositivos[indiceDispositivo].setCapacidadBateria(capacidadBateria);        
            dispositivos[indiceDispositivo].setTipoDispositivo(tipoDispositivo);
            
            indiceDispositivo++;
        }else{
            System.out.println("se ha superado el limite de dispositivos");
        }        
    }
    
    private static void buscarDispositivo(){
        if (estaVacio()) System.out.println("No hay dispositivos para buscar");
        else{
            String modelo; 
            boolean exitoso = false;
        
            System.out.print("Ingrese el modelo del dispositivo a buscar: ");
            modelo = scanner.next();
            
            for(Dispositivo dispositivo: dispositivos) {
                if (dispositivo.getModelo().equals(modelo)) {
                    System.out.println("Se a encontrado una coincidencia");
                    System.out.println("Capacidad de bateria: "+dispositivo.getCapacidadBateria());
                    System.out.println("Tipo de dispositivo: "+dispositivo.getTipoDispositivo());
                    exitoso = true;
                    break;
                }
            }
            if (!exitoso) System.out.println("no se ha encotrado ninguna coincidencia");
        }
    }
    
    private static void consultarDispositivos(){
        if (estaVacio()) System.out.println("No hay dispositivos para consultar");
        else{
            for (int i = 0; i < indiceDispositivo; i++) {
                System.out.println("-----Dispósitivo "+i+"-----");
                System.out.println("Modelo: " + dispositivos[i].getModelo());
                System.out.println("Capacidad de la bateria: " + dispositivos[i].getCapacidadBateria());
                System.out.println("Tipo de dispositivo: " + dispositivos[i].getTipoDispositivo());                
            }
        }
    }
    
    private static boolean estaVacio(){
        return (indiceDispositivo <= 0);
    }
    
}
