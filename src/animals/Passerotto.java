package animals;

public class Passerotto extends Animale implements Volare {

    @Override
    public void verso() {
        System.out.println("cip");
    }

    @Override
    public void mangia() {
        System.out.println("semi");
    }

    public void faiVolare(){
        System.out.println("Sto volando!!!");
    }
}