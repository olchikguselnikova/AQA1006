package Lesson8;

public class Dog extends Animal implements Pet{

    public Dog(String name) {
        super(name);
    }

    void greets(Dog dog){
        System.out.println("Woooooof "+dog.getName());
    }
    @Override
    void greets() {
        System.out.println("Dog "+getName()+" says Woof");
    }

    @Override
    public void feed() {
        System.out.println("Feeding Dog "+getName());
    }

    @Override
    public void walk() {
        System.out.println("Walking Dog "+getName());
    }

    @Override
    public void play() {
        System.out.println("Playing Dog "+getName());
    }

    
}
