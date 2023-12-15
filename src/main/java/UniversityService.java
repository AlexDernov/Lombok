import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UniversityService {
    Map<String, Course> alleCourseMap = new HashMap<>();
    University ourUniversity;
public double getGradeOfCourse(String idOfCourse) {
    Course course = ourUniversity.getCourseMap().get(idOfCourse);
    List<Student> list = course.getStudentsList();
    double gradeTotal = 0;
    for (Student student : list) {
        gradeTotal += student.getGrade();
    }return gradeTotal/list.size();

}
public double gradeOfUniversity(String nameOfUniversity){


    ourUniversity.getCourseMap().values().stream()
            .forEach(course -> course.getStudentsList());
}
}
