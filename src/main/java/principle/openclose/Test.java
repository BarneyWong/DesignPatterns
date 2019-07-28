package principle.openclose;

public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(96,"Java从零到企业机电商开发",388.0);
        JavaDiscountCourse javCourse= (JavaDiscountCourse)iCourse;
        System.out.println(javCourse);
    }
}
