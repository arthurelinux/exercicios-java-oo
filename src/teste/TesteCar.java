package teste;
import br.com.exercio.Car;
public class TesteCar {

    public static void main(String[] args) {
        Car carro1 = new Car();
        carro1.setAno(2011);
        System.out.println(carro1.getAno());

        carro1.setLigar(true);
        carro1.acelerar(60);


    }
}
