package com.example.workoutsadviser;

import java.util.ArrayList;
import java.util.List;

public class WorkoutExpert {


    List<String> getWorkouts (String workouttypes)
    {
        List<String> workout = new ArrayList<String>();
        if(workouttypes.equals("Chest"))
        {
            workout.add("Bench Press");
            workout.add("Cable Flys");
        }
        else if(workouttypes.equals("Triceps"))
        {
            workout.add("Triceps Ext");
            workout.add("Triceps PushDowns");
        }
        else if(workouttypes.equals("Shoulder"))
        {
            workout.add("Shoulder press");
            workout.add("Triceps PushDowns");
        }
        else if(workouttypes.equals("Biceps"))
        {
            workout.add("Bicep Curls");
        }
        return workout;
    }
}
