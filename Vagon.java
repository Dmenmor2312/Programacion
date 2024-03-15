package paquete;

public class Vagon {

    private Integer numero;
    private Integer cargaMax;
    private Integer cargaActual;
    private String mercancia;

    public Vagon(Integer numero, Integer cargaMax, Integer cargaActual, String mercancia) {
        this.numero = numero;
        this.cargaMax = cargaMax;
        this.cargaActual = cargaActual;
        this.mercancia = mercancia;
    }

}
