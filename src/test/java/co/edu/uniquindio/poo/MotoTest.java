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
public class MotoTest {
    private static final Logger LOG = Logger.getLogger(MotoTest.class.getName());

    /**
     * Test Datos completos :-)
     */
    @Test
    public void TestDatosCompletos() {
        LOG.info("Iniciado test Datos Completos");
        
        Persona miPersona = new Persona("Daniel", "1038646923", "3146745272", TipoPersona.COMPRADOR);
        Moto miMoto = new Moto("AFM 37C", "Discover 125", miPersona, 120, TipoMoto.CLASICA);

        assertEquals("AFM 37C", miMoto.getPlaca());
        assertEquals("Discover 125", miMoto.getModelo());
        assertEquals(miPersona, miMoto.getPersona());
        assertEquals(120, miMoto.getVelocidadMax());
        assertEquals(TipoMoto.CLASICA, miMoto.getTipoMoto());

        LOG.info("Finalizando test Datos Completos");
    }

    /**
     * Test Datos Vacios :-)
     */
    @Test
    public void TestDatosVacios() {
        LOG.info("Iniciado test Datos Vacios");
    
        assertThrows(Throwable.class, () -> new Moto("", "",  null, 0, null));

        LOG.info("Finalizando test Datos Vacios");
    }

    /**
     * Test Datos nulos :-)
     */
    @Test
    public void TestDatosnull() {
        LOG.info("Iniciado test Datos null");
    
        assertThrows(Throwable.class, () -> new Moto(null, null,  null, 0, null));

        LOG.info("Finalizando test Datos Vacios");
    }

    /**
     * Test velocidad mayor a cero :-)
     */
    @Test
    public void TestDatosMayorACero() {
        LOG.info("Iniciado Test velocidad mayor a cero");
        
        Persona miPersona = new Persona("Daniel", "1038646923", "3146745272", TipoPersona.COMPRADOR);
    
        assertThrows(Throwable.class, () -> new Moto ("AFM 37C", "Discover 125", miPersona, -120, TipoMoto.CLASICA));

        LOG.info("Finalizando Test velocidad mayor a cero");
    }
}
