package paquete;

public class Tren {

    private Mecanico mecanico;
    private Vagon vagon[];
    private Locomotora locomotora;
    private Integer numVagones;

    public Tren(Mecanico mecanico, Locomotora locomotora, Integer numVagones) {
        this.mecanico = mecanico;
        vagon = new Vagon[5];
        this.locomotora = locomotora;
        numVagones = 0;
    }

    public void engabcharVagones(Integer numId, Integer cargaMax, Integer cargaActual, String mercancia) {
        if (numVagones < 5) {
            Vagon vagon1 = new Vagon(numId, cargaMax, cargaActual, mercancia);
            vagon[numVagones] = vagon1;
            numVagones ++;
        }else{
            System.out.println("No admite más vagones");
        }
    }
}
