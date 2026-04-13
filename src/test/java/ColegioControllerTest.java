/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
import modelo.Profesor;
import modelo.Estudiante;
import controlador.ColegioController;
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


public class ColegioControllerTest {
    
        private Estudiante crearEstudiante(String nombre, String dir, String tel, String fec,
                                       String cod, String grado, String acud) {
        Estudiante e = new Estudiante(nombre, dir, tel, fec);
        e.setCodigoEstudiante(cod);
        e.setGrado(grado);
        e.setAcudiente(acud);
        return e;
    }
        
        @Test
    public void testListaInicialProfesoresVacia() {
        ColegioController control = new ColegioController();
        assertEquals(0, control.obtenerProfesores().size());
    }

    @Test
    public void testListaInicialEstudiantesVacia() {
        ColegioController control = new ColegioController();
        assertEquals(0, control.obtenerEstudiantes().size());
    }

    @Test
    public void testRegistrarUnProfesor() {
        ColegioController control = new ColegioController();
        control.registrar(new Profesor("Christian Villarreal", "Calle 10", "3001234567", "07/07/1988",
                                       "12345678", "Ingles", 35000, 80));
        assertEquals(1, control.obtenerProfesores().size());
    }

    @Test
    public void testRegistrarDosProfesor() {
        ColegioController control = new ColegioController();
        control.registrar(new Profesor("Christian Villarreal", "Calle 10", "3001234567", "07/07/1988",
                                       "12345678", "Ingles", 35000, 80));
        control.registrar(new Profesor("Rocio Cano", "Av. 6", "3109876543", "22/07/1975",
                                       "87654321", "Ciencias", 28000, 60));
        assertEquals(2, control.obtenerProfesores().size());
    }

    @Test
    public void testRegistrarUnEstudiante() {
        ColegioController control = new ColegioController();
        control.registrar(crearEstudiante("Paola Valenzuela", "Calle 3", "3154321098",
                                          "10/05/2010", "EST001", "9A", "Carmen Gomez"));
        assertEquals(1, control.obtenerEstudiantes().size());
    }

    @Test
    public void testRegistrarDosEstudiantes() {
        ColegioController control = new ColegioController();
        control.registrar(crearEstudiante("Paola Valenzuela", "Calle 3", "3154321098",
                                          "10/05/2010", "EST001", "9A", "Carmen Gomez"));
        control.registrar(crearEstudiante("Mercedes Escobar", "Cra 15", "3165432109",
                                          "18/09/2011", "EST002", "8B", "Luis Ruiz"));
        assertEquals(2, control.obtenerEstudiantes().size());
    }

    @Test
    public void testBuscarProfesorPorNombreChristian() {
        ColegioController control = new ColegioController();
        control.registrar(new Profesor("Christian Villarreal", "Calle 10", "3001234567", "07/07/1988",
                                       "12345678", "Ingles", 35000, 80));
        Profesor encontrado = control.buscarProfesor("Christian Villarreal");
        assertNotNull(encontrado);
        assertEquals("Christian Villarreal", encontrado.getNombre());
    }

    @Test
    public void testBuscarProfesorPorNombreRocio() {
        ColegioController control = new ColegioController();
        control.registrar(new Profesor("Rocio Cano", "Av. 6", "3109876543", "22/07/1975",
                                       "87654321", "Ciencias", 28000, 60));
        Profesor encontrado = control.buscarProfesor("Rocio Cano");
        assertNotNull(encontrado);
        assertEquals("Rocio Cano", encontrado.getNombre());
    }

    @Test
    public void testBuscarProfesorPorIndice0() {
        ColegioController control = new ColegioController();
        control.registrar(new Profesor("Christian Villarreal", "Calle 10", "3001234567", "07/07/1988",
                                       "12345678", "Ingles", 35000, 80));
        control.registrar(new Profesor("Rocio Cano", "Av. 6", "3109876543", "22/07/1975",
                                       "87654321", "Ciencias", 28000, 60));
        assertEquals("Christian Villarreal", control.buscarProfesor(0).getNombre());
    }

    @Test
    public void testBuscarProfesorPorIndice1() {
        ColegioController control = new ColegioController();
        control.registrar(new Profesor("Christian Villarreal", "Calle 10", "3001234567", "07/07/1988",
                                       "12345678", "Ingles", 35000, 80));
        control.registrar(new Profesor("Rocio Cano", "Av. 6", "3109876543", "22/07/1975",
                                       "87654321", "Ciencias", 28000, 60));
        assertEquals("Rocio Cano", control.buscarProfesor(1).getNombre());
    }

    @Test
    public void testBuscarProfesorInexistente() {
        ColegioController control = new ColegioController();
        control.registrar(new Profesor("Christian Villarreal", "Calle 10", "3001234567", "07/07/1988",
                                       "12345678", "Ingles", 35000, 80));
        assertNull(control.buscarProfesor("Nadie"));
    }

    @Test
    public void testBuscarProfesorIndiceInvalido() {
        ColegioController control = new ColegioController();
        control.registrar(new Profesor("Christian Villarreal", "Calle 10", "3001234567", "07/07/1988",
                                       "12345678", "Ingles", 35000, 80));
        assertNull(control.buscarProfesor(99));
    }

    @Test
    public void testReporteEstudiantesContienePaola() {
        ColegioController control = new ColegioController();
        control.registrar(crearEstudiante("Paola Valenzuela", "Calle 3", "3154321098",
                                          "10/05/2010", "EST001", "9A", "Carmen Gomez"));
        assertTrue(control.reporteEstudiantes().contains("Paola Valenzuela"));
    }

    @Test
    public void testReporteEstudiantesContieneMercedes() {
        ColegioController control = new ColegioController();
        control.registrar(crearEstudiante("Mercedes Escobar", "Cra 15", "3165432109",
                                          "18/09/2011", "EST002", "8B", "Luis Ruiz"));
        assertTrue(control.reporteEstudiantes().contains("Mercedes Escobar"));
    }

    @Test
    public void testReporteProfesoresContieneChristian() {
        ColegioController control = new ColegioController();
        control.registrar(new Profesor("Christian Villarreal", "Calle 10", "3001234567", "07/07/1988",
                                       "12345678", "Ingles", 35000, 80));
        assertTrue(control.reporteProfesoresPorSalario().contains("Christian Villarreal"));
    }

    @Test
    public void testReporteProfesoresOrdenado() {
        ColegioController control = new ColegioController();
        control.registrar(new Profesor("Christian Villarreal", "Calle 10", "3001234567", "07/07/1988",
                                       "12345678", "Ingles", 35000, 80));
        control.registrar(new Profesor("Rocio Cano", "Av. 6", "3109876543", "22/07/1975",
                                       "87654321", "Ciencias", 28000, 60));
        String reporte = control.reporteProfesoresPorSalario();
        assertTrue(reporte.indexOf("Christian Villarreal") < reporte.indexOf("Rocio Cano"));
    }
}
