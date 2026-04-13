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

        control.registrar(new Profesor("Christian Villarreal", "Calle 10", "3001234567", "07/07/1988",
                                       "12345678", "Ingles", 35000, 80));
        control.registrar(new Profesor("Rocio Cano", "Av. 6", "3109876543", "22/07/1975",
                                       "87654321", "Ciencias", 28000, 60));

        Estudiante est1 = new Estudiante("Paola Valenzuela", "Calle 3", "3154321098", "10/05/2010");
        est1.setCodigoEstudiante("EST001");
        est1.setGrado("9A");
        est1.setAcudiente("Carmen Gomez");
        control.registrar(est1);

        Estudiante est2 = new Estudiante("Mercedes Escobar", "Cra 15", "3165432109", "18/09/2011");
        est2.setCodigoEstudiante("EST002");
        est2.setGrado("8B");
        est2.setAcudiente("Luis Ruiz");
        control.registrar(est2);

        System.out.println("--- INFO PROFESORES ---");
        for (Profesor p : control.obtenerProfesores()) {
            System.out.println(p.getInfo());
            System.out.println("----------------------");
        }

        System.out.println("--- BUSQUEDA ---");
        Profesor p1 = control.buscarProfesor("Christian Villarreal");
        Profesor p2 = control.buscarProfesor(1);
        System.out.println("Buscar por nombre: " + (p1 != null ? p1.getNombre() : "No existe"));
        System.out.println("Buscar por indice: " + (p2 != null ? p2.getNombre() : "No existe"));

        System.out.println(control.reporteEstudiantes());
        System.out.println(control.reporteProfesoresPorSalario());
    }
}