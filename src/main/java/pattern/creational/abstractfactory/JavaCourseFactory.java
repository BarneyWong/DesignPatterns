package pattern.creational.abstractfactory;

public class JavaCourseFactory  implements  CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVide();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
