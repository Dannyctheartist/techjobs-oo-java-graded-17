package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private final int id;
    private static int nextId = 1;


    // Fields specific to Job
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // No argument constructor to initialize unique ID
    public Job() {
        this.id = nextId; // Assigns a unique ID
        nextId++; // Increment nextId for the next instance
    }

    // Full constructor initializing all fields
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this(); // Calls the no-argument constructor to initialize 'id'
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // toString method to format the output of a Job object
    @Override
    public String toString() {
        String result = System.lineSeparator() +
                "ID: " + id + System.lineSeparator() +
                "Name: " + (name.isEmpty() ? "Data not available" : name) + System.lineSeparator() +
                "Employer: " + (employer == null || employer.getValue().isEmpty() ? "Data not available" : employer.getValue()) + System.lineSeparator() +
                "Location: " + (location == null || location.getValue().isEmpty() ? "Data not available" : location.getValue()) + System.lineSeparator() +
                "Position Type: " + (positionType == null || positionType.getValue().isEmpty() ? "Data not available" : positionType.getValue()) + System.lineSeparator() +
                "Core Competency: " + (coreCompetency == null || coreCompetency.getValue().isEmpty() ? "Data not available" : coreCompetency.getValue()) + System.lineSeparator();
        return result;
    }

    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (!(o instanceof Job job)) return false;
        return id == job.id;
    }

    // Equals and hashCode methods specific to ID
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

        //Getters for fields specific to Job
        public int getId () {
            return id;
        }

        public String getName () {
            return name;
        }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public void setName (String name){
            this.name = name;
        }




        // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
        //  other five fields. The second constructor should also call the first in order to initialize
        //  the 'id' field.

        // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
        //  match.

        // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
        //  and id.
    }

