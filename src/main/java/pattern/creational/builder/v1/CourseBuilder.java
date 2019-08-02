package pattern.creational.builder.v1;

public abstract class CourseBuilder {

    public abstract  void buildCourseName(String courseName);
    public abstract  void buildCoursePPT(String coursePPT);
    public abstract  void buildCourseVideo(String courseVideo);
    public abstract  void buildCourseArticle(String courseArticle);
    public abstract  void buildCourseOA(String courseOA);

    public abstract Course makeCourse();
}
