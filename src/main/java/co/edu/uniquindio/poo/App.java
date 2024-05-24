package co.edu.uniquindio.poo;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú del Parqueadero:");
            System.out.println("1. Crear Parqueadero");
            System.out.println("2. Verificar disponibilidad de un puesto");
            System.out.println("3. Ubicar un vehículo en un puesto");
            System.out.println("4. Identificar propietario de un vehículo en un puesto");
            System.out.println("5. Configurar tarifas");
            System.out.println("6. Generar reporte diario");
            System.out.println("7. Generar reporte mensual");
            System.out.println("8. Salir vehiculo");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    CrearParqueadero.creaPaequeadero();
                    break;
                case 2:
                
                    Parqueadero.imprimirMatrizPuestos();
                    System.out.println();
                    System.out.print("Ingrese la fila del puesto: ");
                    int fila = scanner.nextInt();
                    System.out.print("Ingrese la columna del puesto: ");
                    int columna = scanner.nextInt();
            
                    Puesto[][] puestos = Parqueadero.getPuestos();
            
                    boolean disponibilidad = Parqueadero.verificarDisponibilidad(puestos, fila, columna);
            
                    System.out.println("Disponibilidad del puesto (" + fila + "," + columna + "): " + disponibilidad);

                    
                    break;
                case 3:
                    Vehiculo.ingresarVehiculo();
                    break;
                case 4:
                    System.out.print("Ingrese la fila del puesto: ");
                    fila = scanner.nextInt();
                    System.out.print("Ingrese la columna del puesto: ");
                    columna = scanner.nextInt();
            
                    puestos = Parqueadero.getPuestos();

                    Parqueadero.validarInfo(puestos, fila, columna);
                    
                break;
                case 5:
                    System.out.print("Ingrese la fila del puesto: ");
                    int filaTarifa = scanner.nextInt();
                    System.out.print("Ingrese la columna del puesto: ");
                    int columnaTarifa = scanner.nextInt();
                    System.out.print("Ingrese la nueva tarifa: ");
                    double tarifa = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar el buffer
                    Parqueadero.configurarTarifa(filaTarifa, columnaTarifa, tarifa);
                    break;
                case 6:
                    Parqueadero.generarReporteDiario();
                    break;
                case 7:
                    Parqueadero.generarReporteMensual();
                    break;
                case 8:
                    Vehiculo.desocupar();
                    break;
                case 9:
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
