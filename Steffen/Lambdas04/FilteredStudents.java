package Steffen.Lambdas04;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilteredStudents {
  private ArrayList<Student> students;
  private Predicate<Student> mandatoryFilter;

  public FilteredStudents(Predicate<Student> filter) {
    this.students = new ArrayList<>();
    this.mandatoryFilter = filter;
  }

  public void add(Student element) {
    if (this.mandatoryFilter.test(element)) {
      this.students.add(element);
    }
  }

  public void forEach(Consumer<Student> consumer) {
    this.students.forEach((student)->{
      if (this.mandatoryFilter.test(student)){
        consumer.accept(student);
      }
    });
  }
}
