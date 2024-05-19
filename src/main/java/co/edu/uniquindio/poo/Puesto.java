package co.edu.uniquindio.poo;

/*Creacion de la clase principal Puesto que compone al parqueadero*/

public class Puesto {
    private boolean estaOcupado;
    private double tarifa;
    private Vehiculo vehiculoOcupante;


/*Constructor*/
public Puesto(boolean estaOcupado, double tarifa, Vehiculo vehiculoOcupante) {
    this.estaOcupado = estaOcupado;
    this.tarifa = tarifa;
    this.vehiculoOcupante = vehiculoOcupante;
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



/*Método ocupar*/
    public void ocupar(){
        if (!estaOcupado) {
            this.estaOcupado = true;
            System.out.println("El puesto ha sido ocupado por el vehículo " + vehiculoOcupante.getPlaca());
        } else {
            System.out.println("El puesto ya está ocupado.");
        }

    }

    /*Método desocupar*/
    public void desocupar(){
        if (estaOcupado) {
            this.estaOcupado = false;
            this.vehiculoOcupante = null;
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
}
