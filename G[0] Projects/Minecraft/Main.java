public class Main {
    public static void main(String[] args) {
        // Create a Zombie and call its methods
        System.out.println("Creating a Zombie:");
        Zombie zombie = new Zombie();
        System.out.println("Zombie is moving:");
        zombie.move();
        System.out.println("Zombie is attacking:");
        zombie.attack();
        System.out.println("Zombie makes sound:");
        zombie.makeSound();
        System.out.println("Zombie drops item when killed:");
        zombie.dropItemWhenKilled();

        // Create a Creeper and call its methods
        System.out.println("\nCreating a Creeper:");
        Creeper creeper = new Creeper();
        System.out.println("Creeper is moving:");
        creeper.move();
        System.out.println("Creeper is attacking:");
        creeper.attack();
        System.out.println("Creeper makes sound:");
        creeper.makeSound();
        System.out.println("Creeper explodes:");
        creeper.explode();
        System.out.println("Creeper drops item when killed:");
        creeper.dropItemWhenKilled();

        // Create a Cow and call its methods
        System.out.println("\nCreating a Cow:");
        Cow cow = new Cow();
        System.out.println("Cow is moving:");
        cow.move();
        System.out.println("Cow makes sound:");
        cow.makeSound();
        System.out.println("Milking the cow:");
        cow.milk();
        System.out.println("Cow drops item when killed:");
        cow.dropItemWhenKilled();

        // Create a Sheep and call its methods
        System.out.println("\nCreating a Sheep:");
        Sheep sheep = new Sheep();
        System.out.println("Sheep is moving:");
        sheep.move();
        System.out.println("Sheep makes sound:");
        sheep.makeSound();
        System.out.println("Shaving the sheep:");
        sheep.shave();
        System.out.println("Sheep drops item when killed:");
        sheep.dropItemWhenKilled();

        // Create a Farmer and call its methods
        System.out.println("\nCreating a Farmer:");
        Farmer farmer = new Farmer();
        System.out.println("Farmer is moving:");
        farmer.move();
        System.out.println("Farmer trades:");
        farmer.trade();
        System.out.println("Farmer harvests crops:");
        farmer.harvest();
        System.out.println("Farmer seeds crops:");
        farmer.seed();
        System.out.println("Farmer makes sound:");
        farmer.makeSound();
        System.out.println("Farmer drops item when killed:");
        farmer.dropItemWhenKilled();

        // Create a Goldsmith and call its methods
        System.out.println("\nCreating a Goldsmith:");
        Goldsmith goldsmith = new Goldsmith();
        System.out.println("Goldsmith is moving:");
        goldsmith.move();
        System.out.println("Goldsmith trades:");
        goldsmith.trade();
        System.out.println("Goldsmith crafts jewelry:");
        goldsmith.craft();
        System.out.println("Goldsmith makes sound:");
        goldsmith.makeSound();
        System.out.println("Goldsmith drops item when killed:");
        goldsmith.dropItemWhenKilled();
    }
}
