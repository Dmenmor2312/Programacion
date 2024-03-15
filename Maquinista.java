package paquete;

public class Maquinista {

    private String nombre;
    private String DNI;
    private Double sueldo;
    private String rango;

    public Maquinista(String nombre, String DNI, Double sueldo, String rango) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.sueldo = sueldo;
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "Maquinista{" + "nombre = " + nombre + ", DNI = " + DNI + ", sueldo = " + sueldo + ", rango = " + rango + '}';
    }
    


}
