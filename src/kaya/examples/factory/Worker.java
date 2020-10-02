package kaya.examples.factory;

/**
 * @Author ibrahim
 * @create 2.10.2020 13:43
 */
public class Worker implements Employee {
    private final String description = "Worker";

    @Override
    public String getDescription() {
        return description;
    }
}
