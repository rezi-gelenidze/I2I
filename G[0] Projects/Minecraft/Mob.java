public abstract class Mob {
    protected int health;
    protected double movementSpeed;
    protected String dropItem;

    public Mob(int health, double movementSpeed, String dropItem) {
        this.health = health;
        this.movementSpeed = movementSpeed;
        this.dropItem = dropItem;
    }

    public void move() {
        System.out.println("Moving at speed " + movementSpeed);
    }

    public void spawn() {
        System.out.println("Mob spawned");
    }

    public void makeSound() {
        System.out.println("Mob makes a generic sound");
    }

    public void dropItemWhenKilled() {
        System.out.println("Dropping: " + this.dropItem);
    }
}