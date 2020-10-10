package kaya.examples.adapter;

/**
 * @Author ibrahim
 * @create 10.10.2020 20:15
 */
public class SomeBird implements Bird {
    @Override
    public void fly() {
        System.out.println("bird fly");
    }

    @Override
    public void makeSound() {
        System.out.println("bird make sound");
    }
}
