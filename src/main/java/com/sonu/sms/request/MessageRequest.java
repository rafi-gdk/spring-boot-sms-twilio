package com.sonu.sms.request;

public class MessageRequest {

    private String accountSID;
    private String authToken;
    private String srcPhoneNumber;
    private String trgtPhoneNumber;
    private String message;

    public String getAccountSID() {
        return accountSID;
    }

    public void setAccountSID(String accountSID) {
        this.accountSID = accountSID;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getSrcPhoneNumber() {
        return srcPhoneNumber;
    }

    public void setSrcPhoneNumber(String srcPhoneNumber) {
        this.srcPhoneNumber = srcPhoneNumber;
    }

    public String getTrgtPhoneNumber() {
        return trgtPhoneNumber;
    }

    public void setTrgtPhoneNumber(String trgtPhoneNumber) {
        this.trgtPhoneNumber = trgtPhoneNumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}