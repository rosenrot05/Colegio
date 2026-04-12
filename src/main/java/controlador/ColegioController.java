
package controlador;

/**
 *
 * @author rosam
 */

import modelo.Persona;
import modelo.Profesor;
import modelo.Estudiante;
import java.util.ArrayList;

public class ColegioController {
    
        private ArrayList<Profesor>   listaProfesores;
    private ArrayList<Estudiante> listaEstudiantes;

    public ColegioController() {
        listaProfesores  = new ArrayList<>();
        listaEstudiantes = new ArrayList<>();
    }

    // SOBRECARGA: registrar acepta Profesor o Estudiante
    public void registrar(Profesor p) {
        listaProfesores.add(p);
    }

    public void registrar(Estudiante e) {
        listaEstudiantes.add(e);
    }

    // SOBRECARGA: buscar por nombre o por indice
    public Profesor buscarProfesor(String nombre) {
        for (Profesor p : listaProfesores) {
            if (p.getNombre().equalsIgnoreCase(nombre)) return p;
        }
        return null;
    }

    public Profesor buscarProfesor(int index) {
        if (index >= 0 && index < listaProfesores.size())
            return listaProfesores.get(index);
        return null;
    }

    public ArrayList<Profesor>   obtenerProfesores()   { return listaProfesores; }
    public ArrayList<Estudiante> obtenerEstudiantes()  { return listaEstudiantes; }

    // REPORTE 1: lista de estudiantes
    public String reporteEstudiantes() {
        StringBuilder sb = new StringBuilder();
        sb.append("--- LISTA DE ESTUDIANTES ---\n");
        for (Estudiante e : listaEstudiantes) {
            sb.append(e.getInfo()).append("\n");
            sb.append("----------------------------\n");
        }
        sb.append("Total: ").append(listaEstudiantes.size());
        return sb.toString();
    }

    // REPORTE 2: profesores de mayor a menor salario + total prestaciones
    public String reporteProfesoresPorSalario() {
        ArrayList<Profesor> ordenados = new ArrayList<>(listaProfesores);

        // Ordenar burbuja mayor a menor
        for (int i = 0; i < ordenados.size() - 1; i++) {
            for (int j = 0; j < ordenados.size() - 1 - i; j++) {
                if (ordenados.get(j).calcularPagoMensual() < ordenados.get(j+1).calcularPagoMensual()) {
                    Profesor temp = ordenados.get(j);
                    ordenados.set(j, ordenados.get(j+1));
                    ordenados.set(j+1, temp);
                }
            }
        }

        double totalPrestaciones = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("--- PROFESORES POR SALARIO (Mayor a Menor) ---\n");
        for (Profesor p : ordenados) {
            sb.append("Nombre: ").append(p.getNombre()).append("\n");
            sb.append("Pago  : $").append(String.format("%.2f", p.calcularPagoMensual())).append("\n");
            sb.append("Prest.: $").append(String.format("%.2f", p.calcularPrestaciones())).append("\n");
            sb.append("----------------------------\n");
            totalPrestaciones += p.calcularPrestaciones();
        }
        sb.append("TOTAL PRESTACIONES: $").append(String.format("%.2f", totalPrestaciones));
        return sb.toString();
    }
}
