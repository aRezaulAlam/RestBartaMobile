package com.agroho.restbarta.restbartamobile.model;


import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class ChildResponseQuestion{
    @SerializedName("id")
    private Long id;
    @SerializedName("created")
    private Date created;
    @SerializedName("lastUpdated")
    private Date lastUpdated;
    @SerializedName("respondedQuestionId")
    private int respondedQuestionId;
    @SerializedName("userResponse")
    private boolean userResponse;

    public ChildResponseQuestion(int respondedQuestionId, boolean userResponse) {
        this.respondedQuestionId = respondedQuestionId;
        this.userResponse = userResponse;
    }

    public ChildResponseQuestion(Long id, Date created, Date lastUpdated, int respondedQuestionId, boolean userResponse) {
        this.id = id;
        this.created = created;
        this.lastUpdated = lastUpdated;
        this.respondedQuestionId = respondedQuestionId;
        this.userResponse = userResponse;
    }

    public int getRespondedQuestionId() {
        return respondedQuestionId;
    }

    public void setRespondedQuestionId(int respondedQuestionId) {
        this.respondedQuestionId = respondedQuestionId;
    }

    public boolean isUserResponse() {
        return userResponse;
    }

    public void setUserResponse(boolean userResponse) {
        this.userResponse = userResponse;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
