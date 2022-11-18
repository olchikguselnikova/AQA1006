package Lesson8;

public class Lesson8 {
    public static void main(String[] args) {
        Cat cat=new Cat("Tom");
        cat.greets();
        cat.play();
        cat.walk();
        cat.feed();

        Dog dog=new Dog("Ralf");
        dog.greets();
        dog.greets(new Dog("Benny"));
        dog.feed();
        dog.play();
        dog.walk();

        BigDog bigDog=new BigDog("BIG");
        bigDog.greets();
        bigDog.greets(dog);
        bigDog.greets(new BigDog("BAGIRA"));

        Lion lion=new Lion("Simba");
        lion.greets();
        lion.hunting();

        Wolf wolf=new Wolf("Akela");
        wolf.greets();
        wolf.hunting();
        
    }
}
