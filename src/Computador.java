public class Computador {

    // Armazenando os Valores Das peças do Computador
    private String Gabinete;
    private String placaMae;
    private String processador;
    private int memoriaRam;


    // Setando e Recebendo os Valores das peças do Computador
    public String getGabinete() {
        return Gabinete;
    }

    public void setGabinete(String gabinete) {
        Gabinete = gabinete;
    }

    public String getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(String placaMae) {
        this.placaMae = placaMae;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }
}
