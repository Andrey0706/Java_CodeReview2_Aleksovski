import java.util.ArrayList;

public class Main {


    public static void main(String[] args){

        ArrayList<Exercise> exercisesList = new ArrayList<>();

        Exercise exercise1 = new Exercise("Push-ups", "Place your hands on the floor. Raise up onto your toes so that all of your body weight is on your hands and your feet. Bend your elbows and lower your chest down toward the floor. Then, push off the floor and extend them so that you return to starting position.", 60, "floor");
        Exercise exercise2 = new Exercise("Planks", "Start on the floor on your hands and knees. Lower your forearms to the floor with elbows positioned under your shoulders and your hands shoulder-width apart. Maintain a straight line from heels through the top of your head, looking down at the floor. Now, tighten your abs and hold.", 90, "floor");
        Exercise exercise3 = new Exercise("Squats", "Stand with feet a little wider than shoulder-width apart, hips stacked over knees, and knees over ankles. Extend arms out straight so they are parallel with the ground, palms facing down.  Goto a squat and exhale, then explode back up to standing, driving through heels.", 45, "standup");
        Exercise exercise4 = new Exercise("Backward Kick", "Get in an all-fours position with your knees and hands on the floor. Your back is straight. Lift your leg up, and straighten it. Form a 90 degree angle in the ankle.  Raise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs. Return to the starting position and repeat.", 60, "floor");
        Exercise exercise5 = new Exercise("Leg Curl", "Get in an all-fours position with your knees and hands on the floor. Your back is straight. Lift your leg up, and straighten it. Form a 90 degree angle in the ankle.  Raise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs. Return to the starting position and repeat.", 90, "standup");
        Exercise exercise6 = new Exercise("Sidewards Back Stretch", "Go into standing position, put your hands on your hips and then stretch with one hand over your head to the opposite side. Repeat with other hand.", 60, "standup");

        exercisesList.add(exercise1);
        exercisesList.add(exercise2);
        exercisesList.add(exercise3);
        exercisesList.add(exercise4);
        exercisesList.add(exercise5);
        exercisesList.add(exercise6);

        for(Exercise obj : exercisesList){
            obj.print();
        }

        System.out.printf("Exercises that are on the floor: %n");
        for(Exercise obj : exercisesList){
            if(obj.position == "floor"){
                System.out.printf("-%s %n", obj.name);
            }
        }

        System.out.printf("%nExercises that are on the floor and take more than a minute: %n");
        for(Exercise obj : exercisesList){
            if(obj.position == "floor" && obj.duration > 60){
                System.out.printf("-%s %n", obj.name);
            }
        }

        IntervalWorkout workout = new IntervalWorkout(exercise1, exercise3, exercise2);
        workout.print();


    }
}