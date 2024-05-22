package animals;

public class Aquila extends Animale implements Volare {

    @Override
    public void verso() {
        System.out.println("kia");
    }

    @Override
    public void mangia() {
        System.out.println("carne");
    }

    public void faiVolare(){
        System.out.println("Sto volando!!!");
    }
}