package kaya.examples.factory;

/**
 * @Author ibrahim
 * @create 2.10.2020 14:12
 */

// this get comes from Supplier functional interface method
public class EmployeeFactory {
    public static Employee getEmployee(EmployeeType type) {
        return type.getConstructor().get();
    }
}
