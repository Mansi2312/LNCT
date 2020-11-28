package com.example.lnct_connect;

public class AddVariantClass {
    String name, company, email;

    public AddVariantClass() {

    }

    public AddVariantClass(String name, String company, String email) {
        this.name = name;
        this.company = company;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
