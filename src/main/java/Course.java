import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class Course {
    String id;
    String nameOfCourse;
    Teacher teachersOfCourse;
    List<Student> studentsList;
}
