import lombok.Builder;
import lombok.Data;
import lombok.Value;

import java.util.List;
@Data
@Builder
@Value
public class Course {
    String id;
    String nameOfCourse;
    Teacher teachersOfCourse;
    List<Student> studentsList;
}
