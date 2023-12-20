public class Dog extends Animal implements Animal.Run, Animal.Speak {
    @Override
    public void run() {
        System.out.println("Dog is running");
    }
    @Override
    public void speak() {
        System.out.println("Dog is barking");
    }

}
