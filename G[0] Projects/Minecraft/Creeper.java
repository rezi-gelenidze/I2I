public class Creeper extends Monster {
    public Creeper() {
        super(40, 1.0, "Gunpowder", 20);
    }

    public void explode() {
        System.out.println("Creeper explodes");
    }

    @Override
    public void makeSound() {
        System.out.println("Tssss!");
    }
}