package com.example.requitionpage.Model;

import com.example.requitionpage.Global.RequestStatus;

import java.io.Serializable;

public class RequestModel implements Serializable {
    String RequestNumber;
    RequestStatus requestStatus;
    String Description;
    public String getRequestNumber() {
        return RequestNumber;
    }

    public void setRequestNumber(String requestNumber) {
        RequestNumber = requestNumber;
    }

    public RequestStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

}
