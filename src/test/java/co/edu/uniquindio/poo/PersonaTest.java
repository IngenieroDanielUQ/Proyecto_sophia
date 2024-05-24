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
public class PersonaTest {
    private static final Logger LOG = Logger.getLogger(PersonaTest.class.getName());

    /**
     * Test Datos completos :-)
     */
    @Test
    public void TestDatosCompletos() {
        LOG.info("Iniciado test Datos Completos");

        Persona miPersona = new Persona("Daniel", "1038646923", "3146745272", TipoPersona.COMPRADOR);

        assertEquals("Daniel", miPersona.getNombre());
        assertEquals("1038646923", miPersona.getCedula());
        assertEquals("3146745272", miPersona.getTelefono());
        assertEquals(TipoPersona.COMPRADOR, miPersona.getTipoPersona());

        LOG.info("Finalizando test Datos Completos");
    }

    /**
     * Test Datos Vacios :-)
     */
    @Test
    public void TestDatosVacios() {
        LOG.info("Iniciado test Datos Vacios");

        assertThrows(Throwable.class, () -> new Persona("", "", "", null));
        ;

        LOG.info("Finalizando test Datos Vacios");
    }

    /**
     * Test Datos nulos :-)
     */
    @Test
    public void TestDatosnull() {
        LOG.info("Iniciado test Datos null");

        assertThrows(Throwable.class, () -> new Persona(null, null, null, null));
        ;

        LOG.info("Finalizando test Datos null");
    }

}
