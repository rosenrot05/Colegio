
package vista;

/**
 *
 * @author rosam
 */

import controlador.ColegioController;
import modelo.Profesor;
import modelo.Estudiante;

public class ColegioApp {

    public static void main(String[] args) {

        System.out.println("--- SISTEMA COLEGIO ---");
        ColegioController control = new ColegioController();

        // POLIMORFISMO - registrar con sobrecarga
        control.registrar(new Profesor("Christian Villarreal", "Calle 10", "3001234567", "07/07/1988",
                                       "12345678", "Ingles", 35000, 80));
        control.registrar(new Profesor("Rocio Cano", "Av. 6", "3109876543", "22/07/1975",
                                       "87654321", "Ciencias", 28000, 60));
        control.registrar(new Estudiante("Paola Valenzuela", "Calle 3", "3154321098", "10/05/2010",
                                         "Informatica", "9A", "Carmen Gomez"));
        control.registrar(new Estudiante("Mercedes Escobar", "Cra 15", "3165432109", "18/09/2011",
                                         "Castellano", "8B", "Luis Ruiz"));

        // POLIMORFISMO - sobreescritura de getInfo()
        System.out.println("--- INFO PROFESORES ---");
        for (Profesor p : control.obtenerProfesores()) {
            System.out.println(p.getInfo());
            System.out.println("----------------------");
        }

        // SOBRECARGA - buscar
        System.out.println("--- BUSQUEDA ---");
        Profesor p1 = control.buscarProfesor("Carlos Perez");
        Profesor p2 = control.buscarProfesor(1);
        System.out.println("Buscar por nombre: " + (p1 != null ? p1.getNombre() : "No existe"));
        System.out.println("Buscar por indice: " + (p2 != null ? p2.getNombre() : "No existe"));

        // REPORTES
        System.out.println(control.reporteEstudiantes());
        System.out.println(control.reporteProfesoresPorSalario());
    }
}
