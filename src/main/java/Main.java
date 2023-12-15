import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = Student.builder()
                .id(UUID.randomUUID().toString())
                .name("Max Zimmermann")
                .grade(1.2)
                .build();
        Student student2 = Student.builder()
                .id(UUID.randomUUID().toString())
                .name("Tom Müller")
                .grade(4.2)
                .build();
        Student student3 = Student.builder()
                .id(UUID.randomUUID().toString())
                .name("Lisa Schröder")
                .grade(1.0)
                .build();

        List<Student> studentsList = new ArrayList<>();
        System.out.println(student3);
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);

        Teacher teacher1 = new Teacher(UUID.randomUUID().toString(), "Max Zimmerman", "Biologie");
        Teacher teacher2 = new Teacher(UUID.randomUUID().toString(), "Tom Müller", "Mathe");
        Teacher teacher3 = new Teacher(UUID.randomUUID().toString(), "Lisa Schröder", "Physic");

        //Sett Methode
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

        //toString
        System.out.println(mathe);
        System.out.println(physic);
        System.out.println(biologie);
        System.out.println("");

        //Get Methode
        Map<String, Course> alleCourseMap = new HashMap<>();
        alleCourseMap.put(biologie.getId(), biologie);
        alleCourseMap.put(mathe.getId(), mathe);
        alleCourseMap.put(physic.getId(), physic);
        University university = new University(UUID.randomUUID().toString(), "Hamburg University",alleCourseMap);

        //toString
        System.out.println(university);
        System.out.println(university.getTeacherByCourseName("Biologie"));

    }
}
