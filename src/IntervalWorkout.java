public class IntervalWorkout {
    static String separator2 = "******************************";
    String exercise1;
    String exercise2;
    String exercise3;
    int round =1;
    int breaktime =30;
    String separator = "==============================";

    public IntervalWorkout(Exercise exercise1, Exercise exercise2, Exercise exercise3){
        this.exercise1 = exercise1.name;
        this.exercise2 = exercise2.name;
        this.exercise3 = exercise3.name;
    }

    public void print(){
        System.out.printf("%n%s%nInterval Workout STARTS !!!!%n%s%n%s", separator2, separator2, separator);
        for (int i=0; i<4; i++){
            if(i==3){
                System.out.printf("%nROUND %d:%n%s%n%s%n%s%n", round, exercise1, exercise2, exercise3);
            } else {
                System.out.printf("%nROUND %d:%n%s%n%s%n%s%n%s%nDO THE BREAK (%d SECONDS)%n%s", round, exercise1, exercise2, exercise3, separator, breaktime, separator);
            }
            round++;
        }
        System.out.printf("%n%n%s%nCONGRATS - YOU ARE DONE !!!%n%s", separator2, separator2);

    }
}