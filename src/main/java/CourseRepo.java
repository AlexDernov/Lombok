import lombok.Builder;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;
@Data
@Builder
public class CourseRepo {
    Map<String,Course> courseMap;

    public Teacher getTeacherByCourseName(String courseName) {
        courseMap.values().forEach(course ->
        {
            if (course.getNameOfCourse().equals(courseName)) {
                Teacher teacherOfCourse = course.getTeachersOfCourse();
                return teacherOfCourse;
            }

        });
    }
}
