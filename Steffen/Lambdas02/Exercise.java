package Steffen.Lambdas02;

import java.util.function.Predicate;

public class Exercise {

  public static void main(String[] args) {
    Student steffen = new Student("Steffen", 28);
    Student kid = new Student("Kind", 15);

    // FilteredAdultStudents adultStudents = new FilteredAdultStudents();
    // adultStudents.add(steffen);
    // adultStudents.add(kid);
    // adultStudents.printStudents();

    // System.out.println("-----------------------");

    // FilteredTeenStudents teenStudents = new FilteredTeenStudents();
    // teenStudents.add(steffen);
    // teenStudents.add(kid);
    // teenStudents.printStudents();

    FilteredStudents adultStudents = new FilteredStudents((student) -> student.age >= 18);
    adultStudents.add(steffen);
    adultStudents.add(kid);
    adultStudents.printStudents();

    FilteredStudents teenStudents = new FilteredStudents((student) -> student.age < 18);
    teenStudents.add(steffen);
    teenStudents.add(kid);
    teenStudents.printStudents();

  }
}
