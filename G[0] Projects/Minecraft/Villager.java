public abstract class Villager extends Mob {
    protected String profession;

    public Villager(int health, double movementSpeed, String profession) {
        super(health, movementSpeed, null);
        this.profession = profession;
    }

    @Override
    public void makeSound() {
        System.out.println("haa!");
    }

    public void trade() {
        System.out.println("Trading");
    }

}