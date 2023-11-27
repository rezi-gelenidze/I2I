public class Cow extends Animal {
    public Cow() {
        super(30, 1.2, "Leather and Meet", true);
    }

    @Override
    public void makeSound() {
        System.out.println("Mooooo");
    }

    public void milk() {
        System.out.println("Milking the cow");
    }
}