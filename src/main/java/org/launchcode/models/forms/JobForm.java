package org.launchcode.models.forms;

import org.launchcode.models.*;
import org.launchcode.models.data.JobData;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;

/**
 * Created by LaunchCode
 */
public class JobForm {

    @NotNull
    @Size(min=1, message = "Name may not be empty")
    private String name;

    @NotNull
    private int employerId;
    private String employerValue;

    private int locationId;
    private String locationValue;

    private int positionTypeId;
    private String positionTypeValue;

    private int coreCompetencyId;
    private String coreCompetencyValue;

    @NotNull
    private int newJobId;

    private int id;
    public int getId() { return id; }
    public void setId(int id) {
        this.id = id;
    }

    private JobFieldType type;

    //public enum JobFieldType;


    /*
        TODO #3 - Include other fields needed to create a job,
        with correct validation attributes and display names.
        Don't forget to add getters and setters

     */

    private ArrayList<Employer> employers;
    private ArrayList<Location> locations;
    private ArrayList<CoreCompetency> coreCompetencies;
    private ArrayList<PositionType> positionTypes;

    public JobForm() {

        JobData jobData = JobData.getInstance();

        /*

            TODO #4 - populate the other ArrayList collections needed in the view
        */

        employers = jobData.getEmployers().findAll();
        locations = jobData.getLocations().findAll();
        coreCompetencies = jobData.getCoreCompetencies().findAll();
        positionTypes = jobData.getPositionTypes().findAll();

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public JobFieldType getType() { return type; }
    public void setType(JobFieldType type) { this.type = type; }

    public int getNewJobId() {
        return newJobId;
    }
    public void setNewJobId(int newJobId) {
        this.newJobId = newJobId;
    }

    public ArrayList<Employer> getEmployers() { return employers; }
    public void setEmployers(ArrayList<Employer> employers) { this.employers = employers; }

    public int getEmployerId() {
        return employerId;
    }
    public void setEmployerId(int employerId) {
        this.employerId = employerId;
    }

    public String getEmployerValue() {  return employerValue; }
    public void setEmployerValue(String employerValue) { this.employerValue = employerValue; }


    public ArrayList<Location> getLocations() { return locations; }
    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }

    public int getLocationId() {
        return locationId;
    }
    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getLocationValue() { return locationValue; }
    public void setLocationValue(String locationValue) {  this.locationValue = locationValue; }


    public ArrayList<PositionType> getPositionTypes() {
        return positionTypes;
    }
    public void setPositionTypes(ArrayList<PositionType> positionTypes) { this.positionTypes = positionTypes; }

    public int getPositionTypeId() { return positionTypeId; }
    public void setPositionTypeId(int positionTypeId) { this.positionTypeId = positionTypeId; }

    public String getPositionTypeValue() { return positionTypeValue; }
    public void setPositionTypeValue(String positionTypeValue) {  this.positionTypeValue = positionTypeValue; }


    public ArrayList<CoreCompetency> getCoreCompetencies() { return coreCompetencies; }
    public void setCoreCompetencies(ArrayList<CoreCompetency> coreCompetencies) { this.coreCompetencies = coreCompetencies; }

    public int getCoreCompetencyId() {
        return coreCompetencyId;
    }

    public void setCoreCompetencyId(int coreCompetencyId) {
        this.coreCompetencyId = coreCompetencyId;
    }

    public String getCoreCompetencyValue() { return coreCompetencyValue; }
    public void setCoreCompetencyValue(String coreCompetencyValue) {  this.coreCompetencyValue = coreCompetencyValue; }

}
