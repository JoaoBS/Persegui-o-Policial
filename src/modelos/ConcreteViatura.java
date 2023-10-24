package modelos;

import interfaces.Viatura;

public class ConcreteViatura implements Viatura {

    private int codigo;
    private CarroRoubado carroRoubado;

    public ConcreteViatura(int codigo) {
        this.codigo = codigo;
    }

    public void avistarCarroRoubado(CarroRoubado carroRoubado) {
        this.carroRoubado = carroRoubado;
    }

    public void perseguirCarro() {
        if(carroRoubado.dirigindo()) {
            System.out.println("Viatura " + getCodigo() + " virou a " + carroRoubado.getDirecao());
        } else {
            System.out.println("Viatura " + getCodigo() + " parou");
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
