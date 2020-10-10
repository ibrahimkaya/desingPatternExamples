package kaya.examples.adapter;

/**
 * @Author ibrahim
 * @create 10.10.2020 20:17
 */
public class PlasticToyDuck implements ToyDuck {
    @Override
    public void squeak() {
        System.out.println("toy duck squeak" );
    }
}
