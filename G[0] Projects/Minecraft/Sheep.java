public class Sheep extends Animal {
    public Sheep() {
        super(25, 1.2, "Wool and Meat",true);
    }

    @Override
    public void makeSound() {
        System.out.println("Baaaaaa!");
    }

    public void shave() {
        System.out.println(this.isDomestic);
    }
}