import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Student student1 = Student.builder()
                .id(UUID.randomUUID().toString())
                .name("Max Zimmermann")
                .build();
        Student student2 = Student.builder()
                .id(UUID.randomUUID().toString())
                .name("Tom Müller")
                .build();
        Student student3 = Student.builder()
                .id(UUID.randomUUID().toString())
                .name("Lisa Schröder")
                .build();

        List<Student> studentsList = new ArrayList<>();
        System.out.println(student3);
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);

        Teacher teacher1 = new Teacher(UUID.randomUUID().toString(), "Max Zimmerman", "Biologie");
        Teacher teacher2 = new Teacher(UUID.randomUUID().toString(), "Tom Müller", "Mathe");
        Teacher teacher3 = new Teacher(UUID.randomUUID().toString(), "Lisa Schröder", "Physic");

        student3.setName("Lisa Lehmann");

        Course biologie = Course.builder()
                .id(UUID.randomUUID().toString())
                .nameOfCourse("Biologie")
                .teachersOfCourse(teacher1)
                .studentsList(studentsList)
                .build();
        Course mathe = Course.builder()
                .id(UUID.randomUUID().toString())
                .nameOfCourse("Mathe")
                .teachersOfCourse(teacher2)
                .studentsList(studentsList)
                .build();
        Course physic = Course.builder()
                .id(UUID.randomUUID().toString())
                .nameOfCourse("Physic")
                .teachersOfCourse(teacher3)
                .studentsList(studentsList)
                .build();
        System.out.println(mathe);
        System.out.println(physic);
        System.out.println(biologie);
    }
}
