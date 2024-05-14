/**
 * Clase para probar el funcionamiento del código
 * @author Hector Daniel Gonzalez Sanchez
 * @since 2024-05
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class CarroTest {
    private static final Logger LOG = Logger.getLogger(CarroTest.class.getName());

    /**
     * Test Datos completos :-)
     */
    @Test
    public void TestDatosCompletos() {
        LOG.info("Iniciado test Datos Completos");
        
        Persona miPersona = new Persona("Daniel", "1038646923", "3146745272", TipoPersona.COMPRADOR);
        Carro miCarro = new Carro("RGL 484", "Chevrolet Aveo Sedan", miPersona);

        assertEquals("RGL 484", miCarro.getPlaca());
        assertEquals("Chevrolet Aveo Sedan", miCarro.getModelo());
        assertEquals(miPersona, miCarro.getPersona());

        LOG.info("Finalizando test Datos Completos");
    }

    /**
     * Test Datos Vacios :-)
     */
    @Test
    public void TestDatosVacios() {
        LOG.info("Iniciado test Datos Vacios");
    
        assertThrows(Throwable.class, () -> new Carro("", "", null));

        LOG.info("Finalizando test Datos Vacios");
    }

    /**
     * Test Datos nulos :-)
     */
    @Test
    public void TestDatosnull() {
        LOG.info("Iniciado test Datos null");
    
        assertThrows(Throwable.class, () -> new Carro(null, null, null));

        LOG.info("Finalizando test Datos Vacios");
    }

}
