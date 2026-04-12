
package modelo;

/**
 *
 * @author rosam
 */
public class Estudiante extends Persona {
    
    private String codigoEstudiante;
    private String grado;
    private String acudiente;

    public Estudiante(String nombre, String direccion, String telefono, String fechaNacimiento,
                      String codigoEstudiante, String grado, String acudiente) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.codigoEstudiante = codigoEstudiante;
        this.grado = grado;
        this.acudiente = acudiente;
    }

    public String getCodigoEstudiante() { return codigoEstudiante; }
    public void setCodigoEstudiante(String cod) { this.codigoEstudiante = cod; }

    public String getGrado() { return grado; }
    public void setGrado(String grado) { this.grado = grado; }

    public String getAcudiente() { return acudiente; }
    public void setAcudiente(String acudiente) { this.acudiente = acudiente; }

    // POLIMORFISMO: sobreescritura de getInfo()
    @Override
    public String getInfo() {
        return super.getInfo()
             + " | Codigo: " + codigoEstudiante
             + " | Grado: " + grado
             + " | Acudiente: " + acudiente;
    }
}
