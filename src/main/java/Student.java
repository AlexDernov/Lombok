import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class Student {
    String id;
    String name;
    String address;
    double grade;

}

