package kaya.examples.factory;

public class Main {

    public static void main(String[] args) {
        //also type can be use as "var"
        Employee employeeWorker = EmployeeFactory.getEmployee(EmployeeType.WORKER);
        Employee employeeManager = EmployeeFactory.getEmployee(EmployeeType.MANAGER);
        Employee employeeConsultant = EmployeeFactory.getEmployee(EmployeeType.CONSULTANT);

        System.out.println(employeeConsultant.getDescription());
        System.out.println(employeeManager.getDescription());
        System.out.println(employeeWorker.getDescription());
    }
}
