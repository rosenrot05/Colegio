/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
import modelo.Persona;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rosam
 */
public class PersonaTest {
        @Test
    public void testGetNombre() {
        Persona p = new Persona("Christian Villarreal", "Calle 10", "3001234567", "07/07/1988");
        assertEquals("Christian Villarreal", p.getNombre());
    }

    @Test
    public void testGetDireccion() {
        Persona p = new Persona("Christian Villarreal", "Calle 10", "3001234567", "07/07/1988");
        assertEquals("Calle 10", p.getDireccion());
    }

    @Test
    public void testGetTelefono() {
        Persona p = new Persona("Christian Villarreal", "Calle 10", "3001234567", "07/07/1988");
        assertEquals("3001234567", p.getTelefono());
    }

    @Test
    public void testGetFechaNacimiento() {
        Persona p = new Persona("Christian Villarreal", "Calle 10", "3001234567", "07/07/1988");
        assertEquals("07/07/1988", p.getFechaNacimiento());
    }

    @Test
    public void testSetNombre() {
        Persona p = new Persona("Christian Villarreal", "Calle 10", "3001234567", "07/07/1988");
        p.setNombre("Rocio Cano");
        assertEquals("Rocio Cano", p.getNombre());
    }

    @Test
    public void testSetDireccion() {
        Persona p = new Persona("Christian Villarreal", "Calle 10", "3001234567", "07/07/1988");
        p.setDireccion("Av. 6");
        assertEquals("Av. 6", p.getDireccion());
    }

    @Test
    public void testSetTelefono() {
        Persona p = new Persona("Christian Villarreal", "Calle 10", "3001234567", "07/07/1988");
        p.setTelefono("3109876543");
        assertEquals("3109876543", p.getTelefono());
    }

    @Test
    public void testSetFechaNacimiento() {
        Persona p = new Persona("Christian Villarreal", "Calle 10", "3001234567", "07/07/1988");
        p.setFechaNacimiento("22/07/1975");
        assertEquals("22/07/1975", p.getFechaNacimiento());
    }

    @Test
    public void testGetInfoContieneNombre() {
        Persona p = new Persona("Christian Villarreal", "Calle 10", "3001234567", "07/07/1988");
        assertTrue(p.getInfo().contains("Christian Villarreal"));
    }

    @Test
    public void testGetInfoContieneTelefono() {
        Persona p = new Persona("Christian Villarreal", "Calle 10", "3001234567", "07/07/1988");
        assertTrue(p.getInfo().contains("3001234567"));
    }
}
