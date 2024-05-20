package co.edu.uniquindio.poo;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*Creacion de la clase principal Parqueadero */
public class Parqueadero {

    protected static Puesto[][] puestos;
    static Scanner scanner = new Scanner(System.in);

    public Parqueadero(int filas, int columnas) {
        this.puestos = new Puesto[filas][columnas];

        // Inicializar todos los puestos
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                puestos[i][j] = new Puesto(false, 0.0, null);
            }
        }
    }
    /* Getters y setters */
    public static Puesto[][] getPuestos() {
        return puestos;
    }

    public void setPuestos(Puesto[][] puestos) {
        this.puestos = puestos;
    }


    /* Método para generar el total a pagar */
    public void TotalPagar() {
    }

    /* Método para generar el reporte diario */
    public void reporteDiario() {
    }

    /* Método para generar el reporte Mensual */
    public void reporteMensual() {
    }


    // Método para obtener la matriz de puestos
    public Puesto[][] obtenerMatrizDePuestos() {
        return puestos;
    }

    // Método verificarDisponibilidad corregido
    public static boolean verificarDisponibilidad(Puesto[][] puestos, int fila, int columna) {
        if (fila >= 0 && fila < puestos.length && columna >= 0 && columna < puestos[0].length) {
            boolean disponible = !puestos[fila][columna].estaOcupado();
            if (disponible) {
                System.out.println("El puesto está disponible.");
                System.out.println();
            } else {
                System.out.println("El puesto está ocupado.");                    
                System.out.println();
            }
            return disponible;
            
        } else {
            System.out.println("Posición inválida.");
            System.out.println();
            return false;
        }
    }

    public static void ubicarVehiculo(int fila, int columna, Vehiculo vehiculo) {
        if (verificarDisponibilidad(puestos, fila, columna)) {
            System.out.print("Ingrese la tarifa para el vehiculo : ");
            int tarifa = scanner.nextInt();
            puestos[fila][columna].ocupar(true, tarifa,vehiculo);
            System.out.println("Vehículo ubicado en el puesto [" + fila + "][" + columna + "] a las " + LocalDateTime.now() + ".");
            System.out.println();
        } else {
            System.out.println("No se pudo ubicar el vehículo. El puesto está ocupado o fuera de rango.");
            System.out.println();
        }
    }

    public static void configurarTarifa(int fila, int columna, double tarifa) {
        if (fila >= 0 && fila < puestos.length && columna >= 0 && columna < puestos[0].length) {
            puestos[fila][columna].setTarifa(tarifa);
            System.out.println("Tarifa configurada para el puesto [" + fila + "][" + columna + "]: " + tarifa);
            System.out.println();
        } else {
            System.out.println("Posición inválida.");
            System.out.println();
        }
    }
        public static void generarReporteDiario() {
        System.out.println("Reporte Diario:");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        for (int i = 0; i < puestos.length; i++) {
            for (int j = 0; j < puestos[i].length; j++) {
                if (puestos[i][j].isEstaOcupado()) {
                    LocalDateTime registro = puestos[i][j].getFechaHoraRegistro();
                    System.out.println("Puesto [" + i + "][" + j + "]: Vehículo " + puestos[i][j].getVehiculoOcupante().getPlaca() + 
                                       ", Registrado a las: " + registro.format(formatter));
                    System.out.println();
                    System.out.println();                  
                }
            }
        }
    }

    public static void generarReporteMensual() {
        System.out.println("Reporte Mensual:");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        for (int i = 0; i < puestos.length; i++) {
            for (int j = 0; j < puestos[i].length; j++) {
                if (puestos[i][j].isEstaOcupado()) {
                    LocalDateTime registro = puestos[i][j].getFechaHoraRegistro();
                    System.out.println("Puesto [" + i + "][" + j + "]: Vehículo " + puestos[i][j].getVehiculoOcupante().getPlaca() + 
                                       ", Registrado a las: " + registro.format(formatter));
                
                    System.out.println();
                    System.out.println();                    }
            }
        }
    }
    public static void imprimirMatrizPuestos() {
        System.out.println("Matriz de puestos del parqueadero: ");
        System.out.println();
        for (int i = 0; i < puestos.length; i++) {
            for (int j = 0; j < puestos[i].length; j++) {
                if (puestos[i][j].isEstaOcupado()) {
                    System.out.println("[X]"); // Puesto ocupado
                } else {
                    System.out.println("[ ]"); // Puesto disponible
                }
            }
            System.out.println();
            System.out.println();
        }
    }
    public static void validarInfo(Puesto[][] puestos, int fila, int columna) {
                
        if (fila >= 0 && fila < puestos.length && columna >= 0 && columna < puestos[0].length) {
            Puesto puesto = puestos[fila][columna];
            if (puesto.isEstaOcupado()) {
                Persona propietario = puesto.getPropietario();
                System.out.println("Propietario del vehículo en el puesto [" + fila + "][" + columna + "]: " + propietario);
                System.out.println();
            } else {
                System.out.println("El puesto está vacío.");
                System.out.println();
            }
        } else {
            System.out.println("Los valores de fila y columna están fuera de los límites de la matriz.");
            System.out.println();
        }
    }

        public static void generarFactura(Vehiculo vehiculo, LocalDateTime horaEntrada, double tarifaPorHora) {
            LocalDateTime horaSalida = LocalDateTime.now(); // Obtener la hora actual como hora de salida
            long horasEstacionado = Duration.between(horaEntrada, horaSalida).toHours(); // Calcular horas estacionado
            double totalAPagar = horasEstacionado * tarifaPorHora; // Calcular total a pagar
        
            // Imprimir la factura
            System.out.println("Factura:");
            System.out.println("==========================================");
            System.out.println("Nombre del propietario: " + vehiculo.getPersona().getNombre());
            System.out.println("Cédula del propietario: " + vehiculo.getPersona().getCedula());
            System.out.println("Teléfono del propietario: " + vehiculo.getPersona().getTelefono());
            System.out.println("Placa del vehículo: " + vehiculo.getPlaca());
            System.out.println("Modelo del vehículo: " + vehiculo.getModelo());
            System.out.println("Hora de entrada: " + horaEntrada);
            System.out.println("Hora de salida: " + horaSalida);
            System.out.println("Tiempo estacionado (horas): " + horasEstacionado);
            System.out.println("Tarifa por hora: " + tarifaPorHora);
            System.out.println("Total a pagar: " + totalAPagar);
            System.out.println("==========================================");
        }
}

        


