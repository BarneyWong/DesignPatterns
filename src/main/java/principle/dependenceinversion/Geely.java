package principle.dependenceinversion;

public class Geely {
    private ICourse iCourse;

    public void studyImoocCourse() {
        iCourse.studyCourse();
    }


    public void setICourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }


}
