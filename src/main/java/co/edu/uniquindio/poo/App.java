package co.edu.uniquindio.poo;

import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Persona miPersona = new Persona("Daniel", "1038646923", "3146745272", TipoPersona.COMPRADOR);
        Moto miMoto = new Moto("AFM 37C", "Discover 125", miPersona, 120, TipoMoto.CLASICA);
        Puesto miPuesto = new Puesto(1,2, false,0, miMoto);
        Parqueadero miParqueadero = new Parqueadero(12, LocalDateTime.of(2024, 05, 02, 15, 00), LocalDateTime.now(), miPuesto);

        miParqueadero.mostrarInformacion();



<<<<<<< Updated upstream
=======
                    
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
                    int tarifa = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    Parqueadero.configurarTarifa(filaTarifa, columnaTarifa, (int) tarifa);
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
>>>>>>> Stashed changes
    }
}
