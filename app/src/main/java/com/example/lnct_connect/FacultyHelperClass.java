package com.example.lnct_connect;

public class FacultyHelperClass {
    String id,password;

    public FacultyHelperClass() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public FacultyHelperClass(String id, String password) {
        this.id = id;
        this.password = password;
    }
}
