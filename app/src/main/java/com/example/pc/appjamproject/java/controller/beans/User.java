package com.example.pc.appjamproject.java.controller.beans;

import com.orm.SugarRecord;

/**
 * Created by baehyeonbin on 2017. 12. 17..
 */

public class User extends SugarRecord {
    private String username;
    private String password;
    private String isAdmin;
    private String position;
    private String schoolName;
    private String className;

    public User() {}

    public User(String username, String password, String isAdmin, String position, String schoolName, String className) {
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.position = position;
        this.schoolName = schoolName;
        this.className = className;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
