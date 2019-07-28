package principle.dependenceinversion;

public class Test {
    public static void main(String[] args) {
//        Geely geely = new Geely();
////        geely.studyImoocCourse(new JavaCourse());
////        geely.studyImoocCourse(new PythonCourse());

        Geely geely = new Geely();
        geely.setICourse(new JavaCourse());
        geely.studyImoocCourse();
        geely.setICourse(new PythonCourse());
        geely.studyImoocCourse();
    }
}
