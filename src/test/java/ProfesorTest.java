/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */


import modelo.Profesor;
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
public class ProfesorTest {
        @Test
    public void testNombreProfesor1() {
        Profesor profesor1 = new Profesor("Christian Villarreal", "Calle 10", "3001234567", "07/07/1988",
                                          "12345678", "Ingles", 35000, 80);
        assertEquals("Christian Villarreal", profesor1.getNombre());
    }

    @Test
    public void testNombreProfesor2() {
        Profesor profesor2 = new Profesor("Rocio Cano", "Av. 6", "3109876543", "22/07/1975",
                                          "87654321", "Ciencias", 28000, 60);
        assertEquals("Rocio Cano", profesor2.getNombre());
    }

    @Test
    public void testCedulaProfesor1() {
        Profesor profesor1 = new Profesor("Christian Villarreal", "Calle 10", "3001234567", "07/07/1988",
                                          "12345678", "Ingles", 35000, 80);
        assertEquals("12345678", profesor1.getCedula());
    }

    @Test
    public void testAreaProfesor1() {
        Profesor profesor1 = new Profesor("Christian Villarreal", "Calle 10", "3001234567", "07/07/1988",
                                          "12345678", "Ingles", 35000, 80);
        assertEquals("Ingles", profesor1.getArea());
    }

    @Test
    public void testAreaProfesor2() {
        Profesor profesor2 = new Profesor("Rocio Cano", "Av. 6", "3109876543", "22/07/1975",
                                          "87654321", "Ciencias", 28000, 60);
        assertEquals("Ciencias", profesor2.getArea());
    }

    @Test
    public void testCalcularPagoMensualProfesor1() {
        Profesor profesor1 = new Profesor("Christian Villarreal", "Calle 10", "3001234567", "07/07/1988",
                                          "12345678", "Ingles", 35000, 80);
        double esperado = (35000.0 * 80) * 1.30;
        assertEquals(esperado, profesor1.calcularPagoMensual(), 0.01);
    }

    @Test
    public void testCalcularPagoMensualProfesor2() {
        Profesor profesor2 = new Profesor("Rocio Cano", "Av. 6", "3109876543", "22/07/1975",
                                          "87654321", "Ciencias", 28000, 60);
        double esperado = (28000.0 * 60) * 1.30;
        assertEquals(esperado, profesor2.calcularPagoMensual(), 0.01);
    }

    @Test
    public void testCalcularPrestacionesProfesor1() {
        Profesor profesor1 = new Profesor("Christian Villarreal", "Calle 10", "3001234567", "07/07/1988",
                                          "12345678", "Ingles", 35000, 80);
        double esperado = ((35000.0 * 80) * 1.30) * 0.19;
        assertEquals(esperado, profesor1.calcularPrestaciones(), 0.01);
    }

    @Test
    public void testCalcularPrestacionesProfesor2() {
        Profesor profesor2 = new Profesor("Rocio Cano", "Av. 6", "3109876543", "22/07/1975",
                                          "87654321", "Ciencias", 28000, 60);
        double esperado = ((28000.0 * 60) * 1.30) * 0.19;
        assertEquals(esperado, profesor2.calcularPrestaciones(), 0.01);
    }

    @Test
    public void testSetNombreProfesor() {
        Profesor profesor1 = new Profesor("Christian Villarreal", "Calle 10", "3001234567", "07/07/1988",
                                          "12345678", "Ingles", 35000, 80);
        profesor1.setNombre("Christian A. Villarreal");
        assertEquals("Christian A. Villarreal", profesor1.getNombre());
    }
}
