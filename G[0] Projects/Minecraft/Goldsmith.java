public class Goldsmith extends Villager {
    public Goldsmith() {
        super(100, 1.0, "Goldsmith");
    }

    public void craft() {
        System.out.println("Crafting jewelry");
    }
}