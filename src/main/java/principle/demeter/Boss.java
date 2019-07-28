package principle.demeter;


public class Boss {
    public void checkNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourses();
    }
}
