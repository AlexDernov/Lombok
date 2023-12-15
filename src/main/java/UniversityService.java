import java.util.HashMap;
import java.util.Map;

public class UniversityService {
    Map<String, Course> alleCourseMap = new HashMap<>();
    University ourUniversity = University.builder()
            .courseMap(alleCourseMap)
            .build();
public double gradeOfCourse(String nameOfCourse) {

}
public double gradeOfUniversity(String nameOfUniversity){


    ourUniversity.getCourseMap().values().stream()
            .forEach(course -> course.getStudentsList());
}
}
