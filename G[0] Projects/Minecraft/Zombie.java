public class Zombie extends Monster {
    public Zombie() {
        super(50, 1.5, "Zombie Flesh", 15);
    }

    @Override
    public void makeSound() {
        System.out.println("GROAN!");
    }
}