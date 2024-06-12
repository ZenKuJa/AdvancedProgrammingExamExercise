package Recordsis;

public class RecordExample {
    public static void main(String[] args) {
        EmployeeClass employeeClass = new EmployeeClass("ApoRed", 420);
        EmployeeRecord employeeRecord = new EmployeeRecord("GommeHD", 12345);

        System.out.println(employeeClass.getName());
        System.out.println(employeeRecord.name());

        System.out.println(employeeClass.hashCode());
        System.out.println(employeeRecord.hashCode());

        System.out.println(employeeClass);
        System.out.println(employeeRecord);

        System.out.println(employeeRecord.toUpper());

        employeeRecord.printSomething();
    }
}
