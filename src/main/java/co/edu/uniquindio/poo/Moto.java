package co.edu.uniquindio.poo;

/*Creacion de la clase hija Moto heredada de Vehiculo*/

public class Moto extends Vehiculo {
    private int velocidadMax;
    private TipoMoto tipoMoto;

    /* Super Constructor para la clase hija moto */
    public Moto(String placa, String modelo, Persona propietario, int velocidadMax, TipoMoto tipoMoto) {
        super(placa, modelo, propietario);
        this.velocidadMax = velocidadMax;
        this.tipoMoto = tipoMoto;

        // aseerts
        assert placa != null && !placa.isBlank() : "La placa no debe estar vacio y debe ser diferente de null";
        assert modelo != null && !modelo.isBlank() : "El modelo no debe estar vacio y debe ser diferente de null";
        assert tipoMoto != null : "El modelo no debe estar vacio y debe ser diferente de null";
        assert persona != null : "El propietario debe existir";
        assert velocidadMax > 0 : "La velocidad debe ser mayor a cero";

    }

    /* Getters y setters */
    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public TipoMoto getTipoMoto() {
        return tipoMoto;
    }

    public void setTipoMoto(TipoMoto tipoMoto) {
        this.tipoMoto = tipoMoto;
    }

    /* informacion */
    @Override
    public String toString() {
        return "\n" +
                "Placa: " + placa + "\n" +
                "Modelo: " + modelo + "\n" +
                "Velocidad Maxima:" + velocidadMax + "\n" +
                "Tipo de moto: " + tipoMoto + "\n" + "\n" +
                "Persona encargada" + persona + "\n";
    }
}
