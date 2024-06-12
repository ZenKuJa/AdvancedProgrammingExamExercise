package Recordsis;

public record EmployeeRecord(String name, int employeeNumber) {
        public static String DEFAULT_EMPLOYE_NAME = "Rewinside";

        public String toUpper(){
            return name.toUpperCase();
        }

        public void printSomething(){
            System.out.println("something");
        }

}
