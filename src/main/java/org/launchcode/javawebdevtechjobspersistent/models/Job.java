package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

//    @Id
//    @GeneratedValue
//    private int id;
//
//    private String name;

    @ManyToOne
    private Employer employer;

//    private String skills;
    private List<Skill> skill = new ArrayList<>();

    public Job() {
    }

    public Job(Employer employer, List<Skill> skill) {
        this.employer = employer;
        this.skill = skill;
    }

//    public Job(Employer employer, String someSkills) {
//        super();
//        this.employer = employer;
//        this.skills = someSkills;
//    }

    // Getters and setters.

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

//    public String getEmployer() {
//        return employer;
//    }
//
//    public void setEmployer(String employer) {
//        this.employer = employer;
//    }


    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkill() {
        return skill;
    }

    public void setSkill(List<Skill> skill) {
        this.skill = skill;
    }

//    public String getSkills() {
//        return skills;
//    }
//
//    public void setSkills(String skills) {
//        this.skills = skills;
//    }
}
