package com.agroho.restbarta.restbartamobile.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

/**
 * Created by rezaul on 11/24/16.
 */



public class Child {

    @SerializedName("id")
    private Long id;
    @SerializedName("created")
    private Date created;
    @SerializedName("lastUpdated")
    private Date lastUpdated;
    @SerializedName("name")
    private String name;
    @SerializedName("age")
    private float age;
    @SerializedName("birthDate")
    private Date birthDate;
    @SerializedName("childResponseQuestions")
    private List<ChildResponseQuestion> childResponseQuestions;
    @SerializedName("appResult")
    private boolean appResult;
    @SerializedName("doctorNote")
    private String doctorNote;
    @SerializedName("doctorResult")
    private boolean doctorResult;
    @SerializedName("parent")
    private Parent parent;


    public Child (String name, float age, List<ChildResponseQuestion> childResponseQuestions, Parent parent) {
        this.name = name;
        this.age = age;
        this.childResponseQuestions = childResponseQuestions;
        this.parent = parent;

    }

    public Child(Long id, Date created, Date lastUpdated, String name, float age, Date birthDate, boolean appResult, List<ChildResponseQuestion> childResponseQuestions, String doctorNote, boolean doctorResult) {
        this.id = id;
        this.created = created;
        this.lastUpdated = lastUpdated;
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        this.childResponseQuestions = childResponseQuestions;
        this.appResult = appResult;
        this.doctorNote = doctorNote;
        this.doctorResult = doctorResult;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public List<ChildResponseQuestion> getChildResponseQuestions() {
        return childResponseQuestions;
    }

    public void setChildResponseQuestions(List<ChildResponseQuestion> childResponseQuestions) {
        this.childResponseQuestions = childResponseQuestions;
    }

    public boolean isAppResult() {
        return appResult;
    }

    public void setAppResult(boolean appResult) {
        this.appResult = appResult;
    }

    public String getDoctorNote() {
        return doctorNote;
    }

    public void setDoctorNote(String doctorNote) {
        this.doctorNote = doctorNote;
    }

    public boolean isDoctorResult() {
        return doctorResult;
    }

    public void setDoctorResult(boolean doctorResult) {
        this.doctorResult = doctorResult;
    }
}
