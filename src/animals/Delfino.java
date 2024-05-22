package animals;

public class Delfino extends Animale implements Nuotare{

    @Override
    public void verso() {
        System.out.println("iiiiii");
    }

    @Override
    public void mangia() {
        System.out.println("pesce");
    }

    @Override
    public void faiNuotare() {
        System.out.println("Sto nuotando!!!");
    }
}