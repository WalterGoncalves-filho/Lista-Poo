package Lista4.q_1;
public class Notebook extends Dispositivos{

    private String cpu;
    private String So;
    private String memoriaRam;
    private String memoriaSecun;
  

    public Notebook(String nome, String modelo, String marca, String paisOrigem, float preco, int cod, String cpu,
            String so, String memoriaRam, String memoriaSecun) {
        super(nome, modelo, marca, paisOrigem, preco, cod);
        this.cpu = cpu;
        So = so;
        this.memoriaRam = memoriaRam;
        this.memoriaSecun = memoriaSecun;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getSo() {
        return So;
    }

    public void setSo(String so) {
        So = so;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getMemoriaSecun() {
        return memoriaSecun;
    }

    public void setMemoriaSecun(String memoriaSecun) {
        this.memoriaSecun = memoriaSecun;
    }

}
