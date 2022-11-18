package Lesson8;

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    @Override
    void greets(Dog dog) {
        System.out.println(dog.getName()+" WOOW");
    }

    @Override
    void greets() {
        System.out.println("Woow");
    }

    void greets (BigDog bigDog){
        System.out.println(bigDog.getName()+" big dog woow");

    }
}
