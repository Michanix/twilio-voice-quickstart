package com.assignment.makephonecall;

public class PhoneCallCredentials {
    private final String ACC_SID = System.getenv("TWILIO_ACCOUNT_SID");
    private final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");
    private final String MY_PHONE_NUMBER = System.getenv("MY_PHONE_NUMBER");

    public String getACC_SID() {
        return ACC_SID;
    }

    public String getAUTH_TOKEN() {
        return AUTH_TOKEN;
    }

    public String getMY_PHONE_NUMBER() { return MY_PHONE_NUMBER; }
}
