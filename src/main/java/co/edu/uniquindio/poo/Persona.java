package co.edu.uniquindio.poo;

import java.util.Scanner;

/*Creacion de la clase persona que se agrega en Vehiculo*/
public class Persona {
    private String nombre;
    private String cedula;
    private String telefono;
    private TipoPersona tipoPersona;

    /* Constructor para la clase persona */
    public Persona(String nombre, String cedula, String telefono, TipoPersona tipoPersona) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.tipoPersona = tipoPersona;

        // aseerts
        assert nombre != null && !nombre.isBlank() : "La nombre no debe estar vacio y debe ser diferente de null";
        assert cedula != null && !cedula.isBlank() : "La cedula no debe estar vacio y debe ser diferente de null";
        assert telefono != null && !telefono.isEmpty() : "El modelo no debe estar vacio y debe ser diferente de null";
        assert tipoPersona != null : "El propietario debe existir";
    }

    /* Getters y setters */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public TipoPersona getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(TipoPersona tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    /* informacion */
    @Override
    public String toString() {
        return "\n" +
                "Nombre: " + nombre + "\n" +
                "Cedula: " + cedula + "\n" +
                "Telefono:" + telefono + "\n" +
                "Tipo:" + tipoPersona + "\n";
    }

    // Método estático para registrar un nuevo propietario
    public static Persona registrarPropietario() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del propietario: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la cédula del propietario: ");
        String cedula = scanner.nextLine();
        System.out.print("Ingrese el teléfono del propietario: ");
        String telefono = scanner.nextLine();
        // Suponiendo que también necesitas el tipo de persona
        System.out.print("Ingrese el tipo de persona (propietario o comprador): ");
        String tipo = scanner.nextLine();
        TipoPersona tipoPersona = TipoPersona.valueOf(tipo.toUpperCase()); // Convertir a enum

        // Creaamos una nueva instancia de Persona con los datos ingresados por el
        // usuario
        return new Persona(nombre, cedula, telefono, tipoPersona);
    }
}
