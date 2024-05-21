package co.edu.uniquindio.poo;

/*Creacion de la clase padre Vehiculo que se agrega a un Puesto*/

public abstract class Vehiculo{
    protected String placa;
    protected String modelo;
    protected Persona persona;

/*Constructor para la clase Vehiculo */
    public Vehiculo(String placa, String modelo, Persona persona) {
        this.placa = placa;
        this.modelo = modelo;
        this.persona = persona;

//aseerts
    assert placa != null && !placa.isBlank() : "La placa no debe estar vacio y debe ser diferente de null";
    assert modelo != null && !modelo.isBlank() : "El modelo no debe estar vacio y debe ser diferente de null";
    assert persona != null : "El propietario debe existir";

    }

/*Getters y setters*/
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

/*Método abstracto para tener informacion*/
    public void mostrarInformacion(){
    System.out.println("Vehiculo: " + placa + "\n" + "Modelo" + modelo + "\n" + "Propietario: " + persona);
    }
<<<<<<< Updated upstream
=======

    public static void ingresarVehiculo() {
        System.out.println();
        System.out.print("Ingrese la fila del puesto: ");
        int fila = scanner.nextInt();
        System.out.print("Ingrese la columna del puesto: ");
        int columna = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese la placa del vehículo: ");
        String placa = scanner.nextLine();
        System.out.print("Ingrese el modelo del vehículo: ");
        String modelo = scanner.nextLine();
        
        // Llamada al método registrarPropietario para crear una instancia de Persona
        Persona propietario = Persona.registrarPropietario();
    
        System.out.print("Ingrese el tipo de vehículo (moto o carro): ");
        String tipo = scanner.nextLine();

        if (tipo.equalsIgnoreCase("moto")) {
            System.out.print("Ingrese el tipo de moto (clásica o híbrida): ");
            String tipoMoto = scanner.nextLine().toUpperCase();
            System.out.print("Ingrese el velocidad del vehículo: ");
            int velocidad = scanner.nextInt();
            TipoMoto tipoMot;
            
            try {
                tipoMot = TipoMoto.valueOf(tipoMoto);
            } catch (IllegalArgumentException e) {
                System.out.println("Tipo de moto no válido.");
                return;
            }
            Vehiculo moto = new Moto(placa, modelo, propietario,velocidad,tipoMot);
            Parqueadero.ubicarVehiculo(fila, columna, moto);
            System.out.println("Resgistro exitoso!");
            } else if (tipo.equalsIgnoreCase("carro")) {
                Vehiculo carro = new Carro(placa, modelo, propietario); // Crear una instancia de Carro
                Parqueadero.ubicarVehiculo(fila, columna, carro);
                System.out.println("Resgistro exitoso!");
            } else {
                System.out.println("Tipo de vehículo no válido.");
            }
            System.out.println("Resgistro exitoso!");
            System.out.println();
            System.out.println();
    }

    public static void desocupar() {
        System.out.print("Ingrese la placa del vehículo para desocupar su puesto: ");
        String placaDesocupar = scanner.nextLine();
        
        boolean encontrado = false;
        for (int fila = 0; fila < Parqueadero.getPuestos().length; fila++) {
            for (int columna = 0; columna < Parqueadero.getPuestos()[fila].length; columna++) {
                Puesto puesto = Parqueadero.getPuestos()[fila][columna];
                if (puesto.estaOcupado() && puesto.getVehiculoOcupante().getPlaca().equalsIgnoreCase(placaDesocupar)) {
                    LocalDateTime horaEntrada = puesto.getFechaHoraRegistro(); // Obtener la hora de entrada del puesto ocupado
                    int tarifaPorHora = (int) puesto.getTarifa();
                    
                    Parqueadero.generarFactura(puesto.getVehiculoOcupante(), horaEntrada, tarifaPorHora);
                    puesto.desocupar();
                    System.out.println("El puesto ocupado por el vehículo con placa " + placaDesocupar + " ha sido desocupado.");
                    encontrado = true;
                    break;
                }
            }
            if (encontrado) {
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún vehículo con la placa " + placaDesocupar + " en el parqueadero.");
        }

    }
    

>>>>>>> Stashed changes
}