package pattern.creational.builder.v1;

public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach =new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("Java Design Pattern","Java Design Pattern PPT","Java Design Pattern Video","Java Design Pattern  Article","Java Design Pattern OA");
        System.out.println(course);
    }
}
