public class Shark extends Animal implements Animal.Run, Animal.Speak {
    @Override
    public void run() {
        System.out.println("Shark is swimming");
    }
    @Override
    public void speak() {
        System.out.println("Shark is growling");
    }
}
