package animals;

public class Cane extends Animale implements Nuotare{

    @Override
    public void verso() {
        System.out.println("bau");
    }

    @Override
    public void mangia() {
        System.out.println("croccantini");
    }

    public void faiNuotare(){
        System.out.println("Sto nuotando!!!");
    }
}