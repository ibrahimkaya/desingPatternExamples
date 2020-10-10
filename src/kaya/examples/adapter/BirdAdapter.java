package kaya.examples.adapter;

/**
 * @Author ibrahim
 * @create 10.10.2020 20:18
 */
public class BirdAdapter implements ToyDuck {

    Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void squeak() {
        bird.makeSound();
    }
}
