public class Exercise {
    String name;
    String descripion;
    int duration;
    String position;
    String separator = "--------------------------------------";

    public Exercise(String name, String descripion, int duration, String position){
        this.name = name;
        this.descripion = descripion;
        this.duration = duration;
        this.position = position;
    }

    public void print(){
        System.out.printf("%s      DURATION: %d seconds. %n%s %nDescription: %s %n%n", name, duration, separator, descripion);
    }
}
