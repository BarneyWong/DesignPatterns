package principle.singleresponsibility;

public class Bird {
    public void fly(String birdName){
        if("鸵鸟".equals(birdName)){
            System.out.println(birdName+" walk with feet");
        }else{
            System.out.println(birdName+" fly with wings");
        }


    }
}
