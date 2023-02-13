package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id && Objects.equals(name, job.name) && Objects.equals(employer, job.employer) && Objects.equals(location, job.location) && Objects.equals(positionType, job.positionType) && Objects.equals(coreCompetency, job.coreCompetency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }

    @Override
    public String toString() {


            String finalString = "\n"+ "ID: "+this.id+"\n";

            if (this.name == "" || this.name == null) {
                finalString = finalString + "Name: Data not available\n";
            } else {
                finalString = finalString + "Name: " + this.name + "\n";
            }

        if (this.getEmployer().toString() == "" || this.getEmployer().toString() == null) {
            finalString = finalString + "Employer: Data not available\n";
        } else {
            finalString = finalString + "Employer: " + this.employer + "\n";
        }

        if (this.getLocation().toString() == "" || this.getLocation().toString() == null) {
            finalString = finalString + "Location: Data not available\n";
        } else {
            finalString = finalString + "Location: " + this.location + "\n";
        }

        if (this.getPositionType().toString() == "" || this.getPositionType().toString() == null) {
            finalString = finalString + "Position Type: Data not available\n";
        } else {
            finalString = finalString + "Position Type: " + this.positionType + "\n";
        }

        if (this.getCoreCompetency().toString() == "" || this.getCoreCompetency().toString() == null) {
            finalString = finalString + "Core Competency: Data not available\n"+"\n";
        } else {
            finalString = finalString + "Core Competency: " + this.coreCompetency + "\n"+"\n";
        }

        return finalString;




            //return "\n" +
                    //"ID: " + this.id + "\n" +
                    //"Name: " + this.name + "\n" +
                    //"Employer: " + this.employer + "\n" +
                    //"Location: " + this.location + "\n" +
                    //"Position Type: " + this.positionType + "\n" +
                    //"Core Competency: " + this.coreCompetency + "\n" +
                    //"\n";

    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getId() {
        return id;
    }


}
