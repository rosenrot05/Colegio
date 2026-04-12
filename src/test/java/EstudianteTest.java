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
        @Test
    public void testNombreEstudiante1() {
        Estudiante estudiante1 = new Estudiante("Paola Valenzuela", "Calle 3", "3154321098", "10/05/2010",
                                                "EST001", "9A", "Carmen Gomez");
        assertEquals("Paola Valenzuela", estudiante1.getNombre());
    }

    @Test
    public void testNombreEstudiante2() {
        Estudiante estudiante2 = new Estudiante("Mercedes Escobar", "Cra 15", "3165432109", "18/09/2011",
                                                "EST002", "8B", "Luis Ruiz");
        assertEquals("Mercedes Escobar", estudiante2.getNombre());
    }

    @Test
    public void testCodigoEstudiante1() {
        Estudiante estudiante1 = new Estudiante("Paola Valenzuela", "Calle 3", "3154321098", "10/05/2010",
                                                "EST001", "9A", "Carmen Gomez");
        assertEquals("EST001", estudiante1.getCodigoEstudiante());
    }

    @Test
    public void testCodigoEstudiante2() {
        Estudiante estudiante2 = new Estudiante("Mercedes Escobar", "Cra 15", "3165432109", "18/09/2011",
                                                "EST002", "8B", "Luis Ruiz");
        assertEquals("EST002", estudiante2.getCodigoEstudiante());
    }

    @Test
    public void testGradoEstudiante1() {
        Estudiante estudiante1 = new Estudiante("Paola Valenzuela", "Calle 3", "3154321098", "10/05/2010",
                                                "EST001", "9A", "Carmen Gomez");
        assertEquals("9A", estudiante1.getGrado());
    }

    @Test
    public void testGradoEstudiante2() {
        Estudiante estudiante2 = new Estudiante("Mercedes Escobar", "Cra 15", "3165432109", "18/09/2011",
                                                "EST002", "8B", "Luis Ruiz");
        assertEquals("8B", estudiante2.getGrado());
    }

    @Test
    public void testAcudienteEstudiante1() {
        Estudiante estudiante1 = new Estudiante("Paola Valenzuela", "Calle 3", "3154321098", "10/05/2010",
                                                "EST001", "9A", "Carmen Gomez");
        assertEquals("Carmen Gomez", estudiante1.getAcudiente());
    }

    @Test
    public void testAcudienteEstudiante2() {
        Estudiante estudiante2 = new Estudiante("Mercedes Escobar", "Cra 15", "3165432109", "18/09/2011",
                                                "EST002", "8B", "Luis Ruiz");
        assertEquals("Luis Ruiz", estudiante2.getAcudiente());
    }

    @Test
    public void testSetGradoEstudiante() {
        Estudiante estudiante1 = new Estudiante("Paola Valenzuela", "Calle 3", "3154321098", "10/05/2010",
                                                "EST001", "9A", "Carmen Gomez");
        estudiante1.setGrado("10A");
        assertEquals("10A", estudiante1.getGrado());
    }
}
