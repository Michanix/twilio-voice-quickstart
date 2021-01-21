package com.assignment.makephonecall;

public class MakePhoneCall {
    private final String ACC_SID = System.getenv("TWILIO_ACCOUNT_SID");
    private final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

    public String getACC_SID() {
        return ACC_SID;
    }

    public String getAUTH_TOKEN() {
        return AUTH_TOKEN;
    }
}
