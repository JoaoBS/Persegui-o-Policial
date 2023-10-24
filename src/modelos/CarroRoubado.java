package modelos;

import java.util.ArrayList;
import java.util.List;

public class CarroRoubado {

    private List<ConcreteViatura> viaturas;

    private String direcao;
    private boolean parado;

    public CarroRoubado() {
        this.viaturas = new ArrayList<>();
        this.parado = true;
    }

    public void adiconarViaturas(List<ConcreteViatura> viaturas) {
        this.viaturas = viaturas;
    }

    public void despistarViatura(ConcreteViatura concreteViatura) {
        this.viaturas.remove(concreteViatura);
    }

    public void alertarViaturas() {
        this.viaturas.forEach(concreteViatura -> {
            concreteViatura.perseguirCarro();
        });
    }

    public void virarDireita() {
        this.direcao = "Direita";
        System.out.println("\nCarro roubado virou a " + getDirecao());
        alertarViaturas();
    }

    public void virarEsquerda() {
        this.direcao = "Esquerda";
        System.out.println("\nCarro roubado virou a " + getDirecao());
        alertarViaturas();
    }

    public boolean dirigindo() {
        return parado;
    }

    public void parar() {
        this.parado = false;
        System.out.println("\nCarro roubado parou");
        alertarViaturas();
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }
}
