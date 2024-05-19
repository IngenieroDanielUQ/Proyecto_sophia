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
        
    }
}
