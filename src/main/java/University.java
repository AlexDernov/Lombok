import lombok.Builder;
import lombok.Data;

import java.util.*;

@Data
@Builder
public class University {

    String id;
    String name;
    Map<String,Course> courseMap;
    public Teacher getTeacherByCourseName(String courseName) {

        Teacher teachersOfCourse = courseMap.values().stream()
                .filter(course -> course.getNameOfCourse().equals(courseName))
                .toList().getFirst().getTeachersOfCourse();

        return teachersOfCourse;
    }
}
