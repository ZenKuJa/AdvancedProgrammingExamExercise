package Steffen.Lambdas02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilteredStudents {
    private final List<Student> students; 
    private final Predicate<Student> mandatoryFilter;


    public FilteredStudents(Predicate<Student> mandatoryFilter) {
        this.students = new ArrayList<>();
        this.mandatoryFilter = mandatoryFilter;
    }

    public void add(Student student){
        if (this.mandatoryFilter.test(student)){
            this.students.add(student);
        }
    }

    public void printStudents(){
        this.students.forEach(System.out::println);
    }

}
