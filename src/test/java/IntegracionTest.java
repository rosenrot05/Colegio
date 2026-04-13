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
public class IntegracionTest {
    
        private Estudiante crearEstudiante(String nombre, String dir, String tel, String fec,
                                       String cod, String grado, String acud) {
        Estudiante e = new Estudiante(nombre, dir, tel, fec);
        e.setCodigoEstudiante(cod);
        e.setGrado(grado);
        e.setAcudiente(acud);
        return e;
    }

    @Test
    public void testFlujoCompletoRegistrarYBuscar() {
        ColegioController control = new ColegioController();
        control.registrar(new Profesor("Christian Villarreal", "Calle 10", "3001234567", "07/07/1988",
                                       "12345678", "Ingles", 35000, 80));
        control.registrar(new Profesor("Rocio Cano", "Av. 6", "3109876543", "22/07/1975",
                                       "87654321", "Ciencias", 28000, 60));
        control.registrar(crearEstudiante("Paola Valenzuela", "Calle 3", "3154321098",
                                          "10/05/2010", "EST001", "9A", "Carmen Gomez"));
        control.registrar(crearEstudiante("Mercedes Escobar", "Cra 15", "3165432109",
                                          "18/09/2011", "EST002", "8B", "Luis Ruiz"));
        assertEquals(2, control.obtenerProfesores().size());
        assertEquals(2, control.obtenerEstudiantes().size());
    }

    @Test
    public void testFlujoRegistrarYBuscarPorNombre() {
        ColegioController control = new ColegioController();
        control.registrar(new Profesor("Christian Villarreal", "Calle 10", "3001234567", "07/07/1988",
                                       "12345678", "Ingles", 35000, 80));
        control.registrar(new Profesor("Rocio Cano", "Av. 6", "3109876543", "22/07/1975",
                                       "87654321", "Ciencias", 28000, 60));
        assertNotNull(control.buscarProfesor("Christian Villarreal"));
        assertNotNull(control.buscarProfesor("Rocio Cano"));
    }

    @Test
    public void testFlujoRegistrarYBuscarPorIndice() {
        ColegioController control = new ColegioController();
        control.registrar(new Profesor("Christian Villarreal", "Calle 10", "3001234567", "07/07/1988",
                                       "12345678", "Ingles", 35000, 80));
        control.registrar(new Profesor("Rocio Cano", "Av. 6", "3109876543", "22/07/1975",
                                       "87654321", "Ciencias", 28000, 60));
        assertEquals("Christian Villarreal", control.buscarProfesor(0).getNombre());
        assertEquals("Rocio Cano", control.buscarProfesor(1).getNombre());
    }

    @Test
    public void testFlujoReporteEstudiantesCompleto() {
        ColegioController control = new ColegioController();
        control.registrar(crearEstudiante("Paola Valenzuela", "Calle 3", "3154321098",
                                          "10/05/2010", "EST001", "9A", "Carmen Gomez"));
        control.registrar(crearEstudiante("Mercedes Escobar", "Cra 15", "3165432109",
                                          "18/09/2011", "EST002", "8B", "Luis Ruiz"));
        String reporte = control.reporteEstudiantes();
        assertTrue(reporte.contains("Paola Valenzuela"));
        assertTrue(reporte.contains("Mercedes Escobar"));
        assertTrue(reporte.contains("Total: 2"));
    }

    @Test
    public void testFlujoReporteProfesoresOrdenado() {
        ColegioController control = new ColegioController();
        control.registrar(new Profesor("Rocio Cano", "Av. 6", "3109876543", "22/07/1975",
                                       "87654321", "Ciencias", 28000, 60));
        control.registrar(new Profesor("Christian Villarreal", "Calle 10", "3001234567", "07/07/1988",
                                       "12345678", "Ingles", 35000, 80));
        String reporte = control.reporteProfesoresPorSalario();
        assertTrue(reporte.indexOf("Christian Villarreal") < reporte.indexOf("Rocio Cano"));
    }

    @Test
    public void testFlujoTotalPrestacionesEnReporte() {
        ColegioController control = new ColegioController();
        control.registrar(new Profesor("Christian Villarreal", "Calle 10", "3001234567", "07/07/1988",
                                       "12345678", "Ingles", 35000, 80));
        control.registrar(new Profesor("Rocio Cano", "Av. 6", "3109876543", "22/07/1975",
                                       "87654321", "Ciencias", 28000, 60));
        assertTrue(control.reporteProfesoresPorSalario().contains("TOTAL PRESTACIONES"));
    }

    @Test
    public void testFlujoPolimorfismoGetInfo() {
        Profesor profesor = new Profesor("Christian Villarreal", "Calle 10", "3001234567", "07/07/1988",
                                         "12345678", "Ingles", 35000, 80);
        Estudiante estudiante = crearEstudiante("Paola Valenzuela", "Calle 3", "3154321098",
                                                "10/05/2010", "EST001", "9A", "Carmen Gomez");
        assertTrue(profesor.getInfo().contains("12345678"));
        assertTrue(estudiante.getInfo().contains("EST001"));
        assertTrue(profesor.getInfo().contains("Christian Villarreal"));
        assertTrue(estudiante.getInfo().contains("Paola Valenzuela"));
    }
}
