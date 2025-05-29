package Lista5.Questao7;

import java.util.ArrayList;

public class Time {
    private String nome;
    private ArrayList<String> jogadores;

    public Time(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public void setNome(String nome) {this.nome = nome;}
    public ArrayList<String> getJogadores() { return new ArrayList<>(jogadores); }

    public void adicionarJogador(String jogador) {
        if (!jogadores.contains(jogador)) {
            jogadores.add(jogador);
        }
    }


    public boolean removerJogador(String jogador) { return jogadores.remove(jogador); }

    @Override
    public String toString() {
        return "Time: " + nome + "\nJogadores: " + jogadores;
    }
}
