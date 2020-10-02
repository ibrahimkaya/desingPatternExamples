package kaya.examples.factory;

import java.util.function.Supplier;

/**
 * @Author ibrahim
 * @create 2.10.2020 14:03
 */
public enum EmployeeType {
    //calls constructor with new consultant object wrap with supplier interface
    CONSULTANT(Consultant::new),
    WORKER(Worker::new),
    MANAGER(Manager::new);

    private final Supplier<Employee> constructor;

    EmployeeType(Supplier<Employee> constructor) {
        this.constructor = constructor;
    }

    public Supplier<Employee> getConstructor() {
        return this.constructor;
    }
}
