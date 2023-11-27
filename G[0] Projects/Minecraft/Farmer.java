public class Farmer extends Villager {
    public Farmer() {
        super(100, 1.0, "Farmer");
    }

    public void harvest() {
        System.out.println("Harvesting crops");
    }

    public void seed() {
        System.out.println("Seeding crops");
    }
}