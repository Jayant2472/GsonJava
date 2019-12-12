package org.toon.gsonjava;

public class DashboardResponse {
    private String status;
    private String userType;
    private String statusCode;
    private String message;
    private DashboardResponseData responseData;
    private String mastersData;
    private String extra;
    private String extra1;

    @Override
    public String toString() {
        return "DashboardResponse{" +
                "status='" + status + '\'' +
                ", userType='" + userType + '\'' +
                ", statusCode='" + statusCode + '\'' +
                ", message='" + message + '\'' +
                ", responseData=" + responseData +
                ", mastersData='" + mastersData + '\'' +
                ", extra='" + extra + '\'' +
                ", extra1='" + extra1 + '\'' +
                '}';
    }

    public DashboardResponse(String status, String userType, String statusCode, String message, DashboardResponseData responseData, String mastersData, String extra, String extra1) {
        this.status = status;
        this.userType = userType;
        this.statusCode = statusCode;
        this.message = message;
        this.responseData = responseData;
        this.mastersData = mastersData;
        this.extra = extra;
        this.extra1 = extra1;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DashboardResponseData getResponseData() {
        return responseData;
    }

    public void setResponseData(DashboardResponseData responseData) {
        this.responseData = responseData;
    }

    public String getMastersData() {
        return mastersData;
    }

    public void setMastersData(String mastersData) {
        this.mastersData = mastersData;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getExtra1() {
        return extra1;
    }

    public void setExtra1(String extra1) {
        this.extra1 = extra1;
    }
}