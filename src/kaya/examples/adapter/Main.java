package kaya.examples.adapter;

/**
 * @Author ibrahim
 * @create 10.10.2020 20:19
 */
public  class Main {
    public static void main(String[] args){
        SomeBird someBird = new SomeBird();
        ToyDuck toyDuck = new PlasticToyDuck();

        //creating toy duck, wrapping with bird adapter
        //now toy duck have ability to squeak amd make sound like bird
        ToyDuck birdAdapter = new BirdAdapter(someBird);

        System.out.println("some bird fly");
        someBird.fly();

        System.out.println("toyduck is ");
        toyDuck.squeak();

        System.out.println("adamter is");
        birdAdapter.squeak();

    }
}
