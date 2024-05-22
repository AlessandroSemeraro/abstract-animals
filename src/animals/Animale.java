package animals;

public abstract class Animale {
        public void dormi() {
            System.out.println("Zzz");
        }
        public abstract void verso();
        public abstract void mangia();

    public class Cane extends Animale {
        @Override
        public void verso() {
            System.out.println("bau");
        }

        @Override
        public void mangia() {
            System.out.println("carne");
        }
    }

    public class Passerotto extends Animale {
        @Override
        public void verso() {
            System.out.println("cip");
        }

        @Override
        public void mangia() {
            System.out.println("vermi");
        }
    }

    public class Aquila extends Animale {
        @Override
        public void verso() {
            System.out.println("kiaa");
        }

        @Override
        public void mangia() {
            System.out.println("carne");
        }
    }

    public class Delfino extends Animale {
        @Override
        public void verso() {
            System.out.println("iiii");
        }

        @Override
        public void mangia() {
            System.out.println("pesce");
        }
    }
    }

