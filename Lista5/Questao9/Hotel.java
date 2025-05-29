package Lista5.Questao9;
import java.time.LocalDate;
import java.util.ArrayList;

public class Hotel {
    private ArrayList<Reserva> reservas;

    public Hotel() {
        this.reservas = new ArrayList<>();
    }

    public boolean verificarDisponibilidade(int numeroQuarto, LocalDate entrada, LocalDate saida) {
        for (Reserva r : reservas) {
            if (r.getNumeroQuarto() == numeroQuarto && r.conflitoDeDatas(entrada, saida)) {
                return false;
            }
        }
        return true;
    }

    public boolean fazerReserva(String hospede, int numeroQuarto, LocalDate entrada, LocalDate saida) {
        if (verificarDisponibilidade(numeroQuarto, entrada, saida)) {
            reservas.add(new Reserva(hospede, numeroQuarto, entrada, saida));
            return true;
        } else {
            return false;
        }
    }

    public void listarReservas() {
        if (reservas.isEmpty()) {
            System.out.println("Nenhuma reserva cadastrada.");
        } else {
            for (Reserva r : reservas) {
                System.out.println(r);
            }
        }
    }
}
