package com.example.lnct_connect;

public class AddResumeClass {
    String name, email, qualification,skill;

    public AddResumeClass(String name, String email, String qualification, String skill) {
        this.name = name;
        this.email = email;
        this.qualification = qualification;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public AddResumeClass() {
    }
}
