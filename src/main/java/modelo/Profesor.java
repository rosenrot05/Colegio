
package modelo;

/**
 *
 * @author rosam
 */
public class Profesor extends Persona {
    
    private String cedula;
    private String area;
    private double salarioHora;
    private int horasMes;

    public Profesor(String nombre, String direccion, String telefono, String fechaNacimiento,
                    String cedula, String area, double salarioHora, int horasMes) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.cedula = cedula;
        this.area = area;
        this.salarioHora = salarioHora;
        this.horasMes = horasMes;
    }

    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    public String getArea() { return area; }
    public void setArea(String area) { this.area = area; }

    public double getSalarioHora() { return salarioHora; }
    public void setSalarioHora(double salarioHora) { this.salarioHora = salarioHora; }

    public int getHorasMes() { return horasMes; }
    public void setHorasMes(int horasMes) { this.horasMes = horasMes; }

    // pagoMensual = (salarioHora x horasMes) + 30% de preparacion
    public double calcularPagoMensual() {
        double base = salarioHora * horasMes;
        return base + (base * 0.30);
    }

    // prestaciones = 19% del pago mensual
    public double calcularPrestaciones() {
        return calcularPagoMensual() * 0.19;
    }

    // POLIMORFISMO: sobreescritura de getInfo()
    @Override
    public String getInfo() {
        return super.getInfo()
             + " | Cedula: " + cedula
             + " | Area: " + area
             + " | Pago: $" + String.format("%.2f", calcularPagoMensual())
             + " | Prestaciones: $" + String.format("%.2f", calcularPrestaciones());
    }
}
