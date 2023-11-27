public abstract class Monster extends Mob {
    protected int damage;

    public Monster(int health, double movementSpeed, String dropItem, int damage) {
        super(health, movementSpeed, dropItem);
        this.damage = damage;
    }

    public void attack() {
        System.out.println("Attacking with damage " + damage);
    }
}