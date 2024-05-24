package co.edu.uniquindio.poo;

import java.time.LocalDateTime;

/*Creacion de la clase principal Puesto que compone al parqueadero*/

public class Puesto {
    private boolean estaOcupado;
    private double tarifa;
    private Vehiculo vehiculoOcupante;
    private LocalDateTime fechaHoraRegistro;
    


/*Constructor*/
public Puesto(boolean estaOcupado, double tarifa, Vehiculo vehiculoOcupante) {
    this.estaOcupado = false;
    this.tarifa = tarifa;
    this.vehiculoOcupante = vehiculoOcupante;
    this.fechaHoraRegistro = null; // Inicialmente no hay fecha y hora de registro

}

//Getters y setters

    public boolean isEstaOcupado() {
        return estaOcupado;
    }


    public void setEstaOcupado(boolean estaOcupado) {
        this.estaOcupado = estaOcupado;
    }


    public double getTarifa() {
        return tarifa;
    }


    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }



    public Vehiculo getVehiculoOcupante() {
        return vehiculoOcupante;
    }


    public void setVehiculoOcupante(Vehiculo vehiculoOcupante) {
        this.vehiculoOcupante = vehiculoOcupante;
    }


    public LocalDateTime getFechaHoraRegistro() {
        return fechaHoraRegistro;
    }
    
    public Persona getPropietario() {
        return vehiculoOcupante != null ?  vehiculoOcupante.getPersona() : null;
    }

    

/*Método verificar disponibilidad de puesto*/
    
/*Método ocupar*/
    public void ocupar(boolean estaOcupado, double tarifa, Vehiculo vehiculoOcupante){
        if (!this.estaOcupado) {
            this.estaOcupado = true;
            this.fechaHoraRegistro = LocalDateTime.now(); // Registrar la fecha y hora actuales
            this.vehiculoOcupante = vehiculoOcupante;
            System.out.println("El puesto ha sido ocupado por el vehículo " + this.vehiculoOcupante.getPlaca());
        } else {
            System.out.println("El puesto ya está ocupado.");
        }

    }

    /*Método desocupar*/
    public void desocupar(){
        if (estaOcupado) {
            this.estaOcupado = false;
            this.vehiculoOcupante = null;
            this.fechaHoraRegistro = null; // Resetear la fecha y hora de registro

            System.out.println("El puesto ha sido desocupado.");
        } else {
            System.out.println("El puesto ya está desocupado.");
        }
        
    }
    
/*Método informacion*/
    @Override
    public String toString() {
        return "\n" + "Puesto " + "\n" + 
                "¿Esta ocupado?:" + estaOcupado + "\n" + "\n"+
                "Vehiculo ocupante: " + vehiculoOcupante + "\n" ;
    }

    public void mostrarInformacion(){
        System.out.println(toString());
    }

    public boolean estaOcupado() {
        return estaOcupado;
    }

}
