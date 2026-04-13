/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
import modelo.Estudiante;
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
public class EstudianteTest {
    
        private Estudiante crearEstudiante1() {
        Estudiante e = new Estudiante("Paola Valenzuela", "Calle 3", "3154321098", "10/05/2010");
        e.setCodigoEstudiante("EST001");
        e.setGrado("9A");
        e.setAcudiente("Carmen Gomez");
        return e;
    }

    private Estudiante crearEstudiante2() {
        Estudiante e = new Estudiante("Mercedes Escobar", "Cra 15", "3165432109", "18/09/2011");
        e.setCodigoEstudiante("EST002");
        e.setGrado("8B");
        e.setAcudiente("Luis Ruiz");
        return e;
    }

    @Test
    public void testNombreEstudiante1() {
        assertEquals("Paola Valenzuela", crearEstudiante1().getNombre());
    }

    @Test
    public void testNombreEstudiante2() {
        assertEquals("Mercedes Escobar", crearEstudiante2().getNombre());
    }

    @Test
    public void testCodigoEstudiante1() {
        assertEquals("EST001", crearEstudiante1().getCodigoEstudiante());
    }

    @Test
    public void testCodigoEstudiante2() {
        assertEquals("EST002", crearEstudiante2().getCodigoEstudiante());
    }

    @Test
    public void testGradoEstudiante1() {
        assertEquals("9A", crearEstudiante1().getGrado());
    }

    @Test
    public void testGradoEstudiante2() {
        assertEquals("8B", crearEstudiante2().getGrado());
    }

    @Test
    public void testAcudienteEstudiante1() {
        assertEquals("Carmen Gomez", crearEstudiante1().getAcudiente());
    }

    @Test
    public void testAcudienteEstudiante2() {
        assertEquals("Luis Ruiz", crearEstudiante2().getAcudiente());
    }

    @Test
    public void testSetGradoEstudiante() {
        Estudiante e = crearEstudiante1();
        e.setGrado("10A");
        assertEquals("10A", e.getGrado());
    }
}
