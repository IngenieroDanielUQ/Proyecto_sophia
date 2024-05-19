package co.edu.uniquindio.poo;

import java.time.LocalDateTime;

/*Creacion de la clase principal Parqueadero */
public class Parqueadero {
    int[][] puestos;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSalida;
    public Puesto puesto;

    /* Constructor */
    public Parqueadero(int [][]puestos, LocalDateTime horaEntrada, LocalDateTime horaSalida, Puesto puesto) {
        this.puestos = puestos;
        this.horaEntrada = horaEntrada;
        this.puesto = puesto;
    }

    /* Getters y setters */
    public int[][] getPuestos() {
        return puestos;
    }

    public void setPuestos(int[][] puestos) {
        this.puestos = puestos;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
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

    public void mostrarInformacion() {
        System.out.println("Numero de puestos: " + puestos + "\n");
        System.out.println("Hora de entrada: " + horaEntrada);
        System.out.println(puesto);

    }
}
