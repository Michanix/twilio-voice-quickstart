package com.assignment.makephonecall;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;

import java.net.URI;

public class Main {
    public static void main(String[] args) {
        PhoneCallCredentials credentials = new PhoneCallCredentials();
        Twilio.init(credentials.getACC_SID(), credentials.getAUTH_TOKEN());

        // Phone numbers should be in E.164 format
        // more info: https://www.twilio.com/docs/glossary/what-e164
        String from = "+1 201 340 9432";
        String to   = credentials.getMY_PHONE_NUMBER();

        try {
            Call call = Call.creator(
                    new PhoneNumber(to),
                    new PhoneNumber(from),
                    URI.create("http://demo.twilio.com/docs/voice.xml")).create();
            // printing call status and SID to confirm that phone call succeeded
            System.out.printf("Status: %s\nCall SID: %s\n",
                    call.getStatus(), call.getSid());

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
