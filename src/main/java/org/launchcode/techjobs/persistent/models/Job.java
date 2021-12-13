package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{
    @ManyToOne
    private Employer employer;

    @ManyToMany
    @NotEmpty(message = "Must select at least one skill!")
    private List<Skill> skills = new ArrayList<> ();
//    @Id
//    @GeneratedValue
//    private int id;
//
//    private String name;
//
//    private String employer;
//    private String skills;

    public Job() {
    }

    public Job(Employer employer, List<Skill> skills) {
        super();
        this.employer = employer;
        this.skills = skills;
    }

    // Getters and setters.

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
