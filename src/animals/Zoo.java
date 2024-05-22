package animals;

public class Zoo {
    public static void main(String[] args) {
        Animale[] zoo = {new Cane(), new Passerotto(), new Aquila(), new Delfino()};

        for (int i = 0; i < zoo.length; i++){
            zoo[i].dormi();
            zoo[i].mangia();
            zoo[i].verso();

            if (zoo[i] instanceof Nuotare){
                faiNuotare((Nuotare) zoo[i]);
            }
            if (zoo[i] instanceof Volare){
                faiVolare((Volare) zoo[i]);
            }
        }

    }
    public static void faiNuotare(Nuotare animale){
        animale.faiNuotare();
    }

    public static void faiVolare(Volare animale){
        animale.faiVolare();
    }

}