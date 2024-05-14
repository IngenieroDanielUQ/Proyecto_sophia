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
}