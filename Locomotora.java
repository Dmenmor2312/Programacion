package paquete;

public class Locomotora {

    private String matricula;
    private Integer potencia;
    private Integer antigüedad;
    private Mecanico mecanico;

    public Locomotora(String matricula, Integer potencia, Integer antigüedad, Mecanico mecanico) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.antigüedad = antigüedad;
        this.mecanico = mecanico;
    }

}
