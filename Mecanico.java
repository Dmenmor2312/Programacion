package paquete;

public class Mecanico {

    private String nombre;
    private String telefono;

    enum Especialidad {FRENOS, HIDRAULICA, ELECTRICIDAD, MOTOR}
    
    private Especialidad especialidad;

    public Mecanico(String nombre, String telefono, String especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = Especialidad.valueOf(especialidad);
    }

    @Override
    public String toString() {
        return "Mecanico{" + "nombre = " + nombre + ", telefono = " + telefono + ", especialidad = " + especialidad + '}';
    }
    
}
