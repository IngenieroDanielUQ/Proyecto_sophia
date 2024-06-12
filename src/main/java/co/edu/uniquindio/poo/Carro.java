package co.edu.uniquindio.poo;

/*Creacion de la clase hija Carro heredada de Vehiculo*/

public class Carro extends Vehiculo {

    /* Super Constructor para la clase hija Carro */
    public Carro(String placa, String modelo, Persona persona) {
        super(placa, modelo, persona);

        // aseerts
        assert placa != null && !placa.isBlank() : "La placa no debe estar vacio y debe ser diferente de null";
        assert modelo != null && !modelo.isBlank() : "El modelo no debe estar vacio y debe ser diferente de null";
        assert persona != null : "El propietario debe existir";
    }

    /* informacion */
    @Override
    public String toString() {
        return "\n" +
                "Placa: " + placa + "\n" +
                "Modelo: " + modelo + "\n" + "\n" +
                "Persona encargada:" + persona + "\n";
    }
}
