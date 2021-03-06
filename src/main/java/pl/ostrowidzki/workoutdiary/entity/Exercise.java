package pl.ostrowidzki.workoutdiary.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long exerciseId;
    private Double weight;
    private String description;
    private Integer numberOfSets;
    private Integer numberOfReps;

    @ManyToMany(mappedBy = "exercises")
    private Set<Workout> workouts = new HashSet<>();

    public Exercise(Double weight, String description, Integer numberOfSets, Integer numberOfReps, Set<Workout> workouts) {
        this.weight = weight;
        this.description = description;
        this.numberOfSets = numberOfSets;
        this.numberOfReps = numberOfReps;
        this.workouts = workouts;
    }

    public Exercise() {
    }

    public Long getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(Long exerciseId) {
        this.exerciseId = exerciseId;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNumberOfSets() {
        return numberOfSets;
    }

    public void setNumberOfSets(Integer numberOfSets) {
        this.numberOfSets = numberOfSets;
    }

    public Integer getNumberOfReps() {
        return numberOfReps;
    }

    public void setNumberOfReps(Integer numberOfReps) {
        this.numberOfReps = numberOfReps;
    }

    public Set<Workout> getWorkouts() {
        return workouts;
    }

    public void setWorkouts(Set<Workout> workouts) {
        this.workouts = workouts;
    }
}

