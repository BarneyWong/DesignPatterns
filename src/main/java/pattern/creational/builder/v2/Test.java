package pattern.creational.builder.v2;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("Java Design Pattern ").buildCourseVideo("Java Design Pattern Video").buildCoursePPT("Java Design Pattern PPT")
                .buildCourseQA("Java Design Pattern QA")
                .build();
        System.out.println(course);
    }
}
