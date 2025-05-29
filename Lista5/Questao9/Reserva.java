package Lista5.Questao9;

import java.time.LocalDate;

public class Reserva {
    private String hospede;
    private int numeroQuarto;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;

    public Reserva(String hospede, int numeroQuarto, LocalDate dataEntrada, LocalDate dataSaida) {
        this.hospede = hospede;
        this.numeroQuarto = numeroQuarto;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public int getNumeroQuarto() { return numeroQuarto; }
    public LocalDate getDataEntrada() { return dataEntrada; }
    public LocalDate getDataSaida() { return dataSaida; }

    @Override
    public String toString() {
        return "Hóspede: " + hospede + "\nQuarto: " + numeroQuarto +
               "\nEntrada: " + dataEntrada + "\nSaída: " + dataSaida+"\n";
    }

    public boolean conflitoDeDatas(LocalDate entrada, LocalDate saida) {
        return !(saida.isBefore(this.dataEntrada) || entrada.isAfter(this.dataSaida));
    }
}
