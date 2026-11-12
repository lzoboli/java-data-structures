package unidade3.lista9.questao1a3;

import java.time.LocalDate;

public class Aluno {
    private int matricula;
    private String nome;
    private LocalDate dtNasicmento;

    public Aluno(int matricula, String nome, LocalDate dtNasicmento) {
        this.matricula = matricula;
        this.nome = nome;
        this.dtNasicmento = dtNasicmento;
    }

    public LocalDate getDtNasicmento() {
        return dtNasicmento;
    }

    public void setDtNasicmento(LocalDate dtNasicmento) {
        this.dtNasicmento = dtNasicmento;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
