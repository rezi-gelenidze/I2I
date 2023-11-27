public abstract class Animal extends Mob {
    protected boolean isDomestic;

    public Animal(int health, double movementSpeed, String dropItem,  boolean isDomestic) {
        super(health, movementSpeed, dropItem);
        this.isDomestic = isDomestic;
    }
}
