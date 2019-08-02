package pattern.creational.builder.v1;


public class CourseActualBuilder extends CourseBuilder {
    private Course course = new Course();
    @Override
    public void buildCourseName(String courseName) {
        course.setCourseName(courseName);
    }

    @Override
    public void buildCoursePPT(String coursePPT) {
        course.setCoursePPT(coursePPT);
    }

    @Override
    public void buildCourseVideo(String courseVideo) {
        course.setCourseVideo(courseVideo);
    }

    @Override
    public void buildCourseArticle(String courseArticle) {
        course.setCourseArticle(courseArticle);
    }

    @Override
    public void buildCourseOA(String courseOA) {
        course.setCourseOA(courseOA);
    }

    @Override
    public Course makeCourse() {
        return course;
    }
}
