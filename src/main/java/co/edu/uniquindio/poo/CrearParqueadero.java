package co.edu.uniquindio.poo;

import java.util.Scanner;

public class CrearParqueadero extends Parqueadero {

    public CrearParqueadero(int filas, int columnas) {
        super(filas, columnas);
    }
    /*Método desocupar*/
    public static void creaPaequeadero(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        // Solicitar al usuario que ingrese el número de filas y columnas
        System.out.print("Ingrese el número de filas del parqueadero: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas del parqueadero: ");
        int columnas = scanner.nextInt();
        // Crear un array bidimensional de tamaño especificado por el usuario
        Parqueadero miparqueadero = new Parqueadero(filas,columnas);
        System.out.println("Parqueadero creado exitosamente con " + filas + " filas y " + columnas + " columnas.");
        System.out.println();
        System.out.println();
    }
    
    public void mostrarInformacion() {
        System.out.println("Parqueadero con Numero de puestos: " + getPuestos() + "\n");

    }

    
    
    
    
}
