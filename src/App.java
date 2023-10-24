import modelos.CarroRoubado;
import modelos.ConcreteViatura;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        CarroRoubado carroRoubado = new CarroRoubado();

        List<ConcreteViatura> listaViaturas = new ArrayList<>();
        listaViaturas.add(new ConcreteViatura(1));
        listaViaturas.add(new ConcreteViatura(2));
        listaViaturas.add(new ConcreteViatura(3));

        carroRoubado.adiconarViaturas(listaViaturas);

        carroRoubado.despistarViatura(listaViaturas.get(1));

        listaViaturas.forEach(concreteViatura -> {
            concreteViatura.avistarCarroRoubado(carroRoubado);
        });

        carroRoubado.virarDireita();
        carroRoubado.virarEsquerda();
        carroRoubado.parar();
    }
}
